package lv01;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 로그인 ==> 1. 입금 2. 출금 3. 조회

		int cash = 20000;
		int balance = 30000;
		int account = 11111;
		int password = 1234;

		Scanner scan = new Scanner(System.in);

		System.out.println("===ATM===");
		System.out.println("1.로그인 2.종료");
		int logInNum = scan.nextInt();

		if (logInNum == 1) {
			System.out.println("아이디와 비밀번호를 입력해 주십시오.");
			System.out.println("아이디 : ");
			int inputId = scan.nextInt();
			System.out.println("비밀번호 : ");
			int inputPassword = scan.nextInt();
			if ((inputId == account) && (inputPassword == password)) {
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
						System.out.println("출금이 완료되었습니다. 출금된 금액 : " + withdraw + " 계좌잔액 : " + balance + "남은 현금" + cash);
					} else if (withdraw > balance) {
						System.out.println("출금할 수 있는 계좌잔액이 부족합니다. 처음부터 다시 시도해 주십시오.");
					}
				} else if (selectNum == 3) {
					System.out.println("현재 잔액 : " + balance + " 현재 소지 현금 : " + cash);
				} else {
					System.out.println("유효한 입력이 아닙니다. 다시 시도해 주십시오.");
				}
			} else {
				System.out.println("아이디와 비밀번호가 틀렸습니다. 처음부터 다시 이용해 주십시오.");
			}
		} else if (logInNum == 2) {
			System.out.println("이용해 주셔서 감사합니다. 즐거운 하루 되세요~!");
		} else {
			System.out.println("유효한 입력이 아닙니다. 다시 시도해 주십시오.");
		}
	}

}

// 로그인에 1,2,3 넣어보기
// 아이디 비번다맞는거, 아이디만 맞는거, 비번만 맞는거
// 1,2,3,4 선택다해보기
// 입금에서 금액 더큰거, 작은거, 똑같은거 해보기
// 출금에서 금액 더큰거, 작은거, 똑같은거 해보기
// 조회해보기
