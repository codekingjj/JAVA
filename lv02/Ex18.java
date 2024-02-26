package lv02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int inputAcc = 0;
		int inputPw = 0;

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int log = -1; // -1(로그아웃), 1(dbAcc1 로그인), 2(dbAcc2 로그인)

		boolean run = true;
		while (run) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0 . 종료");

			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (log == -1) {
					System.out.println("아이디를 입력하세요 : ");
					inputAcc = scan.nextInt();
					System.out.println("비밀번호를 입력하세요 : ");
					inputPw = scan.nextInt();
					if (inputAcc == dbAcc1 && inputPw == dbPw1) {
						log = 1;
						System.out.println("사용자 1로 로그인되었습니다.");
					} else if (inputAcc == dbAcc2 && inputPw == dbPw2) {
						log = 2;
						System.out.println("사용자 2로 로그인되었습니다.");
					} else {
						System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
					}
				}else if (log == 1 || log == 2) {
					System.out.println("이미 로그인이 되어 있습니다. 다시 선택해 주십시오.");
				}
			}else if(sel == 2) {
				if (log == -1) {
					System.out.println("이미 로그아웃 상태입니다. 다시 시도해 주십시오.");
				}else if (log == 1 || log == 2) { 
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			}else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}
}
