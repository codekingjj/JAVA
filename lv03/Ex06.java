package lv03;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 문제 1) 인덱스(방번호)를 입력하면 값출력
		int a[] = { 10, 20, 30, 40, 50 };
		// 예) 3 == > 40
		System.out.println("인덱스를 입력해 주세요 : ");
		int index = scan.nextInt();
		if (index >= 0 && index <= 4) {
			System.out.println(a[index]);
		} else {
			System.out.println("해당 인덱스가 존재하지 않습니다.");
		}

		// 문제 2) 아래배열중 가장큰값 추력
		int b[] = { 12, 54, 23, 87, 1 };
		// 예) 87
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max <= b[i]) {
				max = b[i];
			}
		}
		System.out.println(max);

		// 문제3) 아래 배열중 홀수의 개수 출력
		int c[] = { 12, 54, 23, 87, 1 };
		// 예) 홀수의 개수 : 3

		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (c[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println("홀수의 개수 : " + count);

		// 문제4) 아래배열을 거꾸로 저장
		int d[] = { 1, 2, 3, 4, 5 };
		int e[] = { 0, 0, 0, 0, 0 };
		// 예) = {5,4,3,2,1};

		int x = 0;
		for (int i = 4; i >= 0; i--) {
			e[x] = d[i];
			x++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(e[i]);
		}
	}

}
