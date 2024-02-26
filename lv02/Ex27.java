package lv02;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 베스킨라빈스31 1. p1과 p2가 번갈아가면서 1~3을 입력한다. 2. br운 p1 과 p2의 입력값을 누적해서 저장한다. 3.
		 * br이 31을 넘으면 게임은 종료된다. 4. 승리자를 출력한다.
		 * 
		 * 예) 1턴 : p1(2) br(2) 
		 * 		2턴 : p2(1) br(3) 
		 * 		3턴 ; p1(3) br(6) ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int turn = 0;
		int br = 0;
		int p1 = 1;
		int p2 = 2;
		

		System.out.println("===베스킨라빈스 31===");
		System.out.println("1~3까지의 숫자를 입력하세요.");
		
		while (br < 31) {
			while (turn == 0) {
				System.out.println("p1 : ");
				p1 = scan.nextInt();
				if (p1 >= 1 && p1 <= 3) {
					br += p1;
					turn += 1;
					System.out.printf("p1(%d) br(%d)\n", p1, br);
				}else {
					System.out.println("입력할 수 있는 값의 범위를 초과하였습니다.");
				}
				
			}
			while (turn == 1 && br < 31) {
				System.out.println("p2 : ");
				p2 = scan.nextInt();
				if (p2 >= 1 && p2 <= 3) {
					br += p2;
					turn -= 1;
					System.out.printf("p2(%d) br(%d)\n", p2, br);
				}else {
					System.out.println("입력할 수 있는 값의 범위를 초과하였습니다.");
				}
			}
			
		}
		if (turn == 0) {
			System.out.println("p2가 이겼습니다.");
		}else {
			System.out.println("p12가 이겼습니다.");
		}
		
	}

}
