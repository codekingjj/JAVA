package lv03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #미니마블 1. 플레이어는 p1과 p2 2명이다. 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다. 3. 이동하다가 다음 플레이어와
		 * 같은 위치에 놓이게 되면, 상대 플레이어는 잡히게 되어 원점으로 되돌아간다. 4. 먼저 3바퀴를 돌면 이긴다.
		 * 
		 * [p2] 1~3 1 2 3 4 5 6 7 8 0 1 0 0 0 0 0 0 0 0 0 2 0 0 0 0
		 * 
		 * p[1] 1~3 입력 : 2 [p1]이 p2를 잡았다.! 1 2 3 4 5 6 7 8 0 0 0 1 0 0 0 0 2 0 0 0 0 0 0
		 * 0
		 */
		Scanner scan = new Scanner(System.in);

		final int P1 = 1;
		final int P2 = 2;

		int[] game = null;
		int[] p1 = null;
		int[] p2 = null;
		boolean play = true;

		game = new int[8];
		for (int i = 0; i < 8; i++)
			game[i] = i + 1;
		p1 = new int[8];
		p2 = new int[8];

		int turn = P1;

		int idx1 = 0;
		int idx2 = 0;

		int cycle1 = 0;
		int cycle2 = 0;

		p1[idx1] = P1;
		p2[idx2] = P2;

		while (play) {
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1));
			System.out.println(Arrays.toString(p2));
			if (turn == P1) {
				System.out.println("P1이 1~3사이의 움직일 칸수를 입력하세요 : ");
				int idx = scan.nextInt();
				if (idx >= 1 && idx <= 3) {
					p1[idx1] = 0;
					idx1 += idx;
					if (idx1 <= 7) {
						p1[idx1] = P1;
					} else if (idx1 > 7) {
						idx1 -= 8;
						p1[idx1] = P1;
						cycle1++;
					}
					turn++;
				} else {
					System.out.println("입력값의 범위를 초과하였습니다.");
				}
				System.out.println("P1의 바큇 수 : " + cycle1);
				System.out.println("P2의 바큇 수 : " + cycle2);
				System.out.println();
				// 잡으면 상대 원위치
				if (idx1 == idx2) {
					System.out.println("P1이 P2를 잡았습니다~");
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = P2;
				}
				if (cycle1 == 4) {
					System.out.println("P1이 승리하였습니다.");
					play = false;
				}
			}

			else if (turn == P2) {
				System.out.println("P2가 1~3사이의 움직일 칸수를 입력하세요 : ");
				int idx = scan.nextInt();
				if (idx >= 1 && idx <= 3) {
					p2[idx2] = 0;
					idx2 += idx;
					if (idx2 <= 7) {
						p2[idx2] = P2;
					} else if (idx2 > 7) {
						idx2 -= 8;
						p2[idx2] = P2;
						cycle2++;
					}
					turn--;
				} else {
					System.out.println("입력값의 범위를 초과하였습니다.");
				}
				System.out.println("P1의 바큇 수 : " + cycle1);
				System.out.println("P2의 바큇 수 : " + cycle2);
				System.out.println();
				// 잡으면 상대 원위치
				if (idx2 == idx1) {
					System.out.println("P2가 P1을 잡았습니다~");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = P1;
				}
				if (cycle2 == 4) {
					System.out.println("P2가 승리하였습니다.");
					play = false;
				}
			}
		}

	}

}
