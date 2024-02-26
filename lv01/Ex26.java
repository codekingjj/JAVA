package lv01;

import java.util.Random;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [if-else 구문 활용]
		 * 
		 * #가위(0) 바위(1) 보(2) 게임[2단계] 1. com은 0~2 사이의 랜덤한 숫자를 저장한다. 2. me는 0~2 사이의 숫자를
		 * 입력받는다. 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		 */
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int com = random.nextInt(3);
		System.out.println("가위(0) 바위(1) 보(2)를 입력하시오 : ");
		int me = scan.nextInt();

		System.out.println("상대방이 낸 것 : " + com);
		if ((com == 0 && me == 1) || (com == 1 && me == 2) || (com == 2 && me == 0)) {
			System.out.println("내가 이겼다.");
		} else if (com == me) {
			System.out.println("비겼다");
		} else {
			System.out.println("내가 졌다.");
		}
	}
}
