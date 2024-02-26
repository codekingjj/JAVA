package lv02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 최대값 구하기[2단계] 1. 3회 반복을 하면서 정수를 입력받는다. 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */

		Scanner scan = new Scanner(System.in);

		int n = 1;
		int max = 0;
		while (n <= 3) {
			System.out.println("숫자를 입력해주세요 : ");
			int x = scan.nextInt();
			if (x >= 1) {
				if (max <= x) {
					max = x;
				}

			} else {
				System.out.println("입력값의 범위를 초과하였습니다. 다시입력해주세요.");
				n--;
			}
			n++;
		}

		System.out.println("최대값은 : " + max + "입니다.");
	}

}
