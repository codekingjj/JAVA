package lv02;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산
		
		int n = 1;
		
		n = n +1;
		
		n += 1;		// 복합 연산자
		n ++;		// 단항 연산자
		++ n ;
		
		
		// n ++		: 후위 연산
		// ++ n 	: 전위 연산
		
		int x = 10;
		int y = 20;
		int z = 0;
		// 1.
		z = x ++ + y;
		System.out.println(z);		// 30 x = 11
		
		// 2.
		z = ++x + y ++;
		System.out.println(z);		// 12 + 20 = 32 x= 12 y = 21
		
		// 3.
		z = x ++ + ++y;
		System.out.println(z);		// 12 + 22 = 34 x = 13 y = 22
	}

}
