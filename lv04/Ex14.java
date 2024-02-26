package lv04;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		final int MAX_NUM = 5;

		int[][] bingo1 = new int[MAX_NUM][MAX_NUM];
		int[][] bingo2 = new int[MAX_NUM][MAX_NUM];

		int[] temp1 = new int[MAX_NUM * MAX_NUM];
		int[] temp2 = new int[MAX_NUM * MAX_NUM];
		int size = 50;
		boolean play = true;
		int turn = 1;
		int n = 0;
		while (n < 1 || n > MAX_NUM * 2 + 2) {
			System.out.print("몇 빙고? ");
			n = scan.nextInt();
		}
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = random.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp1[i] == temp1[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = random.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp2[i] == temp2[j]) {
					i--;
				}
			}
		}

		int idx = 0;
		for (int i = 0; i < MAX_NUM; i++) {
			for (int j = 0; j < MAX_NUM; j++) {
				bingo1[i][j] = temp1[idx++];
			}
		}
		idx = 0;
		for (int i = 0; i < MAX_NUM; i++) {
			for (int j = 0; j < MAX_NUM; j++) {
				bingo2[i][j] = temp2[idx++];
			}
		}
		// set map (bingo 배열 완성 후, bingo를 정방형 출력)
		// 1. temp 배열 완성 (중복 없이 1~50 랜덤값으로 초기화)
		// 2. bingo 배열 전체값에 temp배열의 값을 차례대로 넣기
		// 3. bingo배열 출력문 분리
		while (play) {
			int count1 = 0;
			int count2 = 0;
			System.out.println("<P1의 빙고판>");
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					System.out.printf("[%2d] ", bingo1[i][j]);
				}
				System.out.println();
			}
			System.out.println("============================");
			System.out.println("<P2의 빙고판>");
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					System.out.printf("[%2d] ", bingo2[i][j]);
				}
				System.out.println();
			}

			System.out.printf("[P%d]제거할 숫자를 입력하세요 : \n", turn);
			int inputNum = scan.nextInt();
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo1[i][j] == inputNum) {
						bingo1[i][j] = 0;
					}
				}
			}
			for (int i = 0; i < MAX_NUM; i++) {
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo2[i][j] == inputNum) {
						bingo2[i][j] = 0;
					}
				}
			}
			// 가로빙고 검사
			// P1
			for (int i = 0; i < MAX_NUM; i++) {
				int checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo1[i][j] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count1++;
					}
				}
			}
			// P2
			for (int i = 0; i < MAX_NUM; i++) {
				int checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo2[i][j] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count2++;
					}
				}
			}
			// 세로빙고 검사
			// P1
			for (int i = 0; i < MAX_NUM; i++) {
				int checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo1[j][i] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count1++;
					}
				}
			}
			// P2
			for (int i = 0; i < MAX_NUM; i++) {
				int checkBingo = 0;
				for (int j = 0; j < MAX_NUM; j++) {
					if (bingo2[j][i] == 0) {
						checkBingo++;
					}
					if (checkBingo == 5) {
						count2++;
					}
				}
			}
			// 대각빙고(왼 -> 오)
			// P1
			int checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo1[i][i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count1++;
				}
			}
			// P2
			checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo2[i][i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count2++;
				}
			}
			// 대각비고(오 -> 왼)
			// P1
			checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo1[i][MAX_NUM - 1 - i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count1++;
				}
			}
			// P2
			checkBingo = 0;
			for (int i = 0; i < MAX_NUM; i++) {
				if (bingo2[i][MAX_NUM - 1 - i] == 0) {
					checkBingo++;
				}
				if (checkBingo == 5) {
					count2++;
				}
			}
			if (count1 != count2 && count1 >= n) {
				System.out.println("P1빙고~!");
				play = false;
			} else if (count1 != count2 && count2 >= n) {
				System.out.println("P2빙고~!");
				play = false;
			} else if (count1 >= n & count2 >= 2) {
				System.out.println("무승부");
				play = false;
			}
			turn = (turn == 1) ? 2 : 1;

		}
	}

}
