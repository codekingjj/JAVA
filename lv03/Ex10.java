package lv03;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #영화관 좌석예매 1. 사용자로부터 좌석번호 (index)를 입력받아 예매하는 시스템 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다. 4. 한 좌석당 예매 가격은 12000원이다. 5. 프로그램 종료후, 해당 영화관의 총
		 * 매출액을 출력한다.
		 * 
		 * 예) seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3 seat : 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3 seat : 0 1 0 1 0 0 0 이미 예매가 완료된 자리입니다. ____________________ 매출액 :
		 * 24000원
		 */

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int sales = 0;

		boolean run = true;
		while (run) {
			System.out.println("=영화관+");
			System.out.println("1. 좌석예매");
			System.out.println("2. 종료");

			System.out.println("메뉴선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("===좌석을 선택해 주세요.===");
				for (int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println("\n좌석 선택 : ");
				int selseat = scan.nextInt();

				if (selseat >= 0 && selseat <= 6 && seat[selseat] == 0) {
					System.out.println("예매되었습니다.");
					seat[selseat] = 1;
					sales += 12000;
				} else if (selseat > 6 && selseat < 0) {
					System.out.println("존재하지 않는 좌석입니다.");
				} else if (seat[selseat] == 1) {
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
			} else if (sel == 2) {
				System.out.println("프로그램이 종료되었습니다.");
				System.out.println("총 매출액 : " + sales);
				run = false;
			}
		}
	}

}
