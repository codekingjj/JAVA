package lv05;

import java.util.Random;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #경마게임
		// 5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다
		// 이동한거리의 합이 20이상이면 도착
		// 등수 출력
		// 조건) 단 ! 동시도착 예외처리

		Random random = new Random();

		final int MAX = 20;
		final int HORSE = 1;
		int horse[][] = new int[5][MAX];

		int rank[] = new int[5];
		int total[] = new int[5];

		for (int i = 0; i < horse.length; i++) {
			int x = total[i];
			horse[i][x] = HORSE;
		}
		int record = 1;
		while (true) {
			boolean isSame = false;
			System.out.println("과천 경마공원");
			for (int i = 0; i < horse.length; i++) {
				for (int j = 0; j < MAX; j++) {
					if (horse[i][j] == HORSE) {
						System.out.print("말__");
					} else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
			if (record > horse.length) {
				break;
			}
			boolean isGoal = false;
			for (int i = 0; i < horse.length; i++) {
				if (rank[i] != 0) {
					continue;
				}
				int x = total[i];
				int jump = random.nextInt(4);

				horse[i][x] = 0;
				x += jump;

				if (x >= MAX - 1) {
					if(isGoal) {
						i--;
						continue;
					}
					x = MAX - 1;
					rank[i] = record++;
					isGoal = true;
				}

				horse[i][x] = HORSE;
				total[i] = x;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			for (int i = 0; i < rank.length; i++) {
				System.out.printf("%d번 말 : %demd\n", i + 1, rank[i]);
			}
		}
	}

}
