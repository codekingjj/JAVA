package lv04;

import java.util.Arrays;
import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #당첨복권 1세트 1. 3이 연속으로 3번 등장하면 당첨복권이다. (0 또는 3으로 랜덤값 부여) 2. 랜덤으로 5개의 복권을 생성하되,
		 * 당첨복권은 단 한 개만 생성되도록 설정한다.
		 */
		Random random = new Random();
		int[] lottoNum = { 0, 3 };
		int[][] lottoSet = new int[5][7];
		boolean isGoal = true;
		;

		int jackPot = 0; // 당첨복권 현황

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				int rNum = random.nextInt(2);
				lottoSet[i][j] = lottoNum[rNum];
			}
			int count = 0;
			for (int j = 0; j < 5; j++) {
				if (lottoSet[i][j] == 3 && lottoSet[i][j + 1] == 3 && lottoSet[i][j + 2] == 3) {
					count++;
				}
			}
			if (count >= 1 && jackPot == 0) {
				jackPot++;
				isGoal = false;
			} else if (count >= 1 && jackPot == 1) {
				i--;
			}

			if (i == 4 && isGoal) {
				i--;
			}
			System.out.println(jackPot);
			System.out.println(count);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(lottoSet[i][j]);
			}
			System.out.println();
		}
	}

}
