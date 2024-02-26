package lv01;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 				  myMoney	- 이체할 금액
 * 				  yourMoney  + 이체할 금액
 * 		이체할 금액 > myMoney	: 이체불가
 */
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		System.out.println("계좌번호를 입력해주세요 : ");
		int inputAcc = scan.nextInt();
		// 계좌 확인 됨
		if (inputAcc == yourAcc) {
			System.out.println("이체할 금액을 입력해 주십시오 : ");
			int sum = scan.nextInt();
			// 이체 가능 경우
			if (sum <= myMoney) {
				System.out.println("이체가 완료 되었습니다.\n이체된 금액 : " + sum + ", 현재잔액 : " + (myMoney - sum) + ", 상대방 잔액 : "
						+ (yourMoney + sum));
				myMoney = myMoney - sum; // 증감 연산자 : +=, -=, *=, /=
				yourMoney = yourMoney + sum;
			} else if (sum > myMoney) {
				System.out.println("잔액이 부족합니다. 처음부터 다시 시도해 주십시오.");
			}
		} // 계좌 확인 안됨
		else if (inputAcc != yourAcc) {
			System.out.println("계좌번호가 일치하지 않습니다. 처음부터 다시 시도해 주십시오.");
		}

		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("myMoney = " + yourMoney + "원");
		/*
		 * #테스트 케이스 1. 전부가능 2. 계좌 확인 안됨 3. 계좌 확인후 이체금액 너무큼
		 */

	}

}
