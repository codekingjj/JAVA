package test.lv3;

import java.util.Scanner;

//시작시간 12:45
//종료시간 13:36
//소요시간 00:10
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Test 3

		// 5.
		/*
		 * # 소수찾기[2단계] 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력 예) 입력 : 20 2, 3, 5, 7, 11,
		 * 13, 17, 19
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();

		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}

}
