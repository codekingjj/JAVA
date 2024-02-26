package lv02;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * #쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 뒤로가기 누루기전까지 남성의류 페이지를 유지하려고한다. 힌트) 계층 별로 반복문을 추가
		 * 해주면된다. 1. 남성의류 1) 티셔츠 2) 바지 3) 뒤로가기 2. 여성의류 1) 가디건 2) 치마 3)뒤로가기
		 * 
		 * 3. 종료
		 */

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		boolean run1 = true;
		boolean run2 = true;
		while (run) {
			System.out.println("1. 남성의류");
			System.out.println("2. 여성의류");
			System.out.println("3. 종료");

			System.out.println("메뉴 선택");
			int sel = scan.nextInt();

			if (sel == 1) {
				while (run1) {
					System.out.println("1) 티셔츠");
					System.out.println("2) 바지");
					System.out.println("3) 뒤로가기");
					System.out.println("메뉴 선택");
					int selMan = scan.nextInt();

					if (selMan == 1) {
						System.out.println("티셔츠한번 골라보세요~");
					} else if (selMan == 2) {
						System.out.println("바지한번 골라보세요~");
					} else if (selMan == 3) {
						run1 = false;
					}
				}
				run1 = true;

			}

			else if (sel == 2) {
				while (run2) {
					System.out.println("1) 가디건");
					System.out.println("2) 치마");
					System.out.println("3) 뒤로가기");
					System.out.println("메뉴 선택");
					int selWoman = scan.nextInt();

					if (selWoman == 1) {
						System.out.println("가디건한번 골라보세요~");
					} else if (selWoman == 2) {
						System.out.println("치마한번 골라보세요~");
					} else if (selWoman == 3) {
						run2 = false;
					}
				}
				run2 = true;

			} else if (sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
