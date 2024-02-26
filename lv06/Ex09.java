package lv06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * #기억력 게임 : 클래스 + 메서드
 * 1. front 배열카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤딥히면(back배열의 0이 사라지면) 게임은 종료된다.
 */

class MemoryGame {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	final int SIZE = 10;

	int[] front; // {1,1,2,2,3,3,4,4,5,5}
	int[] back; // {0,0,0,0,0,0,0,0,0,0}

	boolean play = true;
	boolean isDupl = false;
	int idx1 = -1;
	int idx2 = -1;

	int cnt; // 정답을 맞춘 횟수

	void set() {
		front = new int[SIZE];
		back = new int[SIZE];
		cnt = 0;
		int x = 1;
		for (int i = 0; i < SIZE; i += 2) {
			front[i] = x;
			front[i + 1] = x;
			x++;
		}
		for (int i = 0; i < 100; i++) {
			int rNum = random.nextInt(10);
			int temp = front[0];
			front[0] = front[rNum];
			front[rNum] = temp;

		}
	}

	void show() {
		for (int i = 0; i < SIZE; i++) {
			if (back[i] == 0) {
				System.out.print("★");
			} else if (back[i] == 1) {
				System.out.print(front[i]);
			}
		}
	}

	void choice1(int num) {
		if (back[num - 1] == 1) {
			System.out.println("이미 선택되었습니다.");
			isDupl = true;
			return;
		} else {
			isDupl = false;
		}
		back[num - 1] = 1;
		idx1 = num - 1;
		show();
	}

	void choice2(int num) {
		back[num - 1] = 1;
		idx2 = num - 1;
		show();
		System.out.println();
	}

	void check() {
		if (front[idx1] == front[idx2]) {
			cnt++;
		} else {
			back[idx1] = 0;
			back[idx2] = 0;
		}
	}

	void checkEnd() {
		if (cnt == 6) {
			play = false;
		}
	}

	void run() {
		set();
		while (play) {
			show();
			System.out.println("\n카드 선택 1 : ");
			int sel1 = scan.nextInt();
			choice1(sel1);
			if (!isDupl) {
				System.out.println("\n카드 선택 2 : ");
				int sel2 = scan.nextInt();
				choice2(sel2);
				check();
				checkEnd();
			}
		}
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryGame game = new MemoryGame();
		game.run();
	}

}
