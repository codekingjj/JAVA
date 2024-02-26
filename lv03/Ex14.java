package lv03;

import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 4의 배수만 저장 -arr 배열에서 4의 배수만 골라 temp 배열에 저장 -단! temp의 길이를 4의 배수 개수만큼만 설정한다.
		 */

		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;
		int count = 0;
		int x = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}

		temp = new int[count];

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				temp[x] = arr[i];
				x++;
			}

		}
		System.out.println(Arrays.toString(temp));
	}

}
