package lv05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 식권 자판기 프로그램
		// 1) 관리자 2) 사용자
		// 관리자 ==> 1)식권충전 2) 잔돈 충전 3) 뒤로가기
		// 사용자 == > 1) 구입 ==> 입금 금액 입력 ==> 구매 매수 입력 ==> 잔돈출력
		// 2) 뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력
		// 화면
		// 식권 가격 : 3200원
		// 식권 : ??매 (매진시 매진)
		// 50000원 : ??매 //10000원 : ??매 // 5000원 : ??매
		// 1000원 : ?? 매 // 500원 : ??개 // 100원 : ??개

		Scanner scan = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5;
		final int PRICE = 3200;

		while (true) {
			System.out.println(Arrays.toString(charges));
			System.out.println(tickets);
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");

			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println(Arrays.toString(charges));

					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");

					System.out.println("메뉴 선택 : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						System.out.println("충전할 식권 개수 : ");
						int add = scan.nextInt();

						if (add < 1) {
							continue;
						}
						tickets += add;
						System.out.printf("현재 남은 티켓 수는 %d장입니다..\n", tickets);
//						System.out.println("얼마나 충전하시겠습니까? : ");
//						int plusTickets = scan.nextInt();
//
//						if (plusTickets < 0) {
//							continue;
//						}
//						tickets += plusTickets;
					} else if (choice == 2) {
						for (int i = 0; i < money.length; i++) {
							System.out.printf("%d) %d원권\n (%d장)", i + 1, money[i], charges[i]);
						}
						System.out.println("화폐 선택 : ");
						int idx = scan.nextInt() - 1;

						System.out.println("충전 매수 : ");
						int add = scan.nextInt();

						if (idx < 0 || idx >= money.length || add < 1) {
							continue;
						}
						charges[idx] += add;
						System.out.println("충전 완료되었습니다.");
//						System.out.println("얼마를 얼만큼 충전하시겠습니까?");
//						System.out.println("금액 : ");
//						int plusMoney = scan.nextInt();
//						System.out.println("매수 : ");
//						int amount = scan.nextInt();
//
//						for (int i = 0; i < money.length; i++) {
//							if (plusMoney == money[i]) {
//								charges[i] += amount;
//							}
//						}
					} else if (choice == 3) {
						break;
					}
				}
			} else if (sel == 2) {
				while (true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");

					System.out.println("메뉴 선택 : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						System.out.println("구매할 식권 매수 : ");
						int cnt = scan.nextInt();

						if (cnt < 1 || cnt > tickets) {
							System.out.println("식권이 부족합니다, 관리자에게 문의하세요.");
							continue;
						}
						int total = cnt * PRICE;
						System.out.printf("총 금액은 %d원입니다.\n", total);

						System.out.println("현금 지급 : ");
						int cash = scan.nextInt();

						if (cash < total) {
							System.out.println("현금이 부족합니다.");
							continue;
						}

						int change = cash - total;
						int changeCopy = change;

//						int[] temp = new int[charges.length];
//						for (int i = 0; i < temp.length; i++) {
//							temp[i] = charges[i];
//
//						}
						int[] temp = charges.clone(); // 배열변수.clone() -> 해당 배열의 복제본을 힙에 만들어줌
						System.out.println("charges : " + charges);
						System.out.println("temp : " + temp);

						for (int i = 0; i < money.length; i++) {
							if (cash >= money[i]) {
								cash -= money[i];
								temp[i]++;
								i--;
							}
						}
						int[] changeCnt = new int[temp.length];

						for (int i = 0; i < money.length; i++) {
							if (change >= money[i] && temp[i] > 0) {
								change -= money[i];
								changeCnt[i]++;
								temp[i]--;
								i--;
							}
						}

						if (change > 0) {
							System.out.println("잔액이 부족합니다, 관리자에게 문의하세요.");
							continue;
						}

						charges = temp;
						System.out.println("-----------------------");
						System.out.printf("거스름 돈 : %d원\n", changeCopy);
						System.out.println("-----------------------");
						for (int i = 0; i < changeCnt.length; i++) {
							if (changeCnt[i] > 0) {
								System.out.printf("%d원권 %d개\n", money[i], changeCnt[i]);
								System.out.println("-----------------------");
							}
						}

						tickets -= cnt;
						System.out.println("식권 구매 완료");
//						System.out.println("몇장을 구매하시겠습니까? : ");
//						int buyTickets = scan.nextInt();
//						if (tickets <= 0 || buyTickets > tickets) {
//							System.out.println("죄송합니다. 티켓이 부족합니다. 관리자에게 문의해주세요.");
//							continue;
//						}
//						System.out.printf("%d장 : %d원\n", buyTickets, buyTickets * PRICE);
//						int total = buyTickets * PRICE;
//						System.out.println("얼마를 투입하시겠습니까?");
//						int price = scan.nextInt();
//						if (price < total) {
//							System.out.println("금액이 부족합니다.");
//							continue;
//						}
//						int extra = price - total;
//						System.out.println("거스름돈 : " + extra + "원");
//						int[] extraAmount = new int[charges.length];
//
//						boolean isOkay = false;
//						for (int i = 0; i < money.length; i++) {
//							extraAmount[i] = extra / money[i];
//							extra = extra % money[i];
//							if (charges[i] >= extraAmount[i]) {
//								isOkay = true;
//							} else {
//								isOkay = false;
//								break;
//							}
//						}
//						if (isOkay) {
//							for (int i = 0; i < money.length; i++) {
//								if (extraAmount[i] != 0) {
//									System.out.printf("%d원 %d장\n", money[i], extraAmount[i]);
//								}
//							}
//							for (int i = 0; i < money.length; i++) {
//								charges[i] -= extraAmount[i];
//							}
//							System.out.println("식권 구매 완료.");
//						} else {
//							System.out.println("POS기에 드릴 잔돈이 부족합니다.");
//						}
					} else if (choice == 2) {
						break;
					}
				}
			}
		}
	}

}
