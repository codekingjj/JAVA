package lv04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #숫자이동[2단계] 1. 숫자 2는 캐릭터이다. 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 숫자2를 입력하면 , 캐릭터가 오른쪽으로
		 * 이동한다. 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다. 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다. 5. 단,
		 * 숫자3을 입력하면, 벽을 격파할 수 있다.
		 */

		final int SIZE = 9;
		final int MARIO = 2;
		final int WALL = 1;

		final int LEFT = 1;
		final int RIGHT = 2;
		final int PUNCH = 3;

		boolean play = true;

		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		// int[] game = { 2, 1, 1, 0, 0, 0, 0, 1, 0 };
		// int[] game = { 0, 0, 1, 2 ,1, 0, 0, 1, 0 };

		int x = -1;

		for (int i = 0; i < SIZE; i++) {
			if (game[i] == 2) {
				x = i;
			}
		}

		while (play) {
			System.out.println(Arrays.toString(game));
			System.out.println("1. 왼쪽 2. 오른쪽 3. 벽부수기");
			int sel = scan.nextInt();
			if (sel == LEFT) {
				if (x == 0) {
					System.out.println("더이상 이동할 수 없습니다.");
				} else {

					if (game[x - 1] == 0) {
						game[x] = 0;
						game[x - 1] = MARIO;
						x = x - 1;
					} else if (game[x - 1] == 1) {
						System.out.println("벽으로 가로막혀 이동할 수 없습니다.");
					}
				}
			} else if (sel == RIGHT) {
				if (x == 8) {
					System.out.println("더이상 이동할 수 없습니다.");
				} else {

					if (game[x + 1] == 0) {
						game[x] = 0;
						game[x + 1] = MARIO;
						x = x + 1;
					} else if (game[x + 1] == 1) {
						System.out.println("벽으로 가로막혀 이동할 수 없습니다.");
					}
				}
			} else if (sel == PUNCH) {
				if (x == 0) {
					if (game[x + 1] == 1) {
						System.out.println("쾅!");
						game[x + 1] = 0;
					} else {
						System.out.println("벽이 아니라서 사용할 수 없습니다.");
					}
				} else if (x == 8) {
					if (game[x - 1] == 1) {
						System.out.println("쾅!");
						game[x - 1] = 0;
					}
				} else {
					if (game[x - 1] == 1) {
						System.out.println("쾅!");
						game[x - 1] = 0;
					}
					if (game[x + 1] == 1) {
						System.out.println("쾅!");
						game[x + 1] = 0;
					}
				}

			} else {
				System.out.println("유효하지 않은 메뉴입니다.");
			}
		}
	}

}
