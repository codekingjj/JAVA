package lv04;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 문자열 배열을 '가나다' 순으로(오름차순) 정렬하기
		String[] names = { "윤소원", "김선영", "손창우", "박소정", "전누리" };
		// {김선영 박소정 손창우 윤소원 전누리 }
		
		for(int i = 0; i< names.length-1; i++) {
			int idx = i;
			for(int j = i+1; j<names.length; j++) {
				if(names[idx].compareTo(names[j]) > 0) {
					idx = j;
				}
			}
			String temp = names[i];
			names[i] = names[idx];
			names[idx] = temp;
		}
//		for (int i = 1; i < names.length; i++) {
//			String tmp = names[i];
//			for (int j = i; j >= 1; j--) {
//				if (tmp.compareTo(names[j - 1]) < 0) {
//					names[j] = names[j - 1];
//					names[j - 1] = tmp;
//				}
//			}
//		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			System.out.print(" ");
		}

	}

}

//인덱스0이 들어갈자리 탐색