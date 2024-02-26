package lv04;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		final int SIZE = 7;
		final int PLAYER = 2; // ▲
		final int BALL = 3; // ●
		final int GOAL = 6; // ☐
		final int WALL = 9; // ■
		final int LOAD = 0; // +︎

		int[][] map = new int[SIZE][SIZE];

		int wallCount = 0;

		// 플레이어 1명 (좌표)
		int pY = 0;
		int pX = 0;

		// 공 1개 (좌표)
		int ballY = 0;
		int ballX = 0;

		// 골대 1개 (좌표)
		int goalY = 0;
		int goalX = 0;

		// 벽설치 (개수만큼 랜덤 좌표에 배치, ~10개)
		while (wallCount < 1 || wallCount > 10) {
			System.out.print(">>>설치할 벽의 개수를 입력하세요 : ");
			wallCount = scan.nextInt();
		}

		while (wallCount > 0) {

			int rNum1 = random.nextInt(SIZE);
			int rNum2 = random.nextInt(SIZE);
			if (map[rNum1][rNum2] == LOAD) {
				map[rNum1][rNum2] = WALL;
				wallCount--;
			}
		}

		// 공 설치
		while (true) {
			ballY = random.nextInt(SIZE);
			ballX = random.nextInt(SIZE);
			int count = 4;
			// 사각지대 변수
			if ((ballY == 0 && ballX == 0) || (ballY == 0 && ballX == 6) || (ballY == 6 && ballX == 0)
					|| ballY == 6 && ballX == 6) {
				continue;
			}
			// 테두리에 있을때 옆에 벽이 있는 변수
			if (ballY == 0 || ballY == 6 || ballX == 0 || ballX == 6) {
				continue;
			}
			if (map[ballY - 1][ballX] == LOAD) {
				count--;
			}
			if (map[ballY + 1][ballX] == LOAD) {
				count--;
			}
			if (map[ballY][ballX - 1] == LOAD) {
				count--;
			}
			if (map[ballY][ballX + 1] == LOAD) {
				count--;
			}
			if (count > 1) {
				continue;
			}
//			else if (ballX == 0 || ballX == 6) {
//				if (map[ballY -1][ballX] == WALL || map[ballY + 1][ballX] == WALL) {
//					continue;
//				}
//			}
//			//볼 주변에 벽이 2개 있을 경우 
//			if((ballY > 0 && ballY < 6) && (ballX > 0 && ballX < 6)) {
//				if((map[ballY][ballX + 1] == WALL && map[ballY + 1][ballX] == WALL) || (map[ballY - 1][ballX] == WALL && map[ballY][ballX - 1] == WALL)) {
//					continue;
//				}
//			}

			if (map[ballY][ballX] == LOAD) {
				map[ballY][ballX] = BALL;
				break;
			}
		}
		// 골대 설치
		while (true) {
			goalY = random.nextInt(SIZE);
			goalX = random.nextInt(SIZE);

			if (map[goalY][goalX] == LOAD) {
				map[goalY][goalX] = GOAL;
				break;
			}
		}
		// 플레이어 배치
		while (true) {
			pY = random.nextInt(SIZE);
			pX = random.nextInt(SIZE);
			int count = 0;
			if (pY > 0) {
				if (map[pY - 1][pX] == LOAD) {
					count--;
				}
			}
			if (pY < 6) {
				if (map[pY + 1][pX] == LOAD) {
					count--;
				}
			}
			if (pX > 0) {
				if (map[pY][pX - 1] == LOAD) {
					count--;
				}
			}
			if (pX < 6) {
				if (map[pY][pX + 1] == LOAD) {
					count--;
				}
			}
			if (count > 1) {
				continue;
			}
			if (map[pY][pX] == LOAD) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		System.out.println("====Play Sokoban====");
		System.out.println("▲를 움직여서 ●를 ☐안에 넣으세요.");
		// 게임 시작
		while (true) {
			// 맵 출력
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) {
						System.out.print("▲ ");
					} else if (map[i][j] == BALL) {
						System.out.print("● ");
					} else if (map[i][j] == GOAL) {
						System.out.print("☐ ");
					} else if (map[i][j] == WALL) {
						System.out.print("■ ");
					} else if (map[i][j] == LOAD) {
						System.out.print("+︎ ");
					}
				}
				System.out.println();
			}
			System.out.println("a) 왼쪽 d) 오른쪽 w) 위 s) 아래");
			String sel = scan.next();
			// 플레이어 임시위치
			int y = pY;
			int x = pX;
			// 볼 임시위치
			int a = ballY;
			int b = ballX;
			if (sel.equals("a")) {
				x--;
				if (x >= 0 && map[y][x] == BALL) {
					b--;
				}
			} else if (sel.equals("d")) {
				x++;
				if (x < 7 && map[y][x] == BALL) {
					b++;
				}
			} else if (sel.equals("w")) {
				y--;
				if (y >= 0 && map[y][x] == BALL) {
					a--;
				}
			} else if (sel.equals("s")) {
				y++;
				if (y < 7 && map[y][x] == BALL) {
					a++;
				}
			}
			// 임시좌표 변화를 가지고 예외처리
			if (x < 0 || x >= SIZE || y < 0 || y >= SIZE || map[y][x] == WALL || map[y][x] == GOAL || a < 0 || a >= SIZE
					|| b < 0 || b >= SIZE || map[a][b] == WALL) {
				continue;
			}

			// 이동
			map[pY][pX] = LOAD;
			map[ballY][ballX] = LOAD;
			ballY = a;
			ballX = b;
			map[ballY][ballX] = BALL;
			pY = y;
			pX = x;
			map[pY][pX] = PLAYER;

			// 종료조건
			if (map[ballY][ballX] == map[goalY][goalX]) {
				for (int i = 0; i < SIZE; i++) {
					for (int j = 0; j < SIZE; j++) {
						if (map[i][j] == PLAYER) {
							System.out.print("▲ ");
						} else if (map[i][j] == BALL) {
							System.out.print("● ");
						} else if (map[i][j] == GOAL) {
							System.out.print("☐ ");
						} else if (map[i][j] == WALL) {
							System.out.print("■ ");
						} else if (map[i][j] == LOAD) {
							System.out.print("+︎ ");
						}
					}
					System.out.println();
				}
				System.out.println("Mission Success");
				break;
			}

		}
	}

}
