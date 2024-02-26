package lv02;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int inputAcc = 0;
		int inputPw = 0;

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int cash = 20000;
		int balance = 30000;

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
						System.out.println("1.입금 2.출금 3. 조회");
						int selectNum = scan.nextInt();
						if (selectNum == 1) {
							System.out.println("입금하실 금액을 입력해 주십시오.");
							int depositSum = scan.nextInt();
							if (depositSum <= cash) {
								cash -= depositSum;
								balance += depositSum;
								System.out.println(
										"입금이 완료되었습니다. 입금된 금액 : " + depositSum + " 계좌잔액 : " + balance + " 남은 현금" + cash);
							} else if (depositSum > cash) {
								System.out.println("입금할 수 있는 현금이 부족합니다. 처음부터 다시 시도해 주십시오.");
							}
						} else if (selectNum == 2) {
							System.out.println("출금하실 금액을 입력해 주십시오.");
							int withdraw = scan.nextInt();
							if (withdraw <= balance) {
								balance -= withdraw;
								cash += withdraw;
								System.out.println(
										"출금이 완료되었습니다. 출금된 금액 : " + withdraw + " 계좌잔액 : " + balance + "남은 현금" + cash);
							} else if (withdraw > balance) {
								System.out.println("출금할 수 있는 계좌잔액이 부족합니다. 처음부터 다시 시도해 주십시오.");
							}
						} else if (selectNum == 3) {
							System.out.println("현재 잔액 : " + balance + " 현재 소지 현금 : " + cash);
						} else {
							System.out.println("유효한 입력이 아닙니다. 다시 시도해 주십시오.");
						}
					} else if (inputAcc == dbAcc2 && inputPw == dbPw2) {
						log = 2;
						System.out.println("사용자 2로 로그인되었습니다.");
						System.out.println("1.입금 2.출금 3. 조회");
						int selectNum = scan.nextInt();
						if (selectNum == 1) {
							System.out.println("입금하실 금액을 입력해 주십시오.");
							int depositSum = scan.nextInt();
							if (depositSum <= cash) {
								cash -= depositSum;
								balance += depositSum;
								System.out.println(
										"입금이 완료되었습니다. 입금된 금액 : " + depositSum + " 계좌잔액 : " + balance + " 남은 현금" + cash);
							} else if (depositSum > cash) {
								System.out.println("입금할 수 있는 현금이 부족합니다. 처음부터 다시 시도해 주십시오.");
							}
						} else if (selectNum == 2) {
							System.out.println("출금하실 금액을 입력해 주십시오.");
							int withdraw = scan.nextInt();
							if (withdraw <= balance) {
								balance -= withdraw;
								cash += withdraw;
								System.out.println(
										"출금이 완료되었습니다. 출금된 금액 : " + withdraw + " 계좌잔액 : " + balance + "남은 현금" + cash);
							} else if (withdraw > balance) {
								System.out.println("출금할 수 있는 계좌잔액이 부족합니다. 처음부터 다시 시도해 주십시오.");
							}
						} else if (selectNum == 3) {
							System.out.println("현재 잔액 : " + balance + " 현재 소지 현금 : " + cash);
						} else {
							System.out.println("유효한 입력이 아닙니다. 다시 시도해 주십시오.");
						}
					} else {
						System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
					}
				} else if (log == 1 || log == 2) {
					System.out.println("이미 로그인이 되어 있습니다. 다시 선택해 주십시오.");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("이미 로그아웃 상태입니다. 다시 시도해 주십시오.");
				} else if (log == 1 || log == 2) {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}
}