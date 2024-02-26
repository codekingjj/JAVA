package test.lv3;

import java.util.Arrays;
import java.util.Scanner;

// 시작 10 : 00
// 종료 10 : 23
// 소요 00 : 23
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Level Test 3

		// 1.
		/*
		 * #영화관 좌석예매 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. 2. 예매가 완료되면 해당 좌석 값을 1로
		 * 변경한다. 3. 이미 예매가 완료된 좌석은 재구매 할 수 없다. 4. 한 좌석당 예매 가격은 12000원 이다. 5. 프로그램 종료 후,
		 * 해당 영화관의 총 매출액을 출력한다. 예) seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3 seat : 이미 예매가 완료된 자리입니다. ____________________________ 매출액 : 24000원
		 */

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int[] seatNum = { 1, 2, 3, 4, 5, 6, 7 };
		int[] seat = new int[7];
		int fee = 0;
		while (run) {
			System.out.println("====영화관 예매====");
			System.out.println("1. 예매하기");
			System.out.println("2. 종료");
			int sel1 = scan.nextInt();
			if (sel1 == 1) {
				System.out.println(Arrays.toString(seatNum));
				System.out.println(Arrays.toString(seat));
				System.out.println("총 매출 : " + fee);
				System.out.println("선택할좌석의 번호를 입력해 주세요 : ");
				int sel2 = scan.nextInt();

				if (sel2 >= 1 && sel2 <= 7) {
					if (seat[sel2 - 1] == 0) {
						System.out.println("예매가 완료되었습니다.");
						seat[sel2 - 1] = 1;
						fee += 12000;
					} else {
						System.out.println("이미 예약이 완료된 자리입니다. 다시 선택해주세요.");
					}

				} else {
					System.out.println("입력값의 범위를 초과하였습니다.");
				}
			} else if (sel1 == 2) {
				System.out.println("프로그램이 종료되었습니다.");
				System.out.println("총 매출 : " + fee);
				run = false;
			}

		}
	}

}
