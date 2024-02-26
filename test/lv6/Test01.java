package test.lv6;

import java.util.Arrays;
import java.util.Random;

class Omr {
	Random random = new Random();
	int[] answer = { 1, 3, 4, 2, 5 };
	int[] hgd;
	String[] checkAnswer;
	int score = 0;

	void sethgd() {
		hgd = new int[answer.length];
		checkAnswer = new String[answer.length];
		for (int i = 0; i < hgd.length; i++) {
			int rNum = random.nextInt(5) + 1;
			hgd[i] = rNum;
		}
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(hgd));
	}

	void check() {
		for (int i = 0; i < hgd.length; i++) {
			if (answer[i] == hgd[i]) {
				score += 20;
				checkAnswer[i] = "O";
			} else {
				checkAnswer[i] = "X";
			}
		}
		System.out.println(Arrays.toString(checkAnswer));
		System.out.println(score);
	}

	void run() {
		sethgd();
		check();
	}
}

public class Test01 {

	public static void main(String[] args) {
		// Lv6 Test (클래스 + 메소드)

		// 1.
		/*
		 * # OMR카드 : 클래스 + 메서드 1. 배열 answer는 시험문제의 정답지이다. 2. 배열 hgd에 1 ~ 5 사이의 랜덤 숫자 5개를
		 * 저장한다. 3. answer와 hgd 값을 비교해 정오표를 출력한다. 4. 한 문제당 20점이다. 예) answer = {1, 3, 4,
		 * 2, 5} hgd = {1, 1, 4, 4, 3} 정오표 = {O, X, O, X, X} 성적 = 40점
		 */
		Omr omr = new Omr();

		omr.run();

	}

}
