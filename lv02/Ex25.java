package lv02;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문 : 프로그램의 실행 흐름을 제어하는 문장
		
		// 1. 조건문 : if문, if-else문, switch-case문
		// 2. 반복문 : while문, for문, do-while문
		// 3. 보조제어문 : break, continue
		
		// do-while문
		
//		boolean isRun = true;
//		
//		while(isRun) {
//			System.out.println("실행문A");
//			isRun = false;
//		}
//		
//		do {
//			System.out.println("실행문B");
//		} while (isRun);
		
		//switch - case문
		int grade = 1;
		
		// 1 : VIP
		// 2 : gold
		// 3 : silver
		
		switch(grade) {

		case 1 : 
			System.out.println("VIP회원의 혜택을 받습니다.");
		case 2 :
			System.out.println("gold 회원의 혜택을 받습니다.");
		case 3 : 
			System.out.println("silver 회원의 혜택을 받습니다.");
		default :
			System.out.println("일반 회원의 혜택을 받습니다.");
		}

	}

}
