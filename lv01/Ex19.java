package lv01;

import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다..
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("===롯데리아 ===");
		System.out.println("1. 불고기		버거 : " + price1 + "원");
		System.out.println("2. 새우		버거 : " + price2 + "원");
		System.out.println("3. 콜		라 : " + price3 + "원");
		
		System.out.println("원하시는 메뉴의 숫자를 입력하여 주세요. : ");
		int orderNum = scan.nextInt();
		
		System.out.println("지불할 금액을 입력해 주세요 : ");
		int price = scan.nextInt();
		
		if (orderNum == 1) {
			if (price < price1) {
				System.out.println("현금이 부족합니다.");
			}
			if (price >= price1) {
				System.out.println("------------------------------------");
				System.out.println("재정버거");
				System.out.println("주문금액 : " + price1 + "원");
				System.out.println("주문한 음식번호 : " + orderNum);
				System.out.println("지불한 금액 : " + price + "원");
				System.out.println("현금결제");
				System.out.println("거스름돈 :" + (price - price1));
				System.out.println("------------------------------------");
				System.out.println("가맹점명		                재정버거");
				System.out.println("사업자 번호			 111-11-11111");
				System.out.println("가맹점 번호 		  01057210413");
				System.out.println("대표자명				 이재정");
			}
		}
		if (orderNum == 2) {
			if (price < price2) {
				System.out.println("현금이 부족합니다.");
			}
			if (price >= price2) {
				System.out.println("------------------------------------");
				System.out.println("재정버거");
				System.out.println("주문금액 : " + price2 + "원");
				System.out.println("주문한 음식번호 : " + orderNum);
				System.out.println("지불한 금액 : " + price + "원");
				System.out.println("현금결제");
				System.out.println("거스름돈 :" + (price - price2));
				System.out.println("------------------------------------");
				System.out.println("가맹점명		                재정버거");
				System.out.println("사업자 번호			 111-11-11111");
				System.out.println("가맹점 번호 		  01057210413");
				System.out.println("대표자명				 이재정");
			}
		}
		if (orderNum == 3) {
			if (price < price3) {
				System.out.println("현금이 부족합니다.");
			}
			if (price >= price3) {
				System.out.println("------------------------------------");
				System.out.println("재정버거");
				System.out.println("주문금액 : " + price3 + "원");
				System.out.println("주문한 음식번호 : " + orderNum);
				System.out.println("지불한 금액 : " + price + "원");
				System.out.println("현금결제");
				System.out.println("거스름돈 :" + (price - price3));
				System.out.println("------------------------------------");
				System.out.println("가맹점명		                재정버거");
				System.out.println("사업자 번호			 111-11-11111");
				System.out.println("가맹점 번호 		  01057210413");
				System.out.println("대표자명				 이재정");
			}
		}
	}
}