package lv02;

import java.util.Scanner;
import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # Up & Down 게임[2단계] 1. com 은 랜덤으로 1~100사이를 저장한다. 2. me 는 1~100사이를 입력한다. 3.
		 * com 과 me를 비교해서 com 크면 "크다" , com 이 직으면 "작다" 힌트제공 4. 정답을 맞추면 게임은 종료된다.
		 */

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("===up donw 게임!===");

		int com = random.nextInt(100) + 1;
		int me = 0;

		while (me != com) {
			System.out.println("정답 : ");
			me = scan.nextInt();
			if (me < com) {
				System.out.printf("%d 보다는 커요! 다시 한 번 생각해보세요~!\n", me);
			} else if (me > com) {
				System.out.printf("%d 보다는 작아요! 다시 한 번 생각해보세요~!\n", me);
			} else if (me < 1 || me > 100) {
				System.out.println("입력값의 범위를 벗어났어요! 다시 입력해주세요!\n");
			} else if (me == com) {
				System.out.printf("정답입니다~! 랜덤 숫자 : %d\n", com);
			}
			System.out.printf("직전 입력한 정답 : %d\n", me);
		}

	}

}
