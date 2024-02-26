package test.lv01;

//시작시간 : 03 : 29
//종료시간 : 03 : 53
//소요시간 : 00 : 14(쉬는시간 제외)
import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 5)
		/*
		 * #구구단 게임[2단계] 1. 구구단 문제를 출제하기 위해, 숫자 2개를 저정한다. 2. 저장된 숫자를 토대로 구구단 문제를 출력한다. 3.
		 * 문제에 해당하는 정답을 입력받는다. 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = random.nextInt(10) + 1;
		int num2 = random.nextInt(10) + 1;
		int sum = num1 * num2;

		System.out.printf("%d x %d = ?", num1, num2);
		System.out.println("\n?에 들어갈 답은 무엇일까요?");
		int answer = scan.nextInt();
		if (sum == answer) {
			System.out.println("정답");
		} else if (sum != answer) {
			System.out.println("땡");
		}
	}

}
