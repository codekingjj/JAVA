package lv02;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * #카카오 택시 1. 손님을 태워 목적지까지 이동하는 게임이다. 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다. 3.
		 * 메뉴는 아래와 같다. 1) 속도설정 : 1~3까지만 가능 2) 방향설정 : 동(1) 서(2) 남(3) 북(4) 3) 이동하기 : 설정된
		 * 방향으로 설정된 속도만큼 이동 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// 목적지(destination)
		int desX = random.nextInt(20) - 10;
		int desY = random.nextInt(20) - 10;

		// 현재 위치
		int x = 0;
		int y = 0;

		// 방향성
		int dir = 0;
		String dirString = "?";

		// 속도
		int speed = 0;

		// 요금
		int fee = 0;

		boolean run = true;
		while (run) {

			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방	향 : " + dirString);
			System.out.println("속	도 : " + speed);
			System.out.println("============");

			System.out.println("1. 방향설정");
			System.out.println("2. 속도설정");
			System.out.println("3. 이동하기");
			System.out.println("0. 운행종료");

			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// 동서남북 설정
				System.out.println("1) 동 2) 서 3) 남 4) 북");
				dir = scan.nextInt();
				if (dir == 1) {
					dirString = "동";
				} else if (dir == 2) {
					dirString = "서";
				} else if (dir == 3) {
					dirString = "남";
				} else if (dir == 4) {
					dirString = "북";
				}

			} else if (sel == 2) {
				// 얼만큼 갈지 속도 설정
				System.out.println("1~3까지 속도를 설정하시오.");
				speed = scan.nextInt();
			} else if (sel == 3) {
				// 방향과 속도에 맞게 움직이고 도착하면 run종료 안도착하면 한번더
				if (x != desX || y != desY) {
					if (dir == 1) {
						x += speed;
					} else if (dir == 2) {
						x -= speed;
					} else if (dir == 3) {
						y -= speed;
					} else if (dir == 4) {
						y += speed;
					}
					if (dir >= 1 && dir <= 4) {
						fee += speed;
					}
					System.out.println("요금 : " + fee * 50);
					dirString = "?";
					dir = 0;
					speed = 0;
				}
				if (x == desX && y == desY) {
					System.out.println("\n도착하였습니다~!");
					System.out.println("총 요금 : " + fee * 50);
					run = false;
				}

			}
		}
	}

}
