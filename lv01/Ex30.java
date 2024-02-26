package lv01;

import java.util.Random;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * #369게임 1. 1~50 사이의 랜덤 숫자를 저장한다. 2. 위 수에 369의 개수가 1) 2개이면, 짝짝을 출력 2) 2개이면, 짝을
		 * 출력 3) 0개이면, 해당 숫자를 출력 예) 33 : 짝짝 16 : 짝 7 : 7
		 */

		Random random = new Random();

		int rNum = random.nextInt(50) + 1;
		System.out.println(rNum);
		if (0 < rNum && rNum < 10) {
			if ((rNum % 10) == 3 || (rNum % 10) == 6 || (rNum % 10) == 9) {
				System.out.println(rNum + " : 짝");
			} else {
				System.out.println(rNum + " : " + rNum);
			}
		}
		else if (10 <= rNum && rNum <= 50) {
			if (rNum / 10 == 3) {
				if ((rNum % 10) == 3 || (rNum % 10) == 6 || (rNum % 10) == 9) {
					System.out.println(rNum + " : 짝짝");
				} else if ((rNum % 10) != 3 || (rNum % 10) != 6 || (rNum % 10) != 9) {
					System.out.println(rNum + " : 짝");
				}
			}
			if (rNum / 10 != 3) {
				if ((rNum % 10) == 3 || (rNum % 10) == 6 || (rNum % 10) == 9) {
					System.out.println(rNum + " : 짝");
				} else {
					System.out.println(rNum + " : " + rNum);
				}

			}
		}

	}

}