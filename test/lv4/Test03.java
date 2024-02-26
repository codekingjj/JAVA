package test.lv4;

import java.util.Arrays;
import java.util.Scanner;

//시작 시간 11:30
//종료 시간 12:39
//소요 시간 01:09
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 쇼핑몰 [관리자] - 벡터로 규현 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다. 2. 카테고리는 각 행의 첫번째 열에
		 * 저장한다.( 중복 예외처리) 3. 아이템은 각 행의 두번째 열에 저장한다. 단, 아이템은 여러개를 추가할 수 있도록 슬래시(/)를 구분자로
		 * 연결해준다. 예) { {"과일", "사과/포도/"},
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int itemCount = 0;
		String[][] item = null;

		while (true) {
			System.out.println("메뉴를 선택해 주세요 : ");
			System.out.println("1) 카테고리 추가");
			System.out.println("2) 아이템 추가");
			int sel = scan.nextInt();
			if (sel == 1) {
				boolean newCategory = true;
				System.out.println("카테고리를 입력해주세요 : ");
				String category = scan.next();
				if (item == null) {
					item = new String[itemCount + 1][2];
					item[itemCount][0] = category;
					itemCount++;
				} else {
					for (int i = 0; i < itemCount; i++) {
						if (item[i][0].equals(category)) {
							System.out.println("이미 존재하는 카테고리 입니다.");
							newCategory = false;
						}
					}
					if (newCategory) {
						String[][] tmp = item;
						item = new String[itemCount + 1][2];
						for (int i = 0; i < itemCount; i++) {
							item[i][0] = tmp[i][0];
							item[i][1] = tmp[i][1];
						}
						item[itemCount][0] = category;
						itemCount++;
					}
				}
			} else if (sel == 2) {
				System.out.println("아이템을 입력할 카테고리를 입력해주세요 : ");
				String category = scan.next();
				boolean isCategory = true;
				int tmp = -1;
				for (int i = 0; i < itemCount; i++) {
					if (item[i][0].equals(category)) {
						tmp = i;
						isCategory = true;
						break;
					} else {
						isCategory = false;
					}
				}
				if (isCategory) {
					System.out.println("아이템을 입력해 주세요 : ");
					String itemName = scan.next();
					if (item[tmp][1] == null) {
						item[tmp][1] = itemName + "/";
					} else {
						item[tmp][1] = item[tmp][1] + itemName + "/";
					}
				} else {
					System.out.println("존재하지 않는 카테고리입니다.");
				}
			}
			for (int i = 0; i < itemCount; i++) {
				System.out.println(item[i][0] + ", " + item[i][1]);
			}
//			System.out.println("카테고리를 입력해주세요 : ");
//			String category = scan.next();
//			System.out.println("아이템을 입력해 주세요 : ");

		}

	}
}