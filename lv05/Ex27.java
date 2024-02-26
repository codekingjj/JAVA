package lv05;

import java.util.Random;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #크레이지 아케이드 1. 맵의 크기는 7 X 7이다 2. 상(w)하(s)좌(a)우(d)로 이동이 가능하며, 폭탄설치(e), 폭파(q)로
		 * 설정한다. 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다. 4. 단, 폭탄이 설치된 순서대로 터져야 하면, 폭파 시
		 * 십자가 형태로 터진다. 5. 벽 파괴시 아이템이 랜덤하게 생성되어, 아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		final int SIZE = 7;
		final int LOAD = 0;
		final int PLAYER = 2;
		final int WALL = 3;
		final int ITEM = 4;
		final int BOMB = 9;
		int[][] map = new int[SIZE][SIZE];

		int wallCount = random.nextInt(20) + 10;
		int bombCount = 1;

		// player설정
		int pY = random.nextInt(SIZE);
		int pX = random.nextInt(SIZE);
		map[pY][pX] = PLAYER;
		// 벽설정
		for (int i = 0; i < wallCount; i++) {
			int rNum1 = random.nextInt(SIZE);
			int rNum2 = random.nextInt(SIZE);
			if (map[rNum1][rNum2] == LOAD) {
				map[rNum1][rNum2] = WALL;
			} else {
				i--;
			}
		}
		while (true) {
			System.out.println("설치 가능한 폭탄개수 : " + bombCount);
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) {
						System.out.print("옷 ");
					} else if (map[i][j] == WALL) {
						System.out.print("■ ");
					} else if (map[i][j] == ITEM) {
						System.out.print("* ");
					} else if (map[i][j] == BOMB) {
						System.out.print("@ ");
					} else {
						System.out.print(". ");
					}
				}
				System.out.println();
			}

			System.out.println("상(w), 하(s), 좌(a), 우(d), \n폭탄설치(e), 폭파(q) : ");
			String sel = scan.next();
			int y = pY;
			int x = pX;
			// 이동관련
			if (sel.equals("w")) {
				y--;
			} else if (sel.equals("s")) {
				y++;
			} else if (sel.equals("a")) {
				x--;
			} else if (sel.equals("d")) {
				x++;
			} else if (sel.equals("e")) {
				if (map[pY][pX] == BOMB || bombCount == 0) {
					continue;
				}
				map[pY][pX] = BOMB;
				bombCount--;
			} else if (sel.equals("q")) {
				// 나중에d

			}

			if (map[y][x] == WALL || map[y][x] == BOMB || y >= SIZE || y < 0 || x < 0 || x >= SIZE) {
				continue;
			}
			System.out.print("fdf");
			map[pY][pX] = LOAD;
			pY = y;
			pX = x;
			map[pY][pX] = PLAYER;
			
			//힌튼 : 설치된 푝탄의 좌표를 기억 (0인덱스 폭탄부터 차례대로 1개씩 폭파)
			int[][] bombYx = null;	//{{bombY, bombX}, {bombY, bombX}, ...}
		}
	}

}
