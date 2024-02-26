package lv01;

import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로그인 처리
		
		//사용자는 데이터베이스에 저장된 아이디와 비밀번호를 입력하여
		//두 개의 값이 모두 일치하면
		//"로그인 성공"을 출력
		// 두 개의 값이 하나라도 일치하지 않으면
		// "회원정보가 일치하지 않습니다" 를 출력
		
		int dbId = 1111;
		int dbPw = 1212;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		int inputId = scan.nextInt();
		
		System.out.println("비밀번호를 입력하세요 : ");
		int inputPw = scan.nextInt();
		
		if (dbId == inputId && dbPw == inputPw) {
			System.out.println("로그인 성공");
		}
		if (dbId != inputId || dbPw != inputPw) {
			System.out.println("회원정보가 일치하지 않습니다.");
		}
	}

}
