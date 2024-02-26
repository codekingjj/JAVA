package lv06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MemoryGame1 {
	Scanner scanner = new Scanner(System.in);

	final int SIZE = 10;
	final int FLIPED = 1;

	int[] front; // {1,1,2,2,3,3,4,4,5,5}
	int[] back; // {0,0,0,0,0,0,0,0,0,0}

	int cnt; // 정답 맞춘 횟수

	void setGame() {
		cnt = 0;
		front = new int[SIZE];
		back = new int[SIZE];

		for (int i = 0; i < SIZE; i++)
			front[i] = (i + 2) / 2;

		shuffle(front);
	}

	void shuffle(int[] front) {
		Random random = new Random();

		for (int i = 0; i < SIZE * 10; i++) {
			int rIdx = random.nextInt(SIZE);

			int temp = front[0];
			front[0] = front[rIdx];
			front[rIdx] = temp;
		}
	}

	boolean isRun() {
		return cnt == SIZE / 2 ? false : true;
	}

	void printQuiz() {
		System.out.print("[");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));
	}

	int inputIndex(int[] array) {
		int index = -1;

		while (true) {
			try {
				String input = scanner.next();
				index = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("숫자만");
			}

			if (index >= 0 && index < array.length)
				break;
		}

		return index;
	}

	boolean flipCards(int firstIndex, int secondIndex) {
		if (firstIndex == secondIndex)
			return false;
		if (front[firstIndex] != front[secondIndex])
			return false;
		if (front[firstIndex] == FLIPED)
			return false;

		back[firstIndex] = FLIPED;
		back[secondIndex] = FLIPED;

		cnt++;

		return true;
	}

	void printResult(boolean success) {
		if (success)
			System.out.println("카드가 뒤집혔습니다.");
		else
			System.out.println("카드 뒤집기 실패");
	}

	void run() {
		setGame();
		while (isRun()) {
			printQuiz();
			int index1 = inputIndex(front);
			int index2 = inputIndex(front);
			printResult(flipCards(index1, index2));
		}

	}

}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryGame1 game = new MemoryGame1();
		game.run();
	}

}
