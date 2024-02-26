package lv03;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #소수 찾기 [2단계] 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력 예) 입력 : 20 2, 3, 5, 7, 11,
		 * 13, 17, 19
		 */

		// 2차원 for문 활용

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요 : ");
		int number = scan.nextInt();

		if (number < 2) {
			System.out.println("유효하지 않은 값입니다.");
		} else {
			for (int i = 2; i < number; i++) {	// i : 소수 검증 대상
				int div = 0;
				for (int j = 1; j <= i; j++) {	// i에서 나누어 줄 대상 값
					if (i % j == 0) {
						div ++;
					}
					if(div == 2) {
						System.out.println(i);
					}
				}
			}
		}
		
	}

}
