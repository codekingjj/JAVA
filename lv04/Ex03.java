package lv04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arr 배열 heap에 복제
		
		
		int[][] arr = { { 10, 20, 30 }, { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40 } };

		int[][] clone = new int[arr.length][];
		
		for(int i = 0; i<clone.length;i++) {
			clone[i] = new int[arr[i].length];
			for(int j = 0; j < arr[i].length; j++) {
				clone[i][j] = arr[i][j];
			}
		}
//		// {null, null, null}
//		for (int i = 0; i < arr.length; i++) {
//				clone[i] = new int[arr.length];
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				clone[i][j] = new int[arr[i].length];
//			}
//		}
//
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(clone[i][j]);
			}
			System.out.println();
		}
	}

}
