package lv01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 다음의 변수 x와 y의 값을 서로 교체하여 출력하기
		// ㄴ 힌트 :변수 활용
		
		int x = 10;
		int y = 20;
		
		// x = 20 [x]
		// y = 10 [x]
		
		// 문제풀기
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
