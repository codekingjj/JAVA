package lv04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #쇼핑몰 [관리자] 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다. 2. 카테고리는 각 행의 첫번째 열에 저장한다. (중복
		 * 예외처리) 3. 아이템은 각 행의 두번째 열에 저장한다. 단, 아이템은 여러개를 추가할 수 있도록 슬래시(/)를 구분자로 연결해준다. 예)
		 * { {"과일", "사과/포도/"}, {"과자", "홈런볼/쪼리퐁/"}, {"음료", "콜라/"}, {"육류", "소고리/"} ... }
		 */
		Scanner scan = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;

		while (true) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템 관리");
			System.out.println("[3]전체품목 출력");

			System.out.println(": ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("추가할 카테고리 입력 : ");
				String category = scan.next();
				boolean isValue = true;
				for (int i = 0; i < itemCount + 1; i++) {
					if (items[i][0].equals(category)) {
						System.out.println("중복된 카테고리가 있습니다.");
						isValue = false;
					}
				}
				if (isValue) {
					items[itemCount][0] = category;
					itemCount++;
				}

			} else if (sel == 2) {
				System.out.println("아이템을 입력할 카테고리를 입력해주세요 : ");
				{
					String categoryName = scan.next();
					System.out.println("추가할 아이템을 입력해주세요 : ");
					String item = scan.next();
					boolean isNotcategory = true;
					for (int i = 0; i < itemCount; i++) {
						if (items[i][0].equals(categoryName)) {
							items[i][1] += item + "/";
							isNotcategory = false;
						}
					}
					if (isNotcategory) {
						System.out.println("해당 카테고리가 없습니다.");
					}
				}
			} else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.print(items[i][0]);
					System.out.print(" : ");
					System.out.print(items[i][1]);
					System.out.println();
				}
			}
		}
	}

}
