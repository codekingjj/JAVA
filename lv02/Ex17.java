package lv02;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 로그인 . 로그인 후 재 로그인 불가 .로그아웃 상태에서만 이용가능 2. 로그아웃 .로그인 후 이용가능
		 */

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
			if (log == -1) {
				if (sel == 1) {
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

				} else if (sel == 2) {
					System.out.println("이미 로그아웃 상태입니다. 다시 선택해주세요.");
				} else if (sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
				}
			} else if (log == 1 || log == 2) {
				if (sel == 1) {
					System.out.println("이미 로그인이 되어있습니다. 다시 선택해주세요.");
				} else if (sel == 2) {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				} else if (sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
				}
			}

		}
	}

}