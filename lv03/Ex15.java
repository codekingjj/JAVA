package lv03;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 0, 0, 0, 0, 0, 3, 3, 3 };

		/*
		 * 0 0 0 0 0 0 3 3 3
		 */

		// 문제 1) 배열을 위와 같이 3줄씩 출력

		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i]);
			if ((i + 1) % 3 == 0) {
				System.out.print("\n");
			}
		}
	}

}
