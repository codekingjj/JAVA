package lv03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 숫자이동[1단계] 1. 숫자2는 캐릭터이다. 2. 숫자1을 입력하면, 캐릭토가 왼쪽으로 숫자2를 입력하면, 캐릭터가 오른쪽으로
		 * 이동한다. 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다. 4. {0, 0, 2, 0, 0, 0, 0, }; ==> 왼쪽 ==>
		 * {0, 2, 0, 0, 0, 0, 0}
		 */
		
		
		// 변수
		// ㄴ 변수
		// ㄴ 상수 : 변수 앞에 final 키워드를 붙여, 수정 불가한 값으로 고정
		// 			이름 규칙 -> 변수명 전체 캐릭터를 대문자로 작성(두 개 이상의 키워드가 조합 경우, 헝가리언)
		//			SIZE, MAP_SIZE
		
		
		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int LOAD = 0;

		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		// 플레이어의 현재 위치 (좌표 : 인덱스)
		int x = -1;
		boolean isRun = true;
		for (int i = 0; i < SIZE; i++) {
			if (game[i] == PLAYER) {
				x = i;
			}
		}
		while (isRun) {
			for (int i = 0; i < SIZE; i++) {
				if (i == x) {
					System.out.print("옷_");
				} else {
					System.out.print("__");
				}
			}
			System.out.println("\n1.왼쪽 2.오른쪽 3.종료 : ");
			int sel = scan.nextInt();
			game[x] = LOAD;
			if (sel == 1) {
				if (x >= 1 && x <= 6) {
					x--;
					game[x] = PLAYER;
					System.out.println("왼쪽으로 이동하였습니다.");

				} else if (x == 0) {
					System.out.println("더이상 이동할 공간이 없습니다.");
				}

			}
			if (sel == 2) {
				if (x >= 0 && x <= 5) {
					x++;
					game[x] = PLAYER;
					System.out.println("오른쪽으로 이동하였습니다.");
				} else if (x == SIZE - 1) {
					System.out.println("더이상 이동할 공간이 없습니다.");
				}
			}
			if (sel == 3) {
				isRun = false;
				System.out.println("게임이 종료되었습니다.");
			}

		}

	}

}
