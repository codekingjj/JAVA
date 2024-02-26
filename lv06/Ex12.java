package lv06;

class Marble {
	final int WALL = -1;
	final int ROAD = 0;
	final int PLAYER = 1;
	final int SIZE = 5;
	
	final int EAST = 6;
	final int SOUTH = 7;
	final int WEST = 8;
	final int NORTH = 9;
	
	int[][] map;
	
	int x;
	int y;
	
	int direction;	//동 -> 남 -> 서 -> 북
	void setMap() {
		map = new int[SIZE][SIZE];
		x = 0;
		y = 0;
		for(int i = 0; i<SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if ((x > 0 || x < 4) && (y >0 || y < 4)) {
					map[i][j] = WALL;
				}
			}
		}
	}
	
	void printMap() {
		map[x][y] = PLAYER;
		for (int i = 0; i<SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				if(map[i][j] == ROAD) {
					System.out.print("□ ");					
				}
				else if (map[i][j] == PLAYER) {
					System.out.print("옷 ");
				}
				else if (map[i][j] == WALL) {
					System.out.print("■ ");
				}
			}
			System.out.println();
		}
	}
	void run() {
		setMap();
//		while(true) {
			printMap();
//		}
	}
}
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marble game = new Marble();
		game.run();
	}

}
