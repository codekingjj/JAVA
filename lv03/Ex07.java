package lv03;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1) 아래 배열 a와 b를 비교해서
		// 둘의 합이 짝수 일때만 c에 저장
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0, 0, 0, 0, 0 };
		// 예) c[] = {74, 82, 0,0,0}
		int x = 0;

		for (int i = 0; i < 5; i++) {
			if ((a[i] + b[i]) % 2 == 0) {
				c[x] = a[i] + b[i];
				x++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c[i]);
		}

		// 문제2) 아래는시험결과 이다.
		// 시험에 합격한사람의 번호만 win에 저장 (60점이상합격)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0, 0, 0 };
		// 예) win[] = {1002, 1003, 0};
		int y = 0;
		for (int i = 0; i < 3; i++) {
			if (score[i] >= 60) {
				win[y] = num[i];
				y++;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(win[i]);
		}

		// 문제3) 아래는 시험결과이다.
		// 시험에 합격한 사람의 번호만 win2에 저장(60점이상 합격)
		int data[] = { 1001, 80, 1002, 23, 1003, 78 };
		int win2[] = { 0, 0, 0 };
		// 예) win2[] = {1001, 1003, 0};

		int z = 0;

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 1 && data[i] >= 60) {
				win[z] = data[(i - 1)];
				z++;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(win[i]);
		}
	}

}
