package lv01;

import java.util.Random;
import java.util.Scanner;
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제어문 : 프로그램의 흐름을 제어
		// 1) 조건문 : if문, if-else문,
		// 2) 반복문
		// 3) 보조 제어문
		
		// if-else 문 사용 방법
		// if(조건식1) {실행문;}
		// else if(조건식2) {실행문;}
		// else {실행문;}
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 */
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("홀짝게임을 시작하겠습니다.");
		int rNum = random.nextInt(100) +1;
		
		System.out.println( rNum + "\n이숫자는 홀수 입니까? 짝수입니까? : (1) 홀수 (2) 짝수");
		int answer = scan.nextInt();
		
		if (rNum % 2 == 0) {
			if (answer == 1) {
				System.out.println("땡~! 틀렸습니다! 다시도전하세요~~!");
			}
			if (answer == 2) {
				System.out.println("정답입니다~");
			}
		}
		if (rNum % 2 == 1) {
			if (answer == 1) {
				System.out.println("정답입니다~");
			}
			if (answer == 2) {
				System.out.println("땡~! 틀렸습니다! 다시도전하세요~~!");
			}
		}
	}

}
