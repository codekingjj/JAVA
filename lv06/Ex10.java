package lv06;
//틱택토

class Tictactoe {

	final int SIZE = 3;
	final int P1 = 1;
	final int P2 = 2;

	int[][] map;

	int turn;
	int win;

	void setMap() {
		map = new int[SIZE][SIZE];
		turn = P1;
		win = 0;
	}

	void showMap() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == P1) {
					System.out.print(" O ");
				} else if (map[i][j] == P2) {
					System.out.print(" X ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

	void player1() {
		showMap();
	}

	void player2() {

	}

	void run() {
		setMap();
		player1();
		player2();
	}
}

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tictactoe game = new Tictactoe();
		game.run();
	}

}
