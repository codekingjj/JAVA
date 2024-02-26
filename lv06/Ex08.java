package lv06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 숫자 이동
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class Mario {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();

	final int SIZE = 10;
	final int MARIO = 8;
	int pX;

	int[] move = new int[SIZE];

	int x; // 플레이어 랜덤 좌표에서 시작

	void setMario() {
		pX = random.nextInt(10);
		move[pX] = MARIO;
	}

	void showMap() {
//		System.out.println(Arrays.toString(move));
		for (int i = 0; i < SIZE; i++) {
			if (move[i] == 0) {
				System.out.print("_");
			} else if (move[i] == MARIO) {
				System.out.print("옷_");
			}
		}
	}

	void selectMove(int sel) {
		if (sel == 1 && pX - 1 >= 0) {
			move[pX] = 0;
			pX--;
			move[pX] = MARIO;
		} else if (sel == 2 && pX + 1 < SIZE) {
			move[pX] = 0;
			pX++;
			move[pX] = MARIO;
		}
	}

	void run() {
		setMario();
		while (true) {
			showMap();
			System.out.println("\n1) 왼쪽 2) 오른쪽");
			int sel = scan.nextInt();
			selectMove(sel);
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mario mario = new Mario();
		mario.run();
	}

}
