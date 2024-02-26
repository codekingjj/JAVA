package test.lv4;

//시작 : 02:00
//종료 : 05:00
//소요 : 03:00
import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4.
		/*
		 * #쇼핑몰 [장바구니] 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다. 1) 사과 2) 바나나 3) 딸기 2.
		 * 번호를 선택해 상품을 장바구니에 담을 수 있다. 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다. 4. 해당 회원이 구매한
		 * 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다. 예) { {0, 1}, qwer회원 >사과구매 {1, 2}, javaking회원
		 * >바나나구매 {2, 1}, abcd회원 >사과구매 {0, 3}, qwer회원 >딸기구매 ...
		 */
		Scanner scan = new Scanner(System.in);

		int userCnt = 1;
		String[] ids = { "admin" };
		String[] pws = { "1234" };

		int jangCnt = 0;
		int[][] jang = null;

		int itemCnt = 3;
		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;
		while (true) {
			System.out.println("[MEGA MART]");
			System.out.println("[1] 회원가입");
			System.out.println("[2] 탈퇴");
			System.out.println("[3] 로그인");
			System.out.println("[4] 로그아웃");
			System.out.println("[5] 쇼핑");
			System.out.println("[6] 장바구니");
			System.out.println("[7] 관리자"); // admin/1234
			// [5-1] 아이템 추가
			// [5-2] 아이템 삭제
			System.out.println("[0] 회원가입");
			for (int i = 0; i < userCnt; i++) {
				System.out.print(ids[i]);
			}
			System.out.println();
			for (int i = 0; i < userCnt; i++) {
				System.out.print(pws[i]);
			}
			System.out.println();
			for (int i = 0; i < jangCnt; i++) {
				System.out.print(jang[i][0]);
				System.out.print(jang[i][1]);
				System.out.println();
			}
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					boolean newId = true;
					System.out.println("아이디를 입력하세요 : ");
					String id = scan.next();
					for (int i = 0; i < userCnt; i++) {
						if (id.equals(ids[i])) {
							System.out.println("이미 존재하는 아이디 입니다.");
							newId = false;
						}
					}
					if (newId) {
						System.out.println("비밀번호를 입력해 주세요 : ");
						String pw = scan.next();
						String[] tmpIds = ids;
						String[] tmpPws = pws;
						ids = new String[userCnt + 1];
						pws = new String[userCnt + 1];
						for (int i = 0; i < userCnt; i++) {
							ids[i] = tmpIds[i];
							pws[i] = tmpPws[i];
						}
						ids[userCnt] = id;
						pws[userCnt] = pw;
						userCnt++;
						System.out.println("회원가입이 완료되었습니다.");
					}
				} else {
					System.out.println("로그인 상태에서는 회원가입을 할 수 없습니다.");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그인 상태에서만 가능합니다.");
				} else if (log == 0) {
					System.out.println("관리자는 탈퇴하실 수 없습니다.");
				} else {
					System.out.println("비밀번호를 입력해주세요 : ");
					String pw = scan.next();
					if (pws[log].equals(pw)) {
						System.out.println("탈퇴가 완료되었습니다.");
						ids[log] = "";
						ids[log] = "";

						for (int i = log; i < userCnt - 1; i++) {
							String tmp = "";
							tmp = ids[i];
							ids[i] = ids[i + 1];
							ids[i + 1] = tmp;
							tmp = pws[i];
							pws[i] = pws[i + 1];
							pws[i + 1] = tmp;
						}
						String[] tmpIds = ids;
						String[] tmpPws = pws;
						ids = new String[userCnt - 1];
						pws = new String[userCnt - 1];
						for (int i = 0; i < userCnt - 1; i++) {
							ids[i] = tmpIds[i];
							pws[i] = tmpPws[i];
						}
						log = -1;
						userCnt--;
					}
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("아이디를 입력해주세요 : ");
					String id = scan.next();
					System.out.println("비밀번호를 입력해주세요 : ");
					String pw = scan.next();
					boolean isRight = true;
					int tmp = -1;
					for (int i = 0; i < userCnt; i++) {
						if (id.equals(ids[i])) {
							isRight = true;
							tmp = i;
							break;
						} else {
							isRight = false;
						}
					}
					if (isRight) {
						if (pw.equals(pws[tmp])) {
							System.out.println("로그인되었습니다.");
							log = tmp;
						}
					} else {
						System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
					}

				} else {
					System.out.println("이미 로그인 상태입니다.");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("이미 로그아웃 상태입니다.");
				} else {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("로그인 상태에서만 가능합니다.");
				} else {
					for (int i = 0; i < itemCnt; i++) {
						System.out.printf("%d) %s ", i + 1, items[i]);
					}
					System.out.println("\n장바구니에 담으실 아이템의 번호를 선택해주세요 : ");
					int num = scan.nextInt();

					if (num > 0 && num < itemCnt + 1) {
						if (jang == null) {
							jang = new int[jangCnt + 1][2];
							jang[jangCnt][0] = log;
							jang[jangCnt][1] = num;
							jangCnt++;
						} else {
							int[][] tmp = jang;
							jang = new int[jangCnt + 1][2];
							for (int i = 0; i < jangCnt; i++) {
								jang[i][0] = tmp[i][0];
								jang[i][1] = tmp[i][1];
							}
							jang[jangCnt][0] = log;
							jang[jangCnt][1] = num;
							jangCnt++;
						}
					} else {
						System.out.println("해당 메뉴는 없습니다.");
					}
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인 상태에서만 가능합니다.");
				} else {
					int[] count = new int[itemCnt];
					for (int i = 0; i < jangCnt; i++) {
						if (jang[i][0] == log) {
							int tmp = -1;
							tmp = jang[i][1];
							count[tmp - 1]++;
						}
					}
					for (int i = 0; i < itemCnt; i++) {
						System.out.printf("%s : %d개", items[i], count[i]);
						System.out.println();
					}
				}
			} else if (sel == 7) {
				if (log != 0) {
					System.out.println("관리자만 이용가능합니다.");
				} else if (log == 0) {
					boolean run = true;
					System.out.println("1) 아이템 추가");
					System.out.println("2) 아이템 삭제");
					int num = scan.nextInt();
					if (num == 1) {
						System.out.println("추가하실 아이템을 입력해주세요 : ");
						String newItem = scan.next();
						for (int i = 0; i < itemCnt; i++) {
							if (newItem.equals(items[i])) {
								System.out.println("중복된 아이템이 있습니다.");
								run = false;
								break;
							}
						}
						if (run) {
							String[] tmp = items;
							items = new String[itemCnt + 1];
							for (int i = 0; i < itemCnt; i++) {
								items[i] = tmp[i];
							}
							items[itemCnt] = newItem;
							itemCnt++;
							System.out.println(Arrays.toString(items));

						}
					} else if (num == 2) {
						boolean isItem = true;
						int index = -1;
						System.out.println(Arrays.toString(items));
						System.out.println("삭제하실 아이템을 입력하세요 : ");
						String delItem = scan.next();
						for (int i = 0; i < itemCnt; i++) {
							if (items[i].equals(delItem)) {
								isItem = true;
								index = i;
								break;
							} else {
								isItem = false;
							}
						}
						if (isItem) {
							items[index] = "";
							for (int i = index; i < itemCnt - 1; i++) {
								String x = "";
								x = items[i];
								items[i] = items[i + 1];
								items[i + 1] = x;
							}
							String[] tmp = items;
							items = new String[itemCnt - 1];
							for (int i = 0; i < itemCnt - 1; i++) {
								items[i] = tmp[i];
							}
							System.out.println(Arrays.toString(items));
							int count = 0;
							for (int i = 0; i < jangCnt; i++) {
								if (jang[i][1] == index + 1) {
									count++;
								}
							}
							int[][] tmpjang = jang;
							jang = new int[jangCnt - count][2];
							for (int i = 0; i < jangCnt; i++) {
								for (int j = 0; j < jangCnt - 1; j++) {
									if (tmpjang[j][1] == index + 1) {
										int x = 0;
										int y = 0;
										x = tmpjang[j][0];
										y = tmpjang[j][1];
										tmpjang[j][0] = tmpjang[j + 1][0];
										tmpjang[j][1] = tmpjang[j + 1][1];
										tmpjang[j + 1][0] = x;
										tmpjang[j + 1][1] = y;
									}
								}
							}
							for (int i = 0; i < jangCnt - count; i++) {
								jang[i][0] = tmpjang[i][0];
								jang[i][1] = tmpjang[i][1];
							}
							for (int i = 0; i < jangCnt - count; i++) {
								System.out.print(jang[i][0]);
								System.out.print(jang[i][1]);
								System.out.println();
							}
							for (int i = 0; i < jangCnt - count; i++) {
								if (jang[i][1] > index + 1) {
									jang[i][1]--;
								}
							}
							jangCnt -= count;
							itemCnt--;
						} else {
							System.out.println("해당 아이템은 존재하지 않습니다.");
						}
					}
				}
			} else if (sel == 0) {
				break;
			}
		}
	}

}
