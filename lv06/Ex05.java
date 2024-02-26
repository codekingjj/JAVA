package lv06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ladder {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	final int HOOK = 1;
	final int HEIGHT = 9;

	int player;
	int ladder[][];
	String[] menu;
	int[] check;

	void countPlayer() {
		while (true) {
			System.out.println("플레이어 수를 입력하세요 : ");
			int countPlayer = scan.nextInt();
			player = countPlayer;
			if (countPlayer < 0) {
				continue;
			} else {
				break;
			}
		}
	}

	void setMenu() {
		menu = new String[player];
		check = new int[player];
		for (int i = 0; i < player; i++) {
			System.out.println("메뉴를 입력해주세요 : ");
			String setMenu = scan.next();
			menu[i] = setMenu;
		}
	}

	void setLadder() {
		ladder = new int[HEIGHT][player];
		for (int i = 0; i < player - 1; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				int rNum = random.nextInt(2);
				if (ladder[j][i] == 0) {
					ladder[j][i] = rNum;
					if (ladder[j][i] == HOOK) {
						ladder[j][i + 1] = HOOK;
					}
				}
			}
		}
	}

	void printLadder() {
		int[] printPlayer = new int[player];
		for (int i = 0; i < player; i++) {
			printPlayer[i] = i + 1;
		}
		for (int i = 0; i < player; i++) {
			System.out.print(printPlayer[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < player; j++) {
				if (j < player - 1 && ladder[i][j] == HOOK && ladder[i][j + 1] == HOOK) {
					System.out.print("├─");
					j++;
					System.out.print("┤ ");
				} else {
					System.out.print("│ ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < check.length; i++) {
			if (check[i] == 1) {
				System.out.print(menu[i]);
			} else {
				System.out.print("● ");
			}
		}
		System.out.println();
	}

	void play(int number) {
		boolean isRun = true;
		if (number <= 0 || number > player) {
			isRun = false;
		}
		int pX = number - 1;
		if (isRun) {
			for (int i = 0; i < HEIGHT; i++) {
				int count = 0;
				if (ladder[i][pX] == 0) {
					continue;
				}
				else if (ladder[i][pX] == 1) {
					for (int j = 0; j < pX; j++) {
						if (ladder[i][j] == 1) {
							count ++;
						}
					}
					if (count % 2 == 0) {
						pX ++;
					}else {
						pX --;
					}
				}
			}
			System.out.printf("%s 당첨!!\n", menu[pX]);
			check[pX] = 1;
		}
	}

	void run() {
		countPlayer();
		setMenu();
		setLadder();
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Ladder ladder = new Ladder();
		ladder.run();
		while (true) {
			ladder.printLadder();
			System.out.println("번호를 입력하세요 : ");
			int num = scan.nextInt();
			ladder.play(num);
		}
	}

}
