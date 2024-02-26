package lv06;

//클래스가 가지는 요소 두 가지
//1) 멥버 변수 (속성)
//2) 멤버 메소드 (기능)
//		ㄴ Method : Class 안에 정의돈 함수 Function
//		ㄴ 4가지 유형의 메소드
//		a) return X, parameter X
//		b) return X, parameter O
// 		c) return O, parameter O
//		d) return O, parameter X

// *메소드 정의
// ㄴ 리턴타입 메소드명(파라미터타입1 파라미터명1,파라미터타입2 파라미터명2, ...) {}

class Sample {
	void func1() {
		System.out.println("Hello my function!");
	}
	void func2(int number) {
		System.out.println("number : " + number);
	}
	
	int func3(int number) {
		//리턴할 값을 돌려주고 소멸함
		return number;
	}
	int func4() {
		return 100;
	}
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
