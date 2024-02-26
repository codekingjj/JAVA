package lv03;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 3, 3, 3, 0, 0, 3, 3, 3 };

		// 문제 2) 만약에 가로에 3이 연속으로 3개 있으면 "빙고" 출력
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i]);
			if ((i + 1) % 3 == 0) {
				System.out.print("\n");
			}
			if (arr[i] == 3 && (i == 0 || i == 1 || i == 2)) {
				count1++;
			} else if (arr[i] == 3 && (i == 3 || i == 4 || i == 5)) {
				count2++;
			} else if (arr[i] == 3 && (i == 6 || i == 7 || i == 8)) {
				count3++;
			}
		}
		if (count1 == 3 || count2 == 3 || count3 == 3) {
			System.out.println("빙고!");
		} else {
			System.out.println("NOT빙고...ㅠㅜㅜ");
		}
	}

}
