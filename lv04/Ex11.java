package lv04;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		/*
		 * #소수 찾기[3단계] 1. 숫자를 한 개 입력받는다. 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		 * 
		 * 예) Enter Number ? 1000 1000보다 큰 첫번째 소수는 1009 예) Enter Number ? 500 500보다 큰
		 * 첫번째 소수는 503
		 */
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int max = 0;
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();

		for (int i = 1; i < number; i++) {
			int count = 0;
			for (int j = 1; j < number; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				max = i;
			}
		}
		while (run) {
			max++;
			int count = 0;
			for (int i = 1; i <= max; i++) {
				if (max % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				run = false;
			}
		}
//		while (true) {
//			max++;
//			for (int i = 1; i < max; i++) {
//				int count = 0;
//				for (int j = 1; j < max; j++) {
//					if (i % j == 0) {
//						count++;
//					}
//				}
//				if (count == 2) {
//					break;
//				}
//			}
//
//		}
		System.out.println(max);
	}
}
