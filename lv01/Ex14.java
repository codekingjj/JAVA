package lv01;

import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 가위(0)바위(1)보(2) 게임[1단계]
		 * 1. com은 바위(1)만 낼 수 있다.
		 * 2. me는 0~2사이의 숫자를 입력받는다.
		 * 3. com과 em를 비교해,
		 * 		1)비겼다.
		 * 		2)내가 이겼다.
		 * 		3)내가 졌다.		를 출력한다.
		 */
		
		
		System.out.println("상대방의 가위(0) 바위(1) 보(2) 중에 하나를 고르세요 : ");
		Scanner scan = new Scanner(System.in);
		int com = scan.nextInt();
		System.out.println("나의 가위(0) 바위(1) 보(2) 중에 하나를 고르세요 : ");
		int me = scan.nextInt();
		System.out.println("가위~~ 바위~~ 보~~!!");
		System.out.println("상대방 바위(1)");
		if (me == 0 && com == 1) {
			System.out.println("내가 졌다.");
		}
		if (me == 1 && com == 2) {
			System.out.println("내가 졌다.");
		}
		if (me == 2 && com == 0) {
			System.out.println("내가 졌다.");
		}
		if (me == com) {
			System.out.println("비겼다.");
		}
		if (me == 0 && com == 2) {
			System.out.println("내가 이겼다.");
		}
		if (me == 1 && com == 0) {
			System.out.println("내가 이겼다.");
		}
		if (me == 2 && com == 1) {
			System.out.println("내가 이겼다.");
		}
	}

}
