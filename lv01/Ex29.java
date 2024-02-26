package lv01;

import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #가운데 숫자 맞추기 게임 1. 150~250 사이의 랜덤 숫자 저장 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다. 예) 249 : 4
		 */
		// !문자열 사용 안함

		// 나머지 값 활용
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("----램덤한 수의 가운데 자리 숫자 맞추기~----");
		int rNum = random.nextInt(101) + 150;
		System.out.println("랜덤한 숫자 : " + rNum);
		System.out.println("가운데 숫자를 맞춰주세요~! : ");
		int inputAnswer = scan.nextInt();
		int answer = (rNum % 100) / 10;

		if (0 <= inputAnswer && inputAnswer <= 9) {
			if (answer == inputAnswer) {
				System.out.println("정답입니다~! 램덤한 수 : " + rNum + " 랜덤한 수의 가운데 수 : " + answer + " 입력한 수 : " + inputAnswer);
			} else if (answer != inputAnswer) {
				System.out.println("틀렸습니다~! 램덤한 수 : " + rNum + " 랜덤한 수의 가운데 수 : " + answer + " 입력한 수 : " + inputAnswer);
			}
		} else if (inputAnswer < 150 || inputAnswer > 250) {
			System.out.println("입력할 수 있는 값의 범위를 초과하였습니다.");
		}

	}

}
