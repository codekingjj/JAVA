package lv03;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 문제 1) 아래 배열 a에서 내가 입력한 값만 빼고 b에 저정
//		int a[] = { 10, 20, 30, 40, 50 };
//		int b[] = { 0, 0, 0, 0, 0 };
//		// 예) 30 == > b[] = {10, 20, 40, 50, 0};
//		System.out.println("빼고 싶은 값을 입력해 주세요 : ");
//		int value = scan.nextInt();
//		int x = 0;
//		for (int i = 0; i < 5; i++) {
//			if (value != a[i]) {
//				b[x] = a[i];
//				x++;
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(b[i]);
//		}

		// 문제 2) 아래 배열에서 내가 입력한 번호의 "번호와 값" 만 빼고 d에 저장
//		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
//		int d[] = { 0, 0, 0, 0, 0, 0 };
//		// 예) 1002 ==> d[] = {1001, 40, 1003, 70, 0, 0};
//
//		System.out.println("빼고싶은 값의 번호만 입력해 주세요 : ");
//		int input = scan.nextInt();
//		int y = 0;
//
//		for (int i = 0; i < 6; i++) {
//			if (i % 2 == 0 && input != c[i]) {
//				d[y] = c[(i)];
//				d[(y + 1)] = c[(i + 1)];
//				y += 2;
//			}
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println(d[i]);
//		}
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		
		System.out.println("빼고싶은 값이나 번호를 입력해 주세요 : ");
		int input = scan.nextInt();
		int y = 0;

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0 && input != c[i]) {
				d[y] = c[(i)];
				d[(y + 1)] = c[(i + 1)];
				y += 2;
			}else if (i % 2 == 1 && input != c[i]) {
				d[y] = c[(i - 1)];
				d[(y +1)] = c[(i)];
				y += 2;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(d[i]);
		}

	}

}
