package lv05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final String ADMIN = "admin";

		int jangCount = 0;
		int[][] jang = null; // {log, itemNum}

		int count = 1;
		String[] ids = { "admin" };
		String[] pws = { "1234" };

		int itemCount = 3;
		String[] items = { "사과", "바나나", "딸기" };

		String jangFileName = "jang.txt"; // 자동 저장 및 로드
		String userFileName = "user.txt";

		File filejang = new File(jangFileName);
		File fileuser = new File(userFileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		int log = -1;

		
		
		
		
		while (true) {
			boolean isUserUpdate = false;
			boolean isJangUpdate = false;
			System.out.println(Arrays.toString(ids));
			System.out.println(Arrays.toString(pws));
			System.out.println("[SHOP]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]쇼핑");
			System.out.println("[6]장바구니");
			System.out.println("[7]관리자"); // 아이템 추가, 아이템 삭제
			System.out.println("[0]종료");

			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1 && log == -1) {
				System.out.println("id : ");
				String id = scan.next();
				System.out.println("pw : ");
				String pw = scan.next();

				boolean isDupl = false;
				for (int i = 0; i < count; i++) {
					if (id.equals(ids[i])) {
						isDupl = true;
					}
				}
				if (!isDupl) {
					String[] tmpIds = ids;
					String[] tmpPws = pws;

					ids = new String[count + 1];
					pws = new String[count + 1];

					for (int i = 0; i < count; i++) {
						ids[i] = tmpIds[i];
						pws[i] = tmpPws[i];
					}
					ids[count] = id;
					pws[count] = pw;

					count++;
				} else {
					System.out.println("중복된 계정이 존재합니다.");
				}

				
				isUserUpdate = true;
			} else if (sel == 2 && log != -1) {
				if (log == 0) {
					System.out.println("관리자는 탈퇴할 수 없습니다.");
					continue;
				}
				System.out.println("비밀번호를 입력하세요 : ");
				String pw = scan.next();

				if (pw.equals(pws[log])) {
					int x = 0;
					String[] tmpIds = ids;
					String[] tmpPws = pws;
					ids = new String[count - 1];
					pws = new String[count - 1];
					for (int i = 0; i < count; i++) {
						if (i == log) {
							continue;
						}
						ids[x] = tmpIds[i];
						pws[x] = tmpPws[i];
						x++;
					}
					log = -1;
				}
				isUserUpdate = true;
				isJangUpdate = true;
			} else if (sel == 3 && log == -1) {
				System.out.println("id :");
				String id = scan.next();
				System.out.println("pw : ");
				String pw = scan.next();

				for (int i = 0; i < count; i++) {
					if (id.equals(ids[i]) && pw.equals(pws[i])) {
						log = i;
					}
				}
				if (log == -1) {
					System.out.println("회원정보를 확인해 주세요.");
				}
			} else if (sel == 4 && log != -1) {
				System.out.println("로그아웃 되었습니다.");
				log = -1;
			} else if (sel == 5 && log != -1) {
				for (int i = 0; i < itemCount; i ++) {
					System.out.printf("%d) %s\n", i + 1, items[i]);
				}
				System.out.println("고를 아이템의 번호를 입력해주세요 : ");
				int num = scan.nextInt();
				if (num == 0 || num > itemCount) {
					continue;
				}
				int[][] tmpJang = jang;
				jang = new int[jangCount + 1][2];
				for (int i = 0; i < jangCount; i++) {
					jang[i][0] = tmpJang[i][0];
					jang[i][1] = tmpJang[i][1]; 
				}
				jang[jangCount][0] = log;
				jang[jangCount][1] = num;
				
				isJangUpdate = true;
			} else if (sel == 6 && log != -1) {
				int[] tempCount = new int[itemCount];
				
				for(int i = 0; i<jangCount; i++) {
					int itemIdx = jang[i][1]-1;
					if(jang[i][0] == log) {
						tempCount[itemIdx] ++;
					}
				}
				
				for(int i = 0; i <itemCount;i++) {
					if(tempCount[i] > 0) {
						System.out.printf("%s) %d개\n", items[i], tempCount[i]);
					}
				}
			} else if (sel == 7) {
				if(!ids[log].equals(ADMIN)) {
					System.out.println("관리자 계정만 이용가능합니다.");
					continue;
				}
				while(true) {
					System.out.println("1) 아이템 추가");
					System.out.println("2) 아이템 삭제");
					System.out.println("0) 뒤로 가기");
					System.out.println("메뉴 : ");
					int subsel = scan.nextInt();
					
					if (subsel == 0) {
						break;
					}
					
					if (subsel == 1) {
						System.out.println("아이템명 : ");
						String itemName = scan.next();
						
						boolean isDupl = false;
						for (int i = 0; i <itemCount; i++) {
							if(itemName.equals(items[i])) {
								isDupl = true;
							}
						}
						if (isDupl) {
							System.out.println("중복된 아이템 항목이 존대합니다.");
							continue;
						}
						
						String[] tempItems = items;
						items = new String[itemCount +1];
						
						for(int i =0; i<itemCount; i++) {
							items[i] = tempItems[i];
						}
						items[itemCount ++] = itemName;
						
						System.out.println("아이템 추가 완료");
					}
					else if (subsel == 2) {
						for(int i =0; i<itemCount; i++) {
							System.out.printf("%d) %s\n", i+1, items[i]);
						}
						System.out.println("삭제할 아이템 번호 : ");
						int delIdx = scan.nextInt() -1;
						
						if (delIdx < 0 || delIdx >= itemCount) {
							continue;
						}
						
						String[] tempItems = items;
						items =new String[itemCount - 1];
						
						int idx = 0;
						for(int i=0; i<itemCount; i++) {
							if(i != delIdx) {
								items[idx ++] = tempItems[i];
							}
						}
						itemCount--;
						
						int delCnt = 0;
						for(int i =0; i<jangCount; i++) {
							if(jang[i][1] == delIdx +1) {
								delCnt ++;
							}
						}
						int[][] tempJang = jang;
						jang = new int[jangCount - delCnt][];
						
						idx = 0;
						for (int i = 0; i<jangCount; i++) {
							if(tempJang[i][1] > delIdx +1) {
								tempJang[i][1] -= 1;
							}
							if(tempJang[i][1] != delIdx +1) {
								jang[i] = tempJang[i];
							}
						}
						jangCount -= delCnt;
						
						isUserUpdate = true;
					}
				}
			} else if (sel == 0) {
				System.out.println("종료");
				break;
			}
			if(isUserUpdate) {
				//user.txt 저장
				String data = "";
				String dataItem = "";
				for (int i = 0; i< itemCount; i++) {
					if (i == itemCount - 1) {
						dataItem += items[i];
					} else {
						dataItem += items[i] + "\n";
					}
				}
				for (int i = 0; i < count; i++) {
					if (i == count - 1) {
						data += ids[i] + "/" + pws[i];
					} else {
						data += ids[i] + "/" + pws[i] + "\n";
					}
				}

				try {
					fw = new FileWriter(userFileName);
					fw.write(dataItem + "\n");
					fw.write(data);
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("저장 실패");
				}
			}
			
			if(isJangUpdate) {
				//jang.txt 저장
				String data = "";
				for(int i = 0; i < jangCount + 1; i++) {
					if (i == jangCount) {
						data += jang[i][0] + "/" + jang[i][1];
					}else {							
					data += jang[i][0] + "/" + jang[i][1] + "\n";
					}
				}
				jangCount ++;
				try {
					fw = new FileWriter(jangFileName);
					fw.write(data);
					fw.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
