package test.lv3;
//시작시간 11:43

//종료시간 12:42
//소요시간 00:59

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Test 3

		// 4.
		/*
		 * #회원가입 1. 가입 .아이디 와 비밀번호를 입력받아 가입 .아이디 중복검사 2. 탈퇴 .아이디와 비밀번호를 입력받아 탈퇴 .탈퇴시,
		 * 비어있는 인덱스까지 값 당기기
		 */
		Scanner scan = new Scanner(System.in);

		final int MAX = 5;
		int cnt = 0;
		boolean run = true;

		int[] ids = new int[MAX];
		int[] pws = new int[MAX];

		while (run) {
			System.out.println("===회원가입===");
			System.out.println(Arrays.toString(ids));
			System.out.println(Arrays.toString(pws));
			System.out.println("1. 가입\n2. 탈퇴");
			int sel = scan.nextInt();
			if (sel == 1) {
				if (cnt < MAX) {
					int section = 1;
					System.out.println("아이디를 입력해주세요 : ");
					int inputId = scan.nextInt();
					for (int i = 0; i < cnt + 1; i++) {
						if (inputId == ids[i]) {
							section = 2;
						}
					}
					if (section == 1) {
						ids[cnt] = inputId;
						System.out.println("비밀번호를 입력해주세요 : ");
						int inputPw = scan.nextInt();
						pws[cnt] = inputPw;
						cnt++;
					} else if (section == 2) {
						System.out.println("중복된 아이디가 존재합니다.");
					}
				}
			} else if (sel == 2) {
				System.out.println("탈퇴하실 아이디를 입력해주세요 : ");
				int inputId = scan.nextInt();
				int section = 1;
				int tmp = -1;
				for (int i = 0; i < cnt; i++) {
					if (inputId == pws[i]) {
						section++;
						tmp = i;
					}
				}
				if (section == 1) {
					System.out.println("중복된 아이디가 존재하지 않습니다.");
				} else if (section == 2) {
					System.out.println("비밀번호를 입력해주세요 : ");
					int inputPw = scan.nextInt();
					if (inputPw == pws[tmp]) {
						System.out.println("탈퇴가 완료되었습니다.");
						ids[tmp] = 0;
						pws[tmp] = 0;
						for (int i = tmp; i < cnt - 1; i++) {
							int x = 0;
							x = ids[i];
							ids[i] = ids[i + 1];
							ids[i + 1] = x;

							x = pws[i];
							pws[i] = pws[i + 1];
							pws[i + 1] = x;
						}
						cnt--;

					} else {
						System.out.println("비밀번호가 틀립니다.");
					}
				}
			} else if (sel == 3) {
				run = false;
			} else {
				System.out.println("해당메뉴가 없습니다.");
			}
		}
	}

}
