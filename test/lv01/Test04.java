package test.lv01;

import java.util.Scanner;

//시작시간 : 03:03
//종료시간 : 03:26
//소요시간 : 00:23
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #영수증 출력 [1단계] 1. 메뉴판을 출력한다. 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 3. 현금을 입력받는다. 4.
		 * 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다. 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		Scanner scan = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 불고기 버거 : " + price1 + "원");
		System.out.println("2. 새우	버거 : " + price2 + "원");
		System.out.println("3. 콜	라 : " + price3 + "원");
		System.out.println("\n");
		System.out.println("원하시는 메뉴의 숫자를 입력해주세요");

		int orderNum = scan.nextInt();

		System.out.println("지불하실 금액을 입력해주세요 : ");
		int payPrice = scan.nextInt();

		if (orderNum == 1) {
			if (payPrice >= price1) {
				System.out.println("====영수증====");
				System.out.println("주문하신 제품 : 불고기 버거");
				System.out.println("주문하신 제품의 금액 : " + price1);
				System.out.println("지불하신 금액 :" + payPrice);
				System.out.println("거스름돈 : " + (payPrice - price1));
			} else if (payPrice < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if (orderNum == 2) {
			if (payPrice >= price2) {
				System.out.println("====영수증====");
				System.out.println("주문하신 제품 : 새우 버거");
				System.out.println("주문하신 제품의 금액 : " + price2);
				System.out.println("지불하신 금액 :" + payPrice);
				System.out.println("거스름돈 : " + (payPrice - price2));
			} else if (payPrice < price2) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if (orderNum == 3) {
			if (payPrice >= price3) {
				System.out.println("====영수증====");
				System.out.println("주문하신 제품 : 콜라");
				System.out.println("주문하신 제품의 금액 : " + price3);
				System.out.println("지불하신 금액 :" + payPrice);
				System.out.println("거스름돈 : " + (payPrice - price3));
			} else if (payPrice < price3) {
				System.out.println("현금이 부족합니다.");
			}
		}

	}

}
