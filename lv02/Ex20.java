package lv02;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # ATM[4단계} 1. 로그인 . 로그인 후 재로그인 불가 . 로그아웃 상태에서만 이용 가능 2. 로그아웃 . 로그인 후 이용가능 3.
		 * 입금 . 로그인 후 이용가능 4. 출금 . 로그인후 이용가능 5. 이체 . 로그인 후 이용가능 6. 조회 . 로그인후 이용가능 7. 종료
		 */

		Scanner scan = new Scanner(System.in);

		int inputAcc = 0;
		int inputPw = 0;

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1;

		boolean run = true;
		while (run) {
			// 검수용 출력문
			// ㄴ 로그인 정보
			System.out.println("로그인 정보 : " + log);
			// ㄴ dbAcc1의 잔액
			System.out.println("계좌1 잔액 : " + dbMoney1);
			// ㄴ dbAcc2의 잔액
			System.out.println("계좌2 잔액 : " + dbMoney2);

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

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
				} else if (log != -1) {
					System.out.println("이미 로그인이 되어 있습니다. 다시 선택해 주십시오.");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("이미 로그아웃 상태입니다. 다시 시도해 주십시오.");
				} else if (log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("로그인 후 이용하실 수 있는 서비스입니다.");
				} else if (log == 1) {
					System.out.println("입금할 금액을 입력해주세요 : ");
					int deposit = scan.nextInt();
					if (deposit >= 0) {
						System.out.println("입금이 완료되었습니다.");
						dbMoney1 += deposit;
						System.out.printf("사용자 1 계좌잔액 : %d\n", dbMoney1);
					}
					// 내돈보다 deposit이 많으면
					else if (deposit < 0) {
						System.out.println("입력할 수 있는 값이 아닙니다. \n다시 메뉴를 선택해 주세요.");
					}
				} else if (log == 2) {
					System.out.println("입금할 금액을 입력해주세요 : ");
					int deposit = scan.nextInt();
					if (deposit >= 0) {
						System.out.println("입금이 완료되었습니다.");
						dbMoney2 += deposit;
						System.out.printf("사용자 2 계좌잔액 : %d\n", dbMoney2);
					} else if (deposit < 0) {
						System.out.println("입력할 수 있는 값이 아닙니다. \n다시 메뉴를 선택해 주세요.");
					}
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후 이용하실 수 있는 서비스입니다.");
				} else if (log == 1) {
					System.out.println("출금할 금액을 입력해주세요.");
					int withdraw = scan.nextInt();
					if (dbMoney1 >= withdraw) {
						System.out.println("출금이 완료되었습니다.");
						dbMoney1 -= withdraw;
						System.out.printf("사용자 1 계좌잔액 : %d\n", dbMoney1);
					} else if (dbMoney1 < withdraw) {
						System.out.println("잔액이 부족합니다. \n다시 메뉴를 선택해 주세요.");
					}
				} else if (log == 2) {
					System.out.println("출금할 금액을 입력해주세요.");
					int withdraw = scan.nextInt();
					if (dbMoney2 >= withdraw) {
						System.out.println("출금이 완료되었습니다.");
						dbMoney2 -= withdraw;
						System.out.printf("사용자 2 계좌잔액 : %d\n", dbMoney2);
					} else if (dbMoney2 < withdraw) {
						System.out.println("잔액이 부족합니다. \n다시 메뉴를 선택해 주세요.");
					}
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("로그인 후 이용하실 수 있는 서비스입니다.");
				} else if (log == 1) {
					System.out.println("계좌번호를 입력해주세요 : ");
					int Acc = scan.nextInt();
					if (Acc == dbAcc2) {
						System.out.println("이체할 금액을 입력해주세요 : ");
						int transfer = scan.nextInt();
						// 내돈보다 transfer 적으면
						if (dbMoney1 >= transfer) {
							System.out.println("이체가 완료되었습니다.");
							dbMoney1 -= transfer;
							dbMoney2 += transfer;
							System.out.printf("사용자 1 계좌잔액 : %d\n", dbMoney1);
						}
						// 내돈보다 transfer가 많으면
						else if (dbMoney1 < transfer) {
							System.out.println("이체할 금액이 잔액을 초과하였습니다. \n다시 메뉴를 선택해 주세요.");
						}
					} else {
						System.out.println("일치하는 계좌가 존재하지 않습니다.");
					}

				} else if (log == 2) {
					System.out.println("계좌번호를 입력해주세요 : ");
					int Acc = scan.nextInt();
					if (Acc == dbAcc1) {
						System.out.println("이체할 금액을 입력해주세요 : ");
						int transfer = scan.nextInt();
						// 내돈보다 transfer가 적으면
						if (dbMoney2 >= transfer) {
							System.out.println("이체가 완료되었습니다.");
							dbMoney1 += transfer;
							dbMoney2 -= transfer;
							System.out.printf("사용자 2 계좌잔액 : %d\n", dbMoney2);
						}
						// 내돈보다 transfer가 많으면
						else if (dbMoney2 < transfer) {
							System.out.println("이체할 금액이 잔액을 초과하였습니다. \n다시 메뉴를 선택해 주세요.");
						}
					} else {
						System.out.println("일치하는 계좌가 존재하지 않습니다.");
					}

				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인 후 이용하실 수 있는 서비스입니다.");
				} else if (log == 1) {
					System.out.println("사용자 1의 계좌잔액 : " + dbMoney1);
				} else if (log == 2) {
					System.out.println("사용자 2의 계좌잔액 : " + dbMoney2);
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
