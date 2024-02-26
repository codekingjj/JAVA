package lv01;

// 1. Scanner 클래스 가져오기
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력하시오 : ");
		
		
		int x = scan1.nextInt();
		int y = scan1.nextInt();
		
		System.out.println("두 수의 합은 " + (x + y) + " 입니다.");
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("숫자를 입력하시오 : ");
		
		int a = scan1.nextInt();
		
		System.out.println(a % 2 == 1);
		
		// 문제 3) 성적을 입력받아, 60점이상이고 100점 이하이면 true 출력
		
		System.out.print("수학성적과 과학성적을 입력하시오 : ");
		
		int gradeMath = scan1.nextInt();
		int gradeScience = scan1.nextInt();
		
		System.out.println((gradeMath >= 60 && gradeMath <= 100) && (gradeScience >= 60 && gradeScience <= 100));
		
	}

}
