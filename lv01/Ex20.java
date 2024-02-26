package lv01;

import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 최댓값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다.
		 * 2. 입력받은 3개의 수를 비교하여.
		 * 3. 가장 큰 수(Max)를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int tmp = 0;
		
		if (x > y) {
			tmp = x;
			if (tmp > z) {
				System.out.println(tmp);
			}
			if (tmp < z) {
				System.out.println(z);
			}
		}
		if (x < y) {
			tmp = y;
			if (tmp > z) {
				System.out.println(tmp);
			}
			if (tmp < z) {
				System.out.println(z);
			}
		}
		
	}

}
