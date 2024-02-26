package lv01;

import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
				
				//로그인 처리[3단계]
		
				// 사용자는 데이터베이스에 저장된 아이디만 입력하여
				// 아이디가 일치하지 않으면 -> 존재하지 않는 회원입니다.를 출력
				// 아이디가 일치하면 -> 패스워드를 입력받음
				// 패스워드가 일치하면
				//"로그인 성공"을 출력
				// 패스워드가 일치하지 않은면
				// 비밀번호가 일치하지 않습니다.를 출력
			
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1111;
		int dbPw = 1212;
		
		System.out.println("아이디를 입력하세요 : ");
		int id = scan.nextInt();
		
		if (id != dbId) {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
		if (id == dbId) {
			System.out.println("비밀번호를 입력하세요 : ");
			int pw = scan.nextInt();
			if (pw == dbPw) {
				System.out.println("로그인 성공");
			}
			if (pw != dbPw) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

}
