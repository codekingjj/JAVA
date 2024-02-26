package lv03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 1 to 4 1. arr배열에 1~4 사이의 숫자를 중복없이 랜덤으로 저장한다. 2. 사용자는 1부터 순서대로 해당 위치 값을
		 * 입력한다. 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다. 예) 4231 입력 : 3 4239 입력
		 * :1 4939 ...
		 */

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		final int SIZE = 4;

		int[] arr = new int[SIZE];
		int[] check = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			int rNum = random.nextInt(4) + 1;
			if (check[rNum - 1] == 0) {
				arr[i] = rNum;
				check[rNum - 1] = 1;
			} else if (check[rNum - 1] == 1) {
				i--;
			}

		}

		for (int i = 1; i <= 4; i++) {
			System.out.println(Arrays.toString(arr));
			System.out.println("위치를 입력하세요 : ");
			int index = scan.nextInt();
			if (index >= 1 && index <= 4) {

				if (arr[index - 1] == i) {
					System.out.println("정답입니다~");
					arr[index - 1] = 9;
				} else {
					System.out.println("틀렸습니다.");
					i--;
				}
			} else {
				System.out.println("범위를 벗어 났습니다. 다시입력하세요");
				i--;
			}
		}
		System.out.println("전부 맞추셨습니다.");

	}

}
