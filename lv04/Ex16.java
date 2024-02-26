package lv04;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int SIZE = 10;
		final int P1 = 1;
		final int P2 = 2;
		int[][] omok = new int[SIZE][SIZE];

		int p1Y = 0;
		int p1X = 0;

		int p2Y = 0;
		int p2X = 0;

		int turn = P1;

		int win = 0;

		boolean run = true;
		while (run) {
			// 오목판 출력
			System.out.println();
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (omok[i][j] == 0) {
						System.out.print("─┼─");
					} else if (omok[i][j] == P1) {
						System.out.print("─●─");
					} else if (omok[i][j] == P2) {
						System.out.print("─○─");
					}
				}
				System.out.println();
			}

			// turn에 따라 입력 출력
//			int[][] tmp = omok;
//			omok = new int[SIZE][SIZE];
			System.out.printf("[P%d] 입력할 x좌표 입력해주세요 : \n", turn);
			int inputX = scan.nextInt();
			System.out.printf("[P%d] 입력할 y좌표 입력해주세요 : \n", turn);
			int inputY = scan.nextInt();
			if (turn == 1) {
				if (omok[inputX][inputY] == 0) {
					p1Y = inputX;
					p1X = inputY;
					omok[p1Y][p1X] = P1;
				} else if (omok[inputX][inputY] != 0) {
					continue;
				}
			} else if (turn == 2) {
				if (omok[inputX][inputY] == 0) {
					p2Y = inputX;
					p2X = inputY;
					omok[p2Y][p2X] = P2;
				} else if (omok[inputX][inputY] != 0) {
					continue;
				}
			}
//			for (int i = 0; i < SIZE; i++) {
//				for (int j = 0; j < SIZE; j++) {
//					omok[i][j]= tmp[i][j];
//				}
//			}
			// 가로체크
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE - 4; j++) {
					if (omok[i][j] == P1 && omok[i][j + 1] == P1 && omok[i][j + 2] == P1 && omok[i][j + 3] == P1
							&& omok[i][j + 4] == P1) {
						System.out.println("P1 승리!");
						run = false;
					} else if (omok[i][j] == P2 && omok[i][j + 1] == P2 && omok[2][j + 2] == P2 && omok[i][j + 3] == P2
							&& omok[i][j + 4] == P2) {
						System.out.println("P2 승리!");
						run = false;
					}
				}
			}
			// 세로체크
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE - 4; j++) {
					if (omok[j][i] == P1 && omok[j + 1][i] == P1 && omok[j + 2][i] == P1 && omok[j + 3][i] == P1
							&& omok[j + 4][i] == P1) {
						System.out.println("P1 승리!");
					} else if (omok[j][i] == P2 && omok[j + 1][i] == P2 && omok[j + 2][i] == P2 && omok[j + 3][i] == P2
							&& omok[j + 4][i] == P2) {
						System.out.println("P2 승리!");
					}
				}
			}
			// 대각체크(하향)(1)
			for (int i = 5; i >= 0; i--) {
				int count = 0;
				for (int j = 0; j < 5 + count; j++) {
					if (omok[i][j] == P1 && omok[i + 1][j + 1] == P1 && omok[i + 2][j + 2] == P1
							&& omok[i + 3][j + 3] == P1 && omok[i + 4][j + 4] == P1) {
						System.out.println("P1 승리!");
						run = false;
					} else if (omok[i][j] == P2 && omok[i + 1][j + 1] == P2 && omok[i + 2][j + 2] == P2
							&& omok[i + 3][j + 3] == P2 && omok[i + 4][j + 4] == P2) {
						System.out.println("P2 승리!");
						run = false;
					}
				}
				count++;
			}
			// 대각체크(하향)(2)
			for (int i = 5; i >= 1; i--) {
				int count = 0;
				for (int j = 0; j < 5 + count; j++) {
					if (omok[j][i] == P1 && omok[j + 1][i + 1] == P1 && omok[j + 2][i + 2] == P1
							&& omok[j + 3][i + 3] == P1 && omok[j + 4][i + 4] == P1) {
						System.out.println("P1 승리!");
						run = false;
					} else if (omok[j][i] == P2 && omok[j + 1][i + 1] == P2 && omok[j + 2][i + 2] == P2
							&& omok[j + 3][i + 3] == P2 && omok[j + 4][i + 4] == P2) {
						System.out.println("P2 승리!");
						run = false;
					}
				}
				count++;
			}
			// 대각체크(상향)(1)
			for (int i = 4; i < SIZE; i++) {
				int count = 0;
				for (int j = 0; j < 5 + count; j++) {
					if (omok[i][j] == P1 && omok[i - 1][j + 1] == P1 && omok[i - 2][j + 2] == P1
							&& omok[i - 3][j + 3] == P1 && omok[i - 4][j + 4] == P1) {
						System.out.println("P1 승리!");
						run = false;
					} else if (omok[i][j] == P2 && omok[i - 1][j + 1] == P2 && omok[i - 2][j + 2] == P2
							&& omok[i - 3][j + 3] == P2 && omok[i - 4][j + 4] == P2) {
						System.out.println("P2 승리!");
						run = false;
					}
				}
				count++;
			}
			// 대각체크(상향)(2)
			for (int i = 5; i >= 0; i--) {
				int count = 0;
				for (int j = 9; j > 8 - count; j--) {
					if (omok[j][i] == P1 && omok[j - 1][i + 1] == P1 && omok[j - 2][i + 2] == P1
							&& omok[j - 3][i + 3] == P1 && omok[j - 4][i + 4] == P1) {
						System.out.println("P1 승리!");
						run = false;
					} else if (omok[j][i] == P2 && omok[j - 1][i + 1] == P2 && omok[j - 2][i + 2] == P2
							&& omok[j - 3][i + 3] == P2 && omok[j - 4][i + 4] == P2) {
						System.out.println("P2 승리!");
						run = false;
					}
				}
				count++;
			}
			turn = (turn == 1) ? 2 : 1;
		}
		scan.close();
	}

}
