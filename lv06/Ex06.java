//package lv06;
//
//import java.util.Scanner;
//
//class Ladder {
//	Scanner sc = new Scanner(System.in);
//	final int HOOK = 1;
//	final int HEIGHT = 9;
//	final int MIN_PLAYER_CNT = 2;
//
//	int player;		// 플레이어 수
//	int ladder[][];
//	
//	String[] menu;
//	boolean[] isPlayedMenu;
//	boolean[] isHook;
//	boolean[] isOpen;
//	
//	void setGame() {
//		setPlayer();
//		setMenu();
//		setLadder();
//	}
//
//	void setMenu() {
//		menu = new String[player];
//		isPlayedMenu = new boolean[player];
//
//		for (int i = 0; i < player; i++) {
//			System.out.printf("%d번 메뉴: ", i + 1);
//			menu[i] = sc.next();
//		}
//		System.out.println();
//	}
//
//	void setPlayer() {
//		while (player < MIN_PLAYER_CNT) {
//			System.out.print("플레이어 수: ");
//			player = inputNumber();
//		}
//	}
//	
//	void setLadder() {
//		ladder = new int[HEIGHT][player];
//		isHook = new boolean[player];
//
//		for (int i = 0; i < HEIGHT; i++) { 
//			for (int j = 0; j < player - 1; j++) { 
//				int ladderVal = (int)(Math.random() * 2);
//				ladder[i][j] = ladderVal;
//				
//				if (ladderVal == HOOK) {
//					isHook[j] = true;
//					ladder[i][++j] = HOOK;
//				}
//			}
//			
//			if (i == HEIGHT - 1) {
//				for (int j = 0; j <player - 1; j++) {
//					if (!isHook[j]) {
//						ladder = new int[HEIGHT][player];
//						isHook = new boolean[player];
//
//						i = -1;
//					}
//				}
//			}
//		}
//	}
//
//	void printLadder() {
//		for (int i = 0; i < player; i++)
//			System.out.print(i + 1 + " ");
//
//		System.out.println();
//
//		for (int i = 0; i < HEIGHT; i++) {
//			for (int j = 0; j < player; j++) {
//				if (j + 1 < player && ladder[i][j + 1] == HOOK && ladder[i][j] == HOOK) {
//					System.out.print("├─┤ ");
//					j++;
//				} else
//					System.out.print("│ ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < player; i++) {
//			if (isPlayedMenu[i])
//				System.out.print(menu[i] + " ");
//			else {
//				System.out.print("? ");
//			}
//		}
//		
//		System.out.println();
//	}
//
//	int inputNumber() {
//		int num = -1;
//
//		try {
//			String input = sc.next();
//			num = Integer.parseInt(input);
//
//		} catch (Exception e) {
//			System.out.println("숫자만 허용");
//		}
//		
//		return num;
//	}
//
//	boolean isRun() {
//		for (int i = 0; i < player; i++) {
//			if (!isPlayedMenu[i])
//				return true;
//		}
//
//		return false;
//	}
//	
//	void play(int number) {
//		if(number < 1 || number > player) {
//			return;
//		}
//		
//		int x = number -1;
//		for(int y = 0; y < HEIGHT; y++) {
//			if(ladder[y][x] == HOOK) {
//				int cnt = 0;
//				for(int i = 0; i<x; i++) {
//					if(ladder[y][i] == HOOK) {
//						cnt ++;
//					}
//				}
//				if(cnt % 2 == 0) {
//					x ++;
//				}
//				else {
//					x --;
//				}
//			}
//		}
//		if (!isOpen[x]) {
//			System.out.printf("결과 %s 당첨\n", menu[x]);
//			isOpen[x] = true;
//		} else {
//			System.out.println("이미 고른 번호입니다.");
//		}
//	}
//}
//public class Ex06 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Ladder ladder = new Ladder();
//	}
//
//}
