//package lv05;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Ex29 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		Random random = new Random();
//		final int SIZE = 9;
//		final int PLAYER = 2;
//		final int WALL = 3;
//		final int BALL = 4;
//		final int GOAL = 5;
//		final int LEFT = 'a';
//		final int UP = 'w';
//		final int RIGHT = 'd';
//		final int DOWN = 's';
//
//		final int INSTALL_WALL = '1';
//		final int INSTALL_BALL = '2';
//		final int INSTALL_GOAL = '3';
//		final int REMOVE = '4';
//		final int EXIT = '0';
//
//		int pY = 0;
//		int pX = 0;
//
//		int[][] map = new int[SIZE][SIZE];
//		int[][] maker = new int[SIZE][SIZE];
//
//		String fileName = "marker.txt";
//		File file = new File(fileName);
//		FileWriter fw = null;
//		FileReader fr = null;
//		BufferedReader br = null;
//
//		int ballCnt = 0;
//		int goalCnt = 0;
////		String data = "";
//		maker[pY][pX] = PLAYER;
//
//		// 파일 로드
//		try {
//			fr = new FileReader(file);
//			br = new BufferedReader(fr);
//
//			int y = 0;
//			while (br.ready()) {
//				String[] line = br.readLine().split("/");
//
//				for (int x = 0; x < line.length; x++) {
//					map[y][x] = Integer.parseInt(line[x]);
//
//					if (map[y][x] == BALL) {
//						ballCnt++;
//					} else if (map[y][x] == GOAL) {
//						goalCnt++;
//					}
//				}
//				y++;
//			}
//			br.close();
//			fr.close();
//		} catch (IOException e) {
//			System.err.println("파일로드 실패");
//		}
//		while (true) {
//			System.out.println("[1]소코반 메이커");
//			System.out.println("[2]게임 시작하기");
//			// 저장된 맵이 있으면 -> 불러와서 게임시작
//			System.out.println("[0] 종료하기");
//
//			int choice = scan.nextInt();
//			if (choice == 1) {
//				while (true) {
////					if (file.exists()) {
////						try {
////							fr = new FileReader(fileName);
////							br = new BufferedReader(fr);
////							data += br.readLine();
////							br.close();
////							fr.close();
////						} catch (IOException e) {
////							e.printStackTrace();
////						}
////						String[] tmp = data.split("/|,");
////						System.out.println(Arrays.toString(tmp));
////						int z = 0;
////						for (int i = 0; i < SIZE; i++) {
////							for (int j = 0; j < SIZE; j++) {
////								maker[i][j] = Integer.parseInt(tmp[z]);
////								z++;
////							}
////						}
////					}
//					for (int i = 0; i < SIZE; i++) {
//						for (int j = 0; j < SIZE; j++) {
//							if (map[i][j] != 0 && maker[i][j] == PLAYER) {
//								System.out.print("* ");
//							}
////							else if (i == pY && j == pX) {
////								System.out.print("옷\t");
////							}
//							else if (maker[i][j] == PLAYER) {
//								System.out.print("옷 ");
//							} else if (map[i][j] == WALL) {
//								System.out.print("벽 ");
//							} else if (map[i][j] == BALL) {
//								System.out.print("공 ");
//							} else if (map[i][j] == GOAL) {
//								System.out.print("골 ");
//							} else {
//								System.out.print("+ ");
//							}
//						}
//						System.out.println("");
//					}
//					System.out.println();
//					System.out.println("[이동] ▶ 상(w)하(s)좌(a)우(d)");
//					System.out.println("[설치] ▶ 벽(1)공(2)골(3)제거(4)");
//					System.out.println("[종료] ▶ 0");
//
//					int move = scan.next().charAt(0);
//
//					int y = pY;
//					int x = pX;
//					if (move == LEFT) {
//						x--;
//					} else if (move == RIGHT) {
//						x++;
//					} else if (move == UP) {
//						y--;
//					} else if (move == DOWN) {
//						y++;
//					}
//
//					if (y < 0 || y >= SIZE || x < 0 || x >= SIZE) {
//						continue;
//					}
//					if (map[y][x] != 0 && (move == INSTALL_WALL || move == INSTALL_BALL || move == INSTALL_GOAL)) {
//						continue;
//					}
//
//					if (move == INSTALL_WALL) {
//						map[y][x] = WALL;
//					} else if (move == INSTALL_BALL) {
//						map[y][x] = BALL;
//						ballCnt++;
//					} else if (move == INSTALL_GOAL) {
//						map[y][x] = GOAL;
//						goalCnt++;
//					} else if (move == REMOVE) {
//						if (map[y][x] == GOAL) {
//							goalCnt--;
//						} else if (map[y][x] == GOAL) {
//							goalCnt--;
//						}
//						map[y][x] = 0;
//					} else if (move == EXIT) {
//						if (ballCnt != goalCnt) {
//							System.out.println("공과 공대는 쌍을 이루어야 합니다.");
//							continue;
//						}
//						break;
//					}
//					maker[pY][pX] = 0;
//					pY = y;
//					pX = x;
//					maker[pY][pX] = PLAYER;
//
////					int y = pY;
////					int x = pX;
////					if (move == s) {
////						y++;
////					} else if (move == a) {
////						x--;
////					} else if (move == d) {
////						x++;
////					} else if (move == w) {
////						y--;
////					} else if (move == one) {
////						map[pY][pX] = WALL;
////						continue;
////					} else if (move == two) {
////						map[y][x] = BALL;
////						continue;
////					} else if (move == three) {
////						map[y][x] = GOAL;
////						continue;
////					} else if (move == zero) {
////						data = "";
////						for (int i = 0; i < SIZE; i++) {
////							for (int j = 0; j < SIZE; j++) {
////								data += map[i][j];
////								if (j != SIZE - 1) {
////									data += ",";
////								}
////							}
////							if (i != SIZE - 1) {
////								data += "/";
////							}
////						}
////						try {
////							fw = new FileWriter(fileName);
////							fw.write(data);
////							fw.close();
////						} catch (IOException e) {
////							e.printStackTrace();
////						}
////						System.out.println("종료");
////						break;
////					}
////
////					if (x >= SIZE || y >= SIZE || x < 0 || y < 0) {
////						continue;
////					}
////					if (maker[pY][pX] == PLAYER) {
////						maker[pY][pX] = 0;
////					}
////					pY = y;
////					pX = x;
////					maker[pY][pX] = PLAYER;
//				}
//			} else if (choice == 2) {
//				int y =0;
//				int x = 0;
//				
//				while(true) {
//					int rY = random.nextInt(SIZE);
//					int rX = random.nextInt(SIZE);
//					
//					if(map[rY][rX] == 0) {
//						map[rY][rX] = PLAYER;
//						y = rY;
//						x = rX;
//						break;
//					}
//				}
//			}
//			
//			boolean isRun = true;
//			while(isRun) {
//				for (int i = 0; i < SIZE; i++) {
//					for (int j = 0; j < SIZE; j++) {
//						if (maker[i][j] == PLAYER) {
//							System.out.print("옷 ");
//						} else if (map[i][j] == WALL) {
//							System.out.print("벽 ");
//						} else if (map[i][j] == BALL) {
//							System.out.print("공 ");
//						} else if (map[i][j] == GOAL) {
//							System.out.print("골 ");
//						} else {
//							System.out.print("+ ");
//						}
//					}
//					System.out.println();
//				}
//				System.out.println();
//				System.out.println("[이동] ▶ 상(w)하(s)좌(a)우(d)");
//				System.out.println("[종료] ▶ 0");
//				int move = scan.next().charAt(0);
//				
//				int yy = y;
//				int xx = x;
//				
//				if (move == LEFT) {
//					xx--;
//				}else if(move == RIGHT) {
//					xx ++;
//				}else if(move == UP) {
//					yy --;
//				}else if(move == DOWN) {
//					yy ++;
//				}
//				if(yy < 0 || yy >= SIZE || xx < 0 || x >= SIZE || map[yy][xx] ) {
//					
//				}
//				
//				if (map[yy][xx] == BALL) {
//					int bY = yy;
//					int bX = xx;
//					
//					if (move == LEFT) {
//						bX --;
//					}
//					else if (move == RIGHT) {
//						bX ++;
//					}
//					else if (move == UP) {
//						bY--;
//					}
//					else if (move == DOWN) {
//						bY ++;
//					}
//					if (bY < 0 || bY >= SIZE || bX < 0 || bX >= SIZE)
//				}
//			}
//			String mapData = "";
//
//			for (int i = 0; i < SIZE; i++) {
//				String line = "";
//				for (int j = 0; j < SIZE; j++) {
//					line += map[i][j] + "/";
//				}
//				mapData += line.substring(0, line.length() - 1);
//
//				if (i < SIZE - 1) {
//					mapData += "\n";
//				}
//			}
//
//			try {
//				fw = new FileWriter(file);
//				fw.write(mapData);
//				fw.close();
//
//				System.out.println("파일저장 성공");
//			} catch (IOException e) {
//				System.err.println("파일저장 실패");
//			}
//
//		}
//	}
//
//}
