package test.lv3;

import java.util.Arrays;
import java.util.Scanner;

//시작시간 13:50
//종료시간 14:06
//소요시간 00:16
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Test 3

		// 6. Last
		int arr[] = { 0, 2, 0, 4, 3, 0, 0, 5, 6 };

		// Test case.
		// int arr[] = { 1, 2, 0, 3, 4, 0, 0, 5, 8};
		// int arr[] = { 1, 0, 0, 0, 0, 0, 0, 0, 0};

		// 아래 번호를 입력받고 각방향으로 0이 아닌숫자를 모으시오.
		// 1)left 2) right

		Scanner scan = new Scanner(System.in);

		System.out.println("메뉴를 선택해 주세요 : ");
		System.out.println("1) 왼쪽으로 정렬");
		System.out.println("2) 오른쪽으로 정렬");
		int sel = scan.nextInt();
		if (sel == 1) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					int tmp = 0;
					if (arr[j] == 0) {
						tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
					}
				}
			}
			System.out.print(Arrays.toString(arr));
		}

		else if (sel == 2) {
			for (int i = 8; i >= 1; i--) {
				for (int j = 8; j >= 1; j--) {
					int tmp = 0;
					if (arr[j] == 0) {
						tmp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = tmp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		}

		else {
			System.out.println("없는 메뉴입니다.");
		}
	}

}
