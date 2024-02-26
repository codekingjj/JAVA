package lv03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #회원가입 1. 가입 . 아이디 와 비밀번호를 입력받아 가입 . 아이디 중복검사 2. 탈퇴 . 아이디를 입력받아 탈퇴
		 */

		Scanner scan = new Scanner(System.in);

		int[] ids = { 1011, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		boolean run = true;
		int cnt = 2;

		while (run) {
			System.out.println(Arrays.toString(ids));
			System.out.println(Arrays.toString(pws));
			System.out.println("cnt : " + cnt);
			System.out.println("메뉴를 선택해 주세요 \n 1. 회원가입 2. 탈퇴 3. 종료");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt < 5) {
					int section1 = 1;
					System.out.println("아이디를 입력해 주세요 : ");
					int inputId = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (inputId == ids[i]) {
							section1++;
						}
					}
					if (section1 == 1) {
						ids[cnt] = inputId;
						System.out.println("사용가능한 아이디입니다.");
						System.out.println("비밀번호를 입력해 주세요 : ");
						int inputPw = scan.nextInt();
						pws[cnt] = inputPw;
						cnt++;
					} else if (section1 == 2) {
						System.out.println("중복된 아이디가 있습니다.");
					}
				} else {
					System.out.println("저장공간이 가능찼습니다.");
				}
			} else if (sel == 2) {
				int section2 = 1;
				int tmp = -1;
				System.out.println("탈퇴하실 아이디를 입력해 주세요 : ");
				int inputId = scan.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (inputId == ids[i]) {
						section2++;
						tmp = i;

					}
				}
				if (section2 == 2 && tmp != -1) {
					System.out.println("비밀번호를 입력해 주세요 : ");
					int inputPw = scan.nextInt();
					if (inputPw == pws[tmp]) {
						System.out.println("탈퇴가 완료 되었습니다.");
						ids[tmp] = 0;
						pws[tmp] = 0;
						cnt--;
						for (int i = tmp; i < cnt; i++) {
							int x = 0;
							x = ids[i + 1];
							ids[i + 1] = ids[i];
							ids[i] = x;

						}
						for (int i = tmp; i < cnt; i++) {
							int x = 0;
							x = pws[i + 1];
							pws[i + 1] = pws[i];
							pws[i] = x;
						}
					} else {
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				} else if (section2 == 1 || tmp == -1) {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
			} else if (sel == 3) {
				run = false;
			}
		}
	}

}
