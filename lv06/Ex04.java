package lv06;

import java.util.Random;
import java.util.Scanner;

class OnetoEighteen {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	final int SIZE = 9;

	int[] front = new int[SIZE];
	int[] back = new int[SIZE];

	// 기능단위로 메소드를 정의
	void makeFront() {
		for (int i = 0; i < SIZE; i++) {
			int rNum = random.nextInt(9);
			if (front[rNum] == 0) {
				front[rNum] = i + 1;
			} else {
				i--;
			}
		}
	}

	void makeBack() {
		for (int i = 10; i < SIZE * 2 + 1; i++) {
			int rNum = random.nextInt(9);
			if (back[rNum] == 0) {
				back[rNum] = i;
			} else {
				i--;
			}
		}
	}

	void play() {
		int count = 1;
		while (true) {
			for (int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println("인덱스 입력 : ");
			int index = scan.nextInt();
			if (count < 10 && front[index - 1] == count) {
				front[index - 1] = back[index - 1];
				count++;
			} else if (count >= 10 && front[index - 1] == count) {
				front[index - 1] = 0;
				count++;
			}
			if (count == 19) {
				break;
			}
		}
	}

	void successMessage() {
		System.out.println("성공~!");
	}

	void run() {
		makeFront();
		makeBack();
		play();
		successMessage();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnetoEighteen game = new OnetoEighteen();
		game.run();
	}

}
