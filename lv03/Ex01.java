package lv03;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 값을 한 개 저장하는 것
		
		//배열 : 값을 여러개 저장하는 것
		
		//선언과 초기화
		//자료형키워드[] 변수명 = new 자료형키워드[개수];
		
		 int[]arr = new int[3];	// {0, 0, 0}
		//int[] arr = {1, 2, 3};		// {1, 2, 3}
		
		// 사용 방법
		// *인덱스 index (방의 번호, 0부터 시작)
		
		// 배열의 값 초기화
		// 1~3까지로 초기화
		for (int i = 0; i< 3; i++) {
			arr[i] = i + 1;
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 배열변수명 []
		// 두번째 방에 있는 값을 출력
		
//		System.out.println(arr[1]);
		
		//반복문을 활용하여 배열의 전체 값을 출력
//		int [] arr = {1, 2, 3};
//		int x = 0;
//		while ( x <= 2) {
//			System.out.println(arr[x]);
//			x ++;
//		}
//		for (int i = 0; i <= 2; i ++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
