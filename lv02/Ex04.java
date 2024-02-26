package lv02;

import java.util.Scanner;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #구구단 게임[3단계] 1. 구구단 게임을 5회 반복한다. 2. 정답을 맞추면 개당 20점이다. 3. 게임 종료 후, 성적을 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.println("====구구단 게임====");
		System.out.println("한문제 당 20점! 100점을 향해 달려봅시다~!\n");

		int n = 1;
		int score = 0;
		while (n <= 5) {
			int rNum1 = random.nextInt(10) + 1;
			int rNum2 = random.nextInt(10) + 1;
			int sum = rNum1 * rNum2;

			System.out.printf("%d X %d = ?\n", rNum1, rNum2);
			System.out.println("물음표에 알맞은 숫자는 무엇일까요?");

			int answer = scan.nextInt();

			if (answer == sum) {
				System.out.println("정답입니다~!");
				score += 20;
			} else if (answer != sum) {
				System.out.println("틀렸습니다...ㅠㅜ");
			}
			n += 1;
		}
		System.out.printf("\n총 점수는 %d점입니다!", score);

	}

}
