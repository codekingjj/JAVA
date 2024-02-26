package test.lv3;

//시작시간 10:47
//종료시간 11:43
//소요시간 00:56
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Test 3

		// 3.
		/*
		 * #틱택토 ===틱택토=== [X] [X] [O] [ ] [O] [ ] [ ] [ ] [ ] [p1]인덱스 입력 : 6 ===틱택토===
		 * [X] [X] [O] [ ] [O] [ ] [O] [ ] [ ] [p1]승리
		 */

		Scanner scan = new Scanner(System.in);

		final int SIZE = 9;
		final int P1 = 1;
		final int P2 = 2;
		int[] map = new int[SIZE];
		boolean play = true;
		int turn = 1;

		while (play) {
			for (int i = 0; i < 9; i++) {
				if (map[i] == 0) {
					System.out.print("[ ]");
				} else if (map[i] == P1) {
					System.out.print("[X]");
				} else if (map[i] == P2) {
					System.out.print("[O]");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if (turn == P1) {
				System.out.println("p1 인덱스 입력 : ");
				int index = scan.nextInt();
				if (index >= 1 && index <= 9) {
					if (map[index - 1] == 0) {
						map[index - 1] = P1;
						turn++;
					} else {
						System.out.println("이미 선택되어진 자리 입니다.");
					}
				} else {
					System.out.println("입력할수 있는 범위를 초과하였습니다.");
				}
				for (int i = 0; i < 9; i += 3) {
					if (map[i] == P1 && map[i + 1] == P1 && map[i + 2] == P1) {
						System.out.println("P1이 승리하였습니다.");
						play = false;
					}

				}
				for (int i = 0; i < 3; i++) {
					if (map[i] == P1 && map[i + 3] == P1 && map[i + 6] == P1) {
						System.out.println("P1이 승리하였습니다.");
						play = false;
					}
				}
				if (map[0] == P1 && map[4] == P1 && map[8] == P1) {
					System.out.println("P1이 승리하였습니다.");
					play = false;
				}
				if (map[2] == P1 && map[4] == P1 && map[6] == P1) {
					System.out.println("P1이 승리하였습니다.");
					play = false;
				}
			} else if (turn == 2) {
				System.out.println("p2 인덱스 입력 : ");
				int index = scan.nextInt();
				if (index >= 1 && index <= 9) {
					if (map[index - 1] == 0) {
						map[index - 1] = P2;
						turn--;
					} else {
						System.out.println("이미 선택되어진 자리 입니다.");
					}
				} else {
					System.out.println("입력할수 있는 범위를 초과하였습니다.");
				}
				for (int i = 0; i < 9; i += 3) {
					if (map[i] == P2 && map[i + 1] == P2 && map[i + 2] == P2) {
						System.out.println("P2가 승리하였습니다.");
						play = false;
					}

				}
				for (int i = 0; i < 3; i++) {
					if (map[i] == P2 && map[i + 3] == P2 && map[i + 6] == P2) {
						System.out.println("P2가 승리하였습니다.");
						play = false;
					}
				}
				if (map[0] == P2 && map[4] == P2 && map[8] == P2) {
					System.out.println("P2가 승리하였습니다.");
					play = false;
				}
				if (map[2] == P2 && map[4] == P2 && map[6] == P2) {
					System.out.println("P2가 승리하였습니다.");
					play = false;
				}
			}

		}

	}

}
