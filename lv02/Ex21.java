package lv02;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문 : "프로그램 실행 흐름"을 제어하는 문장
		
		// 1. 조건문 : if문, if-else문, switch-case문 
		// 2. 반복문 : while문, for무, do-while문
		// 3. 보조 제어문 : break, countiue
		
		// for문
		// 문법
		// for(초기식; 조건식; 증감식) { 실행문;}
		
		int n = 0;						// 초기식
		while(n <5) {					// 조건식
			System.out.println(n + 1);		
			n++;						//증감식
		}
		System.out.println(n); 
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
	}

}
