package test.lv6;
//시작 11 :03

//종료 
//소요 

import java.util.Scanner;

class Theater {
	Scanner scan = new Scanner(System.in);
	final int seatCount = 10;
	int[] seat;
	int sales = 0;

	int menu() {
		System.out.println("===메뉴===");
		System.out.println("1) 영화 예매");
		System.out.println("2) 예매 취소");
		int sel = scan.nextInt();

		return sel;
	}

	void doall(int sel) {
		if (sel == 1) {
			System.out.println("좌석을 선택해 주세요 : ");
			veiwSeat();
			int choice = scan.nextInt();
			if (seat[choice] == 0) {
				System.out.println("예매가 완료되었습니다.");
				seat[choice] = 1;
				sales += 12000;
			} else {
				System.out.println("이미 선택된 좌석입니다.");
			}
		} else if (sel == 2) {
			System.out.println("좌석을 선택해 주세요 : ");
			veiwSeat();
			int choice = scan.nextInt();
			if (seat[choice] == 1) {
				System.out.println("취소가 완료되었습니다.");
				seat[choice] = 0;
				sales -= 12000;
			} else {
				System.out.println("예매가 되어있지 않은 좌석입니다.");
			}
		}
	}

	void veiwSeat() {
		seat = new int[seatCount];
		System.out.println("===좌석 예매===");
		for (int i = 0; i < seatCount; i++) {
			if (seat[i] == 0) {
				System.out.print("□ ");
			} else {
				System.out.print("■ ");
			}
		}
	}
	
	void veiwSales() {
		System.out.println("총 매출 : " + sales);
	}
	void run() {
		while (true) {
			doall(menu());
			veiwSales();
		}
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lv6 Test (클래스 + 메소드)

		// 2.
		/*
		 * # 영화관 좌석에매: 클래스 + 메서드 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. 2. 예매가 완료되면 해당
		 * 좌석 값을 1로 변경한다. (예매 취소가 되면 해당 좌석 값을 0으로 변경) 3. 이미 예매가 완료된 좌석은 재구매할 수 없다. 4. 한
		 * 좌석당 예매 가격은 12000원이다. 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 */

		Theater theater = new Theater();

		theater.run();
	}

}
