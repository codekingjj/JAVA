package lv01;

import java.util.Scanner;
import java.util.Random;


// ctrl + / => 주석 처리 단축키
public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 연산자 기호 맞추기 게임 1. 1~10 사이의 랜덤 숫자 2개를 저장한다. 2. 1~4 사이의 랜덤 숫자 1개를 저장한다. 3. 위
		 * 숫자는 연산자 기호에 해당된다. 1) 덧셈 2) 뺄셈 3) 곱셈 4) 나머지 3. 사용자는 연산자 기호를 맞추는 게임이다. 예) 3 ? 4
		 * = 7 1) + 2) - 3) * 4) % 정답 : 2번
		 */

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int rNum1 = random.nextInt(10) + 1;
		int rNum2 = random.nextInt(10) + 1;
		int operater1 = random.nextInt(4) + 1;
		int operater2 = 0;
		System.out.println("----연산자 맞추기 게임----");
		int sum = 0;
		if (operater1 == 1) {
			sum = rNum1 + rNum2;
		} else if (operater1 == 2) {
			sum = rNum1 - rNum2;
		} else if (operater1 == 3) {
			sum = rNum1 * rNum2;
		} else if (operater1 == 4) {
			sum = rNum1 % rNum2;
		}

		if (rNum1 + rNum2 == sum) {
			operater2 = 1;
		} else if (rNum1 - rNum2 == sum) {
			operater2 = 2;
		} else if (rNum1 * rNum2 == sum) {
			operater2 = 3;
		} else if (rNum1 % rNum2 == sum) {
			operater2 =4;
		}
		System.out.println(operater1);
		System.out.println(operater2);
		System.out.printf("%d ? %d = %d", rNum1, rNum2, sum);
		System.out.println("\n물음표에 들어갈 연산자를 맞춰보세요 : ");
		System.out.println("1) +	2) - 	3) * 	4) %");
		int answer = scan.nextInt();

		if (operater1 == answer || operater2 == answer) {
			System.out.println("정답입니다~!");
		} else if (operater1 != answer && operater2 != answer) {
			System.out.println("틀렸습니다~!");
		}

	}

}
