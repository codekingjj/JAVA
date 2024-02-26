package lv03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 값을 입력하면 번호 출력
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		boolean isRun = false;
		System.out.println("값을 입력해주세요 : ");
		int value = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if (value == a[i]) {
				System.out.println("번호 : " + (i+1));
				isRun = true;
			}
		}
		if (isRun == false) {
			System.err.println("값이 존재하지 않습니다.");
		}

		// 문제 2) 다음 리스트를 이용해서 a의 값중 홀수만 b에 저장(위치는 동일한 위치에 저장)
		// 예 ) b = [0, 49, 51, 0, 17]
		int b[] = { 0, 0, 0, 0, 0 };
		
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
			System.out.println(b[i]);
		}

		// 문제 3) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(위치는 앞에서 부터 저장)
		// 2번 문제와 조금 다름
		// 예) c = [49, 51, 17, 0,0]

		int c[] = { 0, 0, 0, 0, 0 };

		int x = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 1) {
				c[x] = a[i];
				x++;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(c[i]);
		}

		// _________________________________

		int arr[] = { 1000, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다. ==> 1001:20, 1002:45. 1003:54

		// 문제 4) 학번을 입력하면 점수 출력
		// 예) 1001==>20, 1003 ==> 54
		boolean isRun1 = false;
		System.out.println("학번을 입력하세요 : ");
		int hakbun = scan.nextInt();
		int index = 0;
		
		for (int i = 0; i < 6; i ++) {
			if (arr[i] == hakbun) {
				index = (i + 1);
				System.out.printf("학번 : %d, 점수 : %d", hakbun, arr[index] );
				isRun1 = true;
			}
		}
		if (isRun1 == false) {
			System.err.println("존재하지 않는 학번입니다.");
		}

		// 문제 5) 점수를 입력하면 학번 출력
		// 예) 20 ==> 1001, 45 ==> 1002

		boolean isRun2 = false;
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		int index2 = 0;
		
		for (int i = 0; i < 6; i ++) {
			if (arr[i] == score) {
				index2 = (i - 1);
				System.out.printf("학번 : %d, 점수 : %d",arr[index2] ,score );
				isRun2 = true;
			}
		}
		if (isRun2 == false) {
			System.err.println("존재하지 않는 점수입니다.");
		}

	}

}
