package test.lv01;

//시작시간 : 2:17
//종료시간 : 2:31
//소요시간 : 0:14
import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 2)
		/*
		 * # 홀짝 게임 1. 1~100사이의 랜덤 숫자를 저장한다. 2. 저장된 랜덤 숫자를 보여주고, 3. 해당 숫자가 홀수인지 짝수인지 맞추는
		 * 게임이다.
		 */
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int rNum = random.nextInt(100) + 1;
		int answer = 0;
		int inputAnswer = 0;

		System.out.printf("%d \n이숫자는 홀수 일까요? 짝수 일까요? \n1) 홀수 2) 짝수\n", rNum);
		inputAnswer = scan.nextInt();
		if (inputAnswer == 1 || inputAnswer == 2) {
			if (rNum % 2 == 0) {
				answer = 2;
			} else if (rNum % 2 == 1) {
				answer = 1;
			}

			if (answer == inputAnswer) {
				System.out.println("정답입니다~!");
			} else if (answer != inputAnswer) {
				System.out.println("틀렸습니다ㅠㅜ");
			}
		} else {
			System.out.println("입력값의 범위를 초과하였습니다.");
		}
	}
}
