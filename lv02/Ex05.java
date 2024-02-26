package lv02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 영수증 출력[2단계] 1. 5번 주문을 받는다. 2. 주문이 끝난 후, 돈을 입력받는다. 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예) 메뉴 선택 : 1 메뉴 선택 : 2 메뉴 선택 : 2 메뉴 선택 : 3 총 금액 = 31300원 현금 입력 : 32000 ===
		 * 롯데리아 영수증=== 1. 불고기 버거 : 2개 2. 새우 버거 : 2개 3. 콜 라 : 1개 4 총 금 액 : 31300원 5. 잔 돈
		 * : 700원
		 */

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		Scanner scan = new Scanner(System.in);
		// 메뉴판
		System.out.println("===롯데리아===");
		System.out.println("1. 불고기 버거 ");
		System.out.println("2. 새우	버거");
		System.out.println("3. 콜	라");
		System.out.println("4. 주문 하고싶은거 없음.\n");
		System.out.println("총 다섯번의 주문을 받겠습니다! 주문하고 싶은 메뉴가 없으시면 4번을 눌러주세요~!");

		// 주문입력 5번, 주문수량별 합계변화
		int n = 1;
		int vulBurger = 0;
		int shrimpBurger = 0;
		int coke = 0;
		while (n <= 5) {
			System.out.println("원하시는 메뉴의 번호를 입력해 주세요~!");
			System.out.println("메뉴 선택 : ");
			int orderNum = scan.nextInt();
			if (orderNum >= 1 && orderNum <= 4) {
				if (orderNum == 1) {
					vulBurger += 1;
				} else if (orderNum == 2) {
					shrimpBurger += 1;
				} else if (orderNum == 3) {
					coke += 1;
				} else if (orderNum == 4) {
					System.out.println("");
				}
			} else {
				System.out.println("유효한 값이 아닙니다. 다시 입력해 주십시오.");
				n -= 1;
			}
			n += 1;
		}
		int sum = (price1 * vulBurger) + (price2 * shrimpBurger) + (price3 * coke);
		System.out.println("지불하실 금액을 입력하세요 : ");
		int cost = scan.nextInt();
		if (cost < sum) {
			System.out.println("현금이 부족합니다. 처음부터 다시 이용해 주십시오.");
		} else if (cost >= sum) {
			System.out.println("=== 롯데리아 영수증");
			System.out.printf("1. 불고기	버거 : %d개\n", vulBurger);
			System.out.printf("2. 새우	버거 : %d개\n", shrimpBurger);
			System.out.printf("3. 콜		라 : %d개\n", coke);
			System.out.printf("4. 총	금	액 : %d원\n", sum);
			System.out.printf("5. 잔	돈 : %d원", cost - sum);
		}

	}

}
