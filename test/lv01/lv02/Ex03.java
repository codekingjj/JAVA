package test.lv01.lv02;

import java.util.Random;
import java.util.Scanner;

// 시작 : 11 :00
// 종료 : 11 : 40
// 소요 : 00 : 40
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv02 테스트

		// 문제 3)
		/*
		 * #카카오 택시 1. 손님을 태워 목적지까지 이동하는 게임이다. 2. -10 ~10 사이의 랜덤숫자 2개를 저장해 목적지로 설정한다. 3.
		 * 메뉴는 아래와 같다. 1) 속도설정 : 1~3까지만 가능 2) 방향설정 : 동(1)서(2)남(3)북(4) 3) 이동하기 : 설정된 방향으로
		 * 설정된 속도만큼 이동 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 * 
		 */

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int x = random.nextInt(21) - 10;
		int y = random.nextInt(21) - 10;
		int inputX = 0;
		int inputY = 0;
		int sel = 0;
		int dir = 0;
		int speed = 0;
		int fee = 0;
		boolean run = true;

		while (run) {
			System.out.println("====카카오 택시게임====");
			System.out.printf("현재위치 : %d, %d\n", inputX, inputY);
			System.out.printf("도착위치 : %d, %d\n", x, y);
			System.out.printf("방향 : %d\n", dir);
			System.out.printf("속도 : %d\n", speed);
			System.out.printf("요금 : %d\n", fee);
			System.out.println("1) 속도설정");
			System.out.println("2) 방향설정");
			System.out.println("3) 이동하기");
			System.out.println("원하시는 메뉴를 선택해주세요 : ");
			sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("이동하실 속도를 1~3까지 입력해주세요 : ");
				speed = scan.nextInt();
				if (speed < 1 || speed > 3) {
					System.out.println("입력값의 범위를 초과하였습니다. 다시 입력해주세요.");
					speed = 0;
				}
			} else if (sel == 2) {
				System.out.println("이동하실 방향을 입력해주세요 : 1) 동 2) 서 3) 남 4) 북");
				dir = scan.nextInt();
				if (dir < 1 || dir > 4) {
					System.out.println("입력값의 범위를 초과하였습니다. 다시 입력해주세요.");
					dir = 0;
				}
			} else if (sel == 3) {
				if (inputX != x || inputY != y) {
					if (dir == 1) {
						inputX += speed;
					} else if (dir == 2) {
						inputX -= speed;
					} else if (dir == 3) {
						inputY -= speed;
					} else if (dir == 4) {
						inputY += speed;
					}
					if (dir >= 1 && dir <= 4) {
						fee += 50 * speed;
					}
					dir = 0;
					speed = 0;
				}

			} else {
				System.out.println("입력범위를 초과하였습니다. 다시입력해 주세요.");
				sel = 0;
			}
			if (inputX == x && inputY == y) {
				System.out.println("도착하였습니다.");
				System.out.println("총 요금 : " + fee + "원");
				run = false;
			}

		}
	}

}
