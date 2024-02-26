package lv04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int cnt = 0; // 회원수
		String[] ids = null;
		String[] pws = null;
		int[][] jang = null;

		int size = 0; // 장바구니 길이
		int log = -1;

		String[] items = { "사과", "바나나", "딸기" };

		while (true) {
			for (int i = 0; i < cnt; i++) {
				System.out.println(ids[i]);
			}
			for (int i = 0; i < cnt; i++) {
				System.out.println(pws[i]);
			}
			System.out.println("[MEGA MART]");
			System.out.println("[1]회원가입");
			System.out.println("[2]탈퇴");
			System.out.println("[3]로 그 인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]쇼	핑");
			System.out.println("[6]장바구니");
			System.out.println("[0]종료");
			System.out.println("메뉴 선택 : ");
//			int sel = scan.nextInt();
//			if (sel == 1) {
			int sel = scan.nextInt();

			if (sel == 1 && log == -1) {
				System.out.println("id : ");
				String id = scan.next();
				System.out.println("pw : ");
				String pw = scan.next();

				boolean isDupl = false;
				for (int i = 0; i < cnt; i++) {
					if (ids[i].equals(id))
						isDupl = true;

				}

				if (!isDupl) {
					String[] tempIds = ids;
					String[] tempPws = pws;
					ids = new String[cnt + 1];
					pws = new String[cnt + 1];

					for (int i = 0; i < cnt; i++) {
						ids[i] = tempIds[i];
						pws[i] = tempPws[i];
					}
					ids[cnt] = id;
					pws[cnt] = pw;
					cnt++;
					System.out.println("회원가입 완료");
				} else {
					System.out.println("중복된 아이디입니다.");
				}

//				if (log == -1) {
//					boolean checkId = true;
//					ids = new String[cnt + 1];
//					pws = new String[cnt + 1];
//					String[] tmpId = new String[cnt + 1];
//					String[] tmpPw = new String[cnt + 1];
//					for (int i = 0; i < ids.length; i++) {
//						tmpId[i] = ids[i];
//					}
//					for (int i = 0; i < pws.length; i++) {
//						tmpPw[i] = pws[i];
//					}
//					System.out.println("아이디 입력 : ");
//					String inputId = scan.next();
//					for (int i = 0; i < cnt + 1; i++) {
//						if (inputId.equals(tmpId[i])) {
//							System.out.println("중복된 아이디가 존재합니다.");
//							checkId = false;
//							break;
//						}
//					}
//					if (checkId) {
//						System.out.println("비밀번호를 입력해주세요 : ");
//						String inputPw = scan.next();
//						tmpId[cnt] = inputId;
//						tmpPw[cnt] = inputPw;
//						for (int i = 0; i < cnt + 1; i++) {
//							ids[i] = tmpId[i];
//							pws[i] = tmpPw[i];
//						}
//						System.out.println("회원가입이 완료되었습니다.");
//						cnt++;
//					}
//				} else {
//					System.out.println("로그인 상태에서는 이용이 불가합니다.");
//				}
			} else if (sel == 2 && log != -1) {
				System.out.println("비밀번호 재확인 : ");
				String pw = scan.next();
				
				if(pw.equals(pws[log])) {
					String[] tempIds = ids;
					String[] tempPws = pws;
					
					ids = new String[cnt -1];
					pws = new String[cnt -1];
					
					int idx = 0;
					for(int i = 0; i<cnt; i++) {
						if(i != log) {
							ids[idx] = tempIds[i];
							pws[idx] = tempPws[i];
							idx ++;
						}
					}
				}
				cnt --;
				//장바구니에 남아있는 log 삭제
				int delCnt = 0;
				for(int i =0; i<size; i++) {
					if(jang[i][0] == log) {
						delCnt ++;
					}
				}
				
				int[][] temp = jang;
				jang = new int[size - delCnt][];
				
				int idx = 0;
				for(int i = 0; i< size; i++) {
					int tempLog = temp[i][0];
					if(tempLog != log) {
						if(tempLog > log) {
							temp[i][0] --;
							jang[idx++] = temp[i];
						}
						
					}
				}
				//기존 회원들의 log정보가 바뀌기 때문에,
				//log 기준 뒤에 있던 인덱스 정보들을 -1씩 차감
				log = -1;
				System.out.println("탈퇴 완료");
//				if (log >= 0) {
//					boolean checkId = true;
//					int tmp = -1;
//					System.out.println("아이디 입력 : ");
//					String inputId = scan.next();
//					for (int i = 0; i < cnt + 1; i++) {
//						if (inputId == ids[i]) {
//							tmp = i;
//							checkId = false;
//							break;
//						}
//					}
//					if (checkId) {
//						System.out.println("존재하지 않는 아이디입니다.");
//						break;
//					}
//					System.out.println("비밀번호를 입력해주세요 : ");
//					String inputPw = scan.next();
//					if (inputPw == pws[tmp]) {
//						System.out.println("탈퇴가 완료되었습니다.");
//						ids[tmp] = "";
//						pws[tmp] = "";
//						cnt--;
//					} else {
//						System.out.println("비밀번호가 일치하지 않습니다.");
//					}
//				} else {
//					System.out.println("로그아웃상태에서는 이용이 불가합니다.");
//				}
			} else if (sel == 3 && log == -1) {
				System.out.println("id : ");
				String id = scan.next();
				System.out.println("pw : ");
				String pw = scan.next();

				for (int i = 0; i < cnt; i++) {
					if (ids[i].equals(id) && pws[i].equals(pw)) {
						log = i;
					}
				}

				if (log == -1) {
					System.out.println("회원정보를 다시 확인하세요.");
				} else {
					System.out.printf("%s님 환영합니다.\n", ids[log]);
				}
//				if (log == -1) {
//					boolean checkId = true;
//					System.out.println("아이디를 입력해주세요 : ");
//					String inputId = scan.next();
//					System.out.println("비밀번호를 입력해주세요 : ");
//					String inputPw = scan.next();
//					for (int i = 0; i < cnt; i++) {
//						if (inputId.equals(ids[i])) {
//							log = i;
//							checkId = false;
//						}
//					}
//					if (checkId) {
//						System.out.println("아이디가 틀렸습니다.");
//						break;
//					}
//
//					if (inputPw.equals(pws[log])) {
//						System.out.println("로그인이 완료되었습니다.");
//					} else {
//						System.out.println("비밀번호가 틀렸습니다.");
//					}
//				} else {
//					System.out.println("로그인 상태에서는 이용이 불가합니다.");
//				}
			} else if (sel == 4 && log != -1) {
				log = -1;
				System.out.println("로그아웃 완료");
//				if (log >= 0) {
//					System.out.println("로그아웃 되었습니다.");
//					log = -1;
//				} else {
//					System.out.println("로그아웃 상태에서는 이용이 불가합니다.");
//				}

			} else if (sel == 5 && log != -1) {
				for (int i = 0; i < items.length; i++) {
					System.out.printf("%d) %s\n", i + 1, items[i]);
				}
				System.out.println("상품번호 : ");
				int itemNum = scan.nextInt();

				if (itemNum < 1 || itemNum > items.length) {
					continue;
				}

				int[][] temp = jang;
				jang = new int[size + 1][];

				for (int i = 0; i < size; i++)
					jang[i] = temp[i];
				jang[size] = new int[2];
				jang[size][0] = log;
				jang[size][1] = itemNum;
				size++;
//				System.out.println();
//				System.out.println("원하시는 메뉴를 담아주세요 : ");
//				System.out.println("0." + item[0]);
//				System.out.println("1." + item[1]);
//				System.out.println("2." + item[2]);
//				int inputItem = scan.nextInt();
//				if (inputItem >= 1 && inputItem <= 3) {
//					size++;
//					jang[size - 1][0] = log;
//					jang[size - 1][1] = inputItem;
//				} else {
//					System.out.println("해당 메뉴는 없습니다.");
//				}
			} else if (sel == 6 && log != -1) {
				int[] itemCnt = new int[items.length];

				boolean isEmpty = true;
				for (int i = 0; i < size; i++) {
					if (jang[i][0] == log) {
						int itemIdx = jang[i][1] - 1;
						itemCnt[itemIdx]++;
						isEmpty = false;
					}
				}
				System.out.printf("---%s님의 장바구니 내역 ---\n", ids[log]);
				for (int i = 0; i < itemCnt.length; i++) {
					if (itemCnt[i] > 0) {
						System.out.printf("%s %d개\n", items[i], itemCnt[i]);
					}
				}
				if (isEmpty) {
					System.out.println("텅-");
				}
//				int appleCount = 0;
//				int bananaCount = 0;
//				int strawberryCount = 0;
//				System.out.printf("id : %s [%d] 회원의 쇼핑 : \n", ids[log], log);
//				for (int i = 0; i < size; i++) {
//					if (jang[i][0] == log) {
//						if (jang[i][1] == 0) {
//							System.out.println("사과 구매");
//							appleCount++;
//						} else if (jang[i][1] == 1) {
//							System.out.println("바나나 구매");
//							bananaCount++;
//						} else if (jang[i][1] == 2) {
//							System.out.println("딸기 구매");
//							strawberryCount++;
//						}
//					}
//				}
//				System.out.println("사과 " + appleCount + "개");
//				System.out.println("바나나 " + bananaCount + "개");
//				System.out.println("딸기 " + strawberryCount + "개");
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
