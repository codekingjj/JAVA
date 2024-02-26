package lv01;

import java.util.Scanner;
public class Ex12 {
	
			/*
			 * # UP & DOWN 게임[1단계]
			 * 1. com은 8이다.
			 * 2. me는 숫자를 하나입력받는다.
			 * 3. com과 me를 비교해서 다음과 같은 메세지를 출력한다.
			 * 1) me < com : UP!
			 * 2) me == com : Bingo!
			 * 3) me > com : Down!
			 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = 8;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int me = scan.nextInt();
		if (me < com) {
			System.out.println("Up!");
		}
		if ( me == com) {
			System.out.println("Bingo!");
		}
		if (me > com) {
			System.out.println("Down!");
		}
		
	}

}
