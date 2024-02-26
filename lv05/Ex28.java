package lv05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 플레이어가 돌아다니면서 폭탄 내려놓듯이 구조물을 설치 -> 파일로 저장 후,
		// 콘솔종료후 재실행 시에도 -> 게임을 이어갈 수 있게 만들어보세요.

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		final int SIZE = 9;
		final int PLAYER = 2;
		final int WALL = 3;
		final int BALL = 4;
		final int GOAL = 5;
		final int a = 'a';
		final int w = 'w';
		final int d = 'd';
		final int s = 's';
		final int one = '1';
		final int two = '2';
		final int three = '3';
		final int zero = '0';

		int pY = 0;
		int pX = 0;

		int[][] map = new int[SIZE][SIZE];
		int[][] maker = new int[SIZE][SIZE];

		String fileName = "marker.txt";
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		String data = "";
		maker[pY][pX] = PLAYER;
		while (true) {
			System.out.println("[1]소코반 메이커");
			System.out.println("[2]게임 시작하기");
			// 저장된 맵이 있으면 -> 불러와서 게임시작
			System.out.println("[0] 종료하기");

			int choice = scan.nextInt();
			if (choice == 1) {
				while (true) {
					if (file.exists()) {
						try {
							fr = new FileReader(fileName);
							br = new BufferedReader(fr);
							data += br.readLine();
							br.close();
							fr.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						String[] tmp = data.split("/|,");
						System.out.println(Arrays.toString(tmp));
						int z = 0;
						for (int i = 0; i < SIZE; i++) {
							for (int j = 0; j < SIZE; j++) {
								maker[i][j] = Integer.parseInt(tmp[z]);
								z++;
							}
						}
					}
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] != 0 && maker[i][j] == PLAYER) {
								System.out.print("*\t");
							} else if (maker[i][j] == PLAYER) {
								System.out.print("옷\t");
							} else if (map[i][j] == WALL) {
								System.out.print("벽\t");
							} else if (map[i][j] == BALL) {
								System.out.print("공\t");
							} else if (map[i][j] == GOAL) {
								System.out.print("골\t");
							} else {
								System.out.print(maker[i][j] + "\t");
							}
						}
						System.out.println("\n");
					}
					System.out.println();
					System.out.println("[이동] ▶ 상(w)하(s)좌(a)우(d)");
					System.out.println("[설치] ▶ 벽(1)공(2)골(3)");
					System.out.println("[종료] ▶ 0");

					int move = scan.next().charAt(0);
					int y = pY;
					int x = pX;
					if (move == s) {
						y++;
					} else if (move == a) {
						x--;
					} else if (move == d) {
						x++;
					} else if (move == w) {
						y--;
					} else if (move == one) {
						map[pY][pX] = WALL;
						continue;
					} else if (move == two) {
						map[y][x] = BALL;
						continue;
					} else if (move == three) {
						map[y][x] = GOAL;
						continue;
					} else if (move == zero) {
						data = "";
						for (int i = 0; i < SIZE; i++) {
							for (int j = 0; j < SIZE; j++) {
								data += map[i][j];
								if (j != SIZE - 1) {
									data += ",";
								}
							}
							if (i != SIZE - 1) {
								data += "/";
							}
						}
						try {
							fw = new FileWriter(fileName);
							fw.write(data);
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("종료");
						break;
					}

					if (x >= SIZE || y >= SIZE || x < 0 || y < 0) {
						continue;
					}
					if (maker[pY][pX] == PLAYER) {
						maker[pY][pX] = 0;
					}
					pY = y;
					pX = x;
					maker[pY][pX] = PLAYER;
				}
			}

		}
	}

}
