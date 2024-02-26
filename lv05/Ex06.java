package lv05;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "1/2,3/4,5/6";
		// [1,2,3,4,5,6]

		// REGEX 정규식 활용
		String[] result = null;

		// 1) / 또는 , 논리 연산
		result = data.split("/|,");
		System.out.println(Arrays.toString(result));

		// 2) [] 캐릭터 클래스
		result = data.split("/,");
		System.out.println(Arrays.toString(result));

		// 3) decimal 이 아닌 not 연산
		data = "1a2,3!4=5/9";
		result = data.split("[^0-9]");
		result = data.split("\\D");
		System.out.println(Arrays.toString(result));

	}

}
