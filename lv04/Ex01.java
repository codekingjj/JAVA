package lv04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 레벨4, 다차원 배열
		/*
		 * #최대값 구하기 1. 가장 큰 값을 찾아 입력한다. 2. 정답이면 해당 값을 0으로 변경한다. 3. arr배열의 모든 값이 0으로 변경되면
		 * 프로그램은 종료된다. 예) 11, 87, 42, 100, 24 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int[] arr = { 11, 87, 42, 100, 24 };
		int count = 0;

		while (run) {

			System.out.println(Arrays.toString(arr));
			System.out.println("최대값을 입력해 주세요 : ");
			int input = scan.nextInt();
			int max = 0;
			int tmp = 0;
			for (int i = 0; i < 5; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					tmp = i;
				}
			}
			if (max == input) {
				System.out.println("정답입니다.");
				arr[tmp] = 0;
				count++;
			}

			else {
				System.out.println("틀렸습니다.");
			}
			if (count == 5) {
				run = false;
			}

		}
	}

}
