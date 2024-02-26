package test.lv01.lv02;

import java.util.Scanner;

// 시작 : 10:10
// 종료 : 10:21
// 소요 : 00:11
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv02 테스트

		// 문제 1)
		/*
		 * #베스킨라빈스31 1. p1과 p2가 번갈아가면서 1~3을 입력한다. 2. br은 p1과 p2의 입력값을 누적해서 저장한다. 3. br이
		 * 31을 넘으면 게임은 종료된다. 4. 승리자를 출력한다.
		 * 
		 * 예) 1턴 : p1(2) br(2) 2턴 : p2(1) br(3) ...
		 */

		Scanner scan = new Scanner(System.in);

		int p1 = 0;
		int p2 = 0;

		int turn = 0;
		int br = 0;

		System.out.println("===베스킨라빈스 31===");
		while (br < 31) {
			while (turn == 0) {
				System.out.println("p1 : ");
				p1 = scan.nextInt();
				if (p1 >= 1 && p1 <= 3) {
					turn++;
					br += p1;
					System.out.printf("p1(%d) br(%d)\n", p1, br);
				} else {
					System.out.println("입력값의 범위를 초과하였습니다. 다시입력하세요.");
				}
			}
			while (br != 31 && turn == 1) {
				System.out.println("p2 : ");
				p2 = scan.nextInt();
				if (p2 >= 1 && p2 <= 3) {
					turn--;
					br += p2;
					System.out.printf("p2(%d) br(%d)\n", p2, br);
				} else {
					System.out.println("입력값의 범위를 초과하였습니다. 다시입력하세요.");
				}
			}
		}
		if (turn == 0) {
			System.out.println("p1이 승리하였습니다.");
		} else {
			System.out.println("p2가 승리하였습니다.");
		}

	}

}
