package test.lv01.lv02;

import java.util.Scanner;

//시작 : 12 : 01
//종료 : 12 : 07
//소요 : 00 : 06
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv 02 테스트

		// 문제 4)
		/*
		 * 1. 5회 반복을 하면서 정수를 입력받는다. 2. 입력받은 정수를 전부 합을 출력한다. 3. 만약에 입력받은 합이 100이상이면 반복이
		 * 5회가 아닐지라도 즉시 종료
		 */

		Scanner scan = new Scanner(System.in);

		int n = 1;
		int input = 0;
		int sum = 0;

		while (n <= 5) {
			System.out.println("정수를 입력하세요 : ");
			input = scan.nextInt();
			sum += input;
			if (sum >= 100) {
				break;
			}
			n++;
		}
		System.out.println("총합 : " + sum);
	}

}
