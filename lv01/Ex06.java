package lv01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 : 단 하나의 값을 저장할 수 있는 (메모리) 공간
		// ㄴ 이름을 붙여서 해당 주소로 찾아가 -> 값을 다시 꺼내올 수 있음
		
		// 변수 선언
		// 자료형키워드 변수명; 
		
		// 자료형
		// 1) 정수 int
		// 2) 실수 double
		// 3) 문자 char
		// 4) 문자열 String
		// 5) 불린 boolean 
		
		
		
		// 변수 초기화 : 대입 연산자를 활용한 값 부여
		// 변수명 = 값;
		
		
		//변수 선언 및 초기화
		// 자료형키워드 변수명 = 값;
		
		int number = 100;
		double pi = 3.14;
		char grade = 'A';
		String myName = "이재정";
		boolean fact = true;
		
		System.out.println(number);
		System.out.println(pi);
		System.out.println(grade);
		System.out.println(myName);
		System.out.println(fact);
		
		// 변수명의 이름 규칙
		// 소문자로 시작
		// 자바에서는 카멜 camel 표기법 사용
		// ㄴ 두개 이상의 키워드가 조합되는 경우,
		// ㄴ 새로 시작하는 단어를 대문자로 바꿔주는 것
		// ex) myName, isRun, ...
		// 무의미한 캐릭터의 나열 사용 X
		// ㄴ제 3자가 변수명을 통해 어떤 자료형의 어떤 데이터를 담고 있는지 유추 가능해야함
		// * 자바에서 약속되어 있는 키워드들은 병수명으로 사용 불가능
		// ㄴ public, int, char, void 등등
		// 헝가리언
		// ㄴ 두개 이상의 키워드가 조합되는 경우,
		// ㄴ 새로 시작하는 단어의 앞에 _를 붙임
		// ex) my_name, is_run, ...
		
		//변수의 생명주기 = scope = 지역
		// {} 중괄호의 시작과 끝
		// 변수는 선언된 지역 내에서만 존재
		// ㄴ 지역이 끝나기 전까지는 동일한 이름의 변수를 복수로 선언할 수 X
	}

}
