package lv03;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		// TODO Auto-generated method stub
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50

		for (int i = 0; i < 5; i++) {
			arr[i] = i * 10 + 10;
			System.out.print(arr[i]);
		}
//		

		// 문제2) 전체 합 출력
		// 정답2) 150
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = i * 10 + 10;
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
