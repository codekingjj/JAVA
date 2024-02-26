package lv03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #틱택토 ===틱택토=== [X][X][O] [][O][] [][][] [p1]인덱스 입력 : 6 ===틱택토=== [X][X][O]
		 * [][O][] [O][][] [p1]승리
		 */

		Scanner scan = new Scanner(System.in);

		final int SIZE = 9;
		final int P1 = 1;
		final int P2 = 2;

		boolean play = true;
		int[] game = new int[SIZE];
		int turn = 1;

		for (int i = 0; i < 9; i++) {
			if (game[i] == P1) {
				System.out.print("[O]");
			} else if (game[i] == P2) {
				System.out.print("[X]");
			} else {
				System.out.print("[ ]");
			}
			if ((i + 1) % 3 == 0) {
				System.out.print("\n");
			}
		}

		while (play) {
			if (turn == P1) {
				System.out.println("p1인덱스 입력 : ");
				int p1 = scan.nextInt();
				if (p1 >= 1 && p1 <= 9) {
					if (game[p1 - 1] == 0) {
						game[p1 - 1] = P1;
						turn++;
						for (int i = 0; i < 9; i++) {
							if (game[i] == P1) {
								System.out.print("[O]");
							} else if (game[i] == P2) {
								System.out.print("[X]");
							} else {
								System.out.print("[ ]");
							}
							if ((i + 1) % 3 == 0) {
								System.out.print("\n");
							}
						}
					} else {
						System.out.println("이미 선택한 구역입니다.");
					}

				} else {
					System.out.println("입력할 수 있는 값의 범위가 초과하였습니다.");
				}
				for (int i = 0; i < 9; i += 3) {
					for (int j = i; j < i; j++) {
						if (game[j] == P1 && game[j + 1] == P1 && game[j + 2] == P1) {
							turn = 3;
							play = false;
						}
					}
					// 가로빙고
//					if (game[i] == P1 && game[i + 1] == P1 && game[i + 2] == P1) {
//						turn = 3;
//						play = false;
//					}
				}
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 7; j += 3) {
						if (game[j] == P1 && game[j + 3] == P1 && game[j + 6] == P1) {
							turn = 3;
							play = false;
						}
					}
					// 세로빙고
//					if (game[i] == P1 && game[i + 3] == P1 && game[i + 6] == P1) {
//						turn = 3;
//						play = false;
//					}
				}
				if (game[0] == P1 && game[4] == P1 && game[8] == P1) {
					turn = 3;
					play = false;
				} else if (game[2] == P1 && game[4] == P1 && game[6] == P1) {
					turn = 3;
					play = false;
				}
			} else if (turn == P2) {
				System.out.println("p2인덱스 입력 : ");
				int p2 = scan.nextInt();
				if (p2 >= 1 && p2 <= 9) {
					if (game[p2 - 1] == 0) {
						game[p2 - 1] = P2;
						turn--;
						for (int i = 0; i < 9; i++) {
							if (game[i] == P1) {
								System.out.print("[O]");
							} else if (game[i] == P2) {
								System.out.print("[X]");
							} else {
								System.out.print("[ ]");
							}
							if ((i + 1) % 3 == 0) {
								System.out.print("\n");
							}
						}
					} else {
						System.out.println("이미 선택한 구역입니다.");
					}

				} else {
					System.out.println("입력할 수 있는 값의 범위가 초과하였습니다.");
				}
				for (int i = 0; i < 9; i += 3) {
					for (int j = i; j < i; j++) {
						if (game[j] == P2 && game[j + 1] == P2 && game[j + 2] == P2) {
							turn = 4;
							play = false;
						}
						// 가로빙고
//					if (game[i] == P2 && game[i + 1] == P2 && game[i + 2] == P2) {
//						turn = 4;
//						play = false;
//					}
					}
				}
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 7; j += 3) {
						if (game[j] == P2 && game[j + 3] == P2 && game[j + 6] == P2) {
							turn = 4;
							play = false;
						}
					}

					// 세로빙고
//					if (game[i] == P2 && game[i + 3] == P2 && game[i + 6] == P2) {
//						turn = 4;
//						play = false;
//					}
				}
				if (game[0] == P2 && game[4] == P2 && game[8] == P2) {
					turn = 4;
					play = false;
				} else if (game[2] == P2 && game[4] == P2 && game[6] == P2) {
					turn = 4;
					play = false;
				}
			}

		}
		if (turn == 3) {
			System.out.println("p1이 이겼습니다~");
		} else if (turn == 4) {
			System.out.println("p2가 이겼습니다~");
		}
	}

}
