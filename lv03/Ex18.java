package lv03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #기억력 게임 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다. 2. 정답을 맞추면 back에 해당 숫자를 저장해, back에
		 * 모든 수가 채워지면 게임은 종료된다.
		 * 
		 * 예) front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back = [0, 0, 0, 0, 0, 0, 0, 0, 0,
		 * 0] 입력1 : 0 입력2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */

		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];

		// 카드섞기 (front)
		// ㄴ 배열값교체 활용
		// {1, 2, 5, 4, 3, 3, 1, 4, 2, 5}

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int tmp = 0;
		boolean play = true;

		for (int i = 0; i < 1000; i++) {
			int index1 = random.nextInt(10);
			int index2 = random.nextInt(10);
			tmp = front[index1];
			front[index1] = front[index2];
			front[index2] = tmp;
		}

		while (play) {
			System.out.println(Arrays.toString(front));
			int count = 0;
			System.out.println("첫번째 카드 위치를 입력해 주세요 : ");
			int input1 = scan.nextInt();
			System.out.println("두번째 카드 위치를 입력해 주세요 : ");
			int input2 = scan.nextInt();

			if (input1 >= 1 && input1 <= 10 && input2 >= 1 && input2 <= 10) {
				if (front[input1 - 1] == front[input2 - 1]) {
					System.out.println("정답입니다!");
					back[input1 - 1] = 1;
					back[input2 - 1] = 1;
					for (int i = 0; i < 10; i++) {
						if (back[i] == 1) {
							count++;
						}
					}
					if (count == 10) {
						System.out.println("전부 맞추셨습니다~!");
						play = false;
					}
				} else if (front[input1 - 1] != front[input2 - 1]) {
					System.out.println("틀렸습니다!");
				}
			} else {
				System.out.println("입력범위를 벗어났습니다.");
			}

		}
	}

}
