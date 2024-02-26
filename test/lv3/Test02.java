package test.lv3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 시작 10:23
// 종료 10:47
// 소요 00:24
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Test 3

		// 2.
		/*
		 * #1 to 4 1. arr배열에 1~4 사이의 숫자를 중복없이 랜덤으로 저장한다. 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다. 예) 4 2 3 1 입력 : 3 4 2 3 9 입력 :
		 * 1 4 9 3 9 ...
		 */

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[4];
		int[] check = new int[4];

		for (int i = 0; i < 4; i++) {
			int rNum = random.nextInt(4) + 1;
			if (check[rNum - 1] == 0) {
				arr[i] = rNum;
				check[rNum - 1] = 1;
			} else if (check[rNum - 1] == 1) {
				i--;
			}
		}
		for (int i = 1; i < 5; i++) {
			System.out.println(Arrays.toString(arr));
			System.out.println("선택할 자리를 입력하세요 : ");
			int sel = scan.nextInt();
			if (sel >= 0 && sel <= 3) {
				if (arr[sel] == i) {
					System.out.println("정답입니다.");
					arr[sel] = 9;
				} else {
					System.out.println("틀렸습니다. 다시 입력해주세요.");
					i--;
				}
			} else {
				System.out.println("입력할 수 있는 값의 범위를 벗어났습니다.");
			}
		}
	}

}
