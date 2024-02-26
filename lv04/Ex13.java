package lv04;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 빙고 ver1. (플레이어 1명) -> Ver2. 플레이어 2명으로 처리
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		final int MAX_NUM = 5;

		int[][] bingo = new int[MAX_NUM][MAX_NUM];

		int[] temp = new int[MAX_NUM * MAX_NUM];
		int size = 50;
		boolean play = true;

		int n = 0;
		while (n < 1 || n > MAX_NUM * 2 + 2) {
			System.out.print("몇 빙고? ");
			n = scan.nextInt();
		}
		for (int i = 0; i < temp.length; i++) {
			temp[i] = random.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}

		int idx = 0;
		for (int i = 0; i < MAX_NUM; i++) {
			for (int j = 0; j < MAX_NUM; j++) {
				bingo[i][j] = temp[idx++];
			}
		}
		// set map (bingo 배열 완성 후, bingo를 정방형 출력)
		// 1. temp 배열 완성 (중복 없이 1~50 랜덤값으로 초기화)
		// 2. bingo 배열 전체값에 temp배열의 값을 차례대로 넣기
		// 3. bingo배열 출력문 분리
		while (play) {
			int count = 0;
			int checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					System.out.printf("[%2d] ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("제거할 숫자를 입력하세요 : ");
			int inputNum = scan.nextInt();
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo[i][j] == inputNum) {
						bingo[i][j] = 0;
					}
				}
			}
			// 가로빙고 검사
			for (int i = 0; i < MAX_NUM; i++) {
				checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo[i][j] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count++;
					}
				}
			}
			// 세로빙고 검사
			for (int i = 0; i < MAX_NUM; i++) {
				checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo[j][i] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count++;
					}
				}
			}
			// 대각빙고(왼 -> 오)
			checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo[i][i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count++;
				}
			}
			// 대각비고(오 -> 왼)
			checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo[i][MAX_NUM - 1 - i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count++;
				}
			}
			if (count >= n) {
				System.out.println("빙고~!");
				play = false;
			}
		}
	}

}
