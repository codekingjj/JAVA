package lv02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 베스킨라빈스32 1. p1과 p2가 번갈아가면서 1~3을 입력한다. 2. br운 p1 과 p2의 입력값을 누적해서 저장한다. 3.
		 * br이 31을 넘으면 게임은 종료된다. 4. 승리자를 출력한다.
		 * 
		 * 예) 1턴 : p1(2) br(2) 2턴 : p2(1) br(3) 3턴 ; p1(3) br(6) ...
		 */

		Scanner scan = new Scanner(System.in);

		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0; // ***** // ++ 짝홀 또는 1 or 2로 스위치

		while (br < 31) {
			// turn = 1 일때 p1의 입력
			while (turn == 0) {
				System.out.println("player 1이 입력할 숫자의 개수를 입력하세요 : ");
				p1 = scan.nextInt();
				if (p1 >= 1 && p1 <= 3) {
					br += p1;
					turn += 1;
					System.out.println("현재까지 진행된 수 : " + br);
				} else {
					System.out.println("입력범위를 초과하였습니다. 다시 입력해 주세요.");
				}
			}
			// p2의 입력
			while (turn == 1 && br < 31) {
				System.out.println("player 2이 입력할 숫자의 개수를 입력하세요 : ");
				p2 = scan.nextInt();
				if (p2 >= 1 && p2 <= 3) {
					br += p2;
					turn -= 1;
					System.out.println("현재까지 진행된 수 : " + br);
				} else {
					System.out.println("입력범위를 초과하였습니다. 다시 입력해 주세요.");
				}
			}

		}
		if (turn == 0) {
			System.out.println("player1이 이겼습니다~!");
		} else if (turn == 1) {
			System.out.println("player2가 이겼습니다~!");
		}

	}

}
