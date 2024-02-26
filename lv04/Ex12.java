package lv04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 1~2000000000 사이의 숫자를 입력받고 가운데 숫자 출력
		// (단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예) 123 ==> 2
		// 예) 1234 ==> 짝수의 자리이다
		// 예) 1 ==> 1
		// 예) 1234567 ==> 4

		// 힌트 자리수를 구하고 배열을 반든다음 하나씩 저장
		// 예) ==> 123 == > arr[] = new int [3];
		int cipher = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int input = scan.nextInt();
		for (int i = 1; true; i *= 10) {
			if (input / i != 0) {
				cipher++;
			} else if (input / i == 0) {
				break;
			}
		}
		int[] arr = new int[cipher];
		int division = 1;
		for (int i = 0; i < cipher - 1; i++) {
			division *= 10;
		}
		for (int i = 0; i < cipher; i++) {
			arr[i] = input / division;
			input = input % division;
			division /= 10;

		}
		if (cipher % 2 == 0) {
			System.out.println("짝수의 자리이다.");
		} else if (cipher % 2 == 1) {
			System.out.println(arr[cipher / 2]);
		}
	}

}
