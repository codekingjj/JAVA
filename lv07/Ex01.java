package lv07;

import java.util.Scanner;

class Person {
	String name, id, password, email;
	int age, gender;

	void printInfo() {
		System.out.printf("%s/%s(%s, %s) %d세, %s\n", id, password, name, email, age, gender == 1 ? "남자" : "여자");
	}

	// Method Overriding 메소드 오버라이딩
	// ㄴ 부모르부터 물려받은 메소드를 "재정의" 하는 것
	@Override
	public String toString() {
		return String.format("%s/%s(%s, %s) %d세, %s\n", id, password, name, email, age, gender == 1 ? "남자" : "여자");
	}
}

class CMS {
	Scanner scan = new Scanner(System.in);
	final int JOIN = 1;
	final int LEAVE = 2;
	final int LOG_IN = 3;
	final int LOG_OUT = 4;
	final int RESET_PASSWORD = 5;
	final int VIEW_USER = 6;

	final int TYPE_OUT = 1;
	final int TYPE_IN = 2;

	int size;
	Person[] group;
	int log = -1;

	Person createUser() {
		Person user = createUser();
		String name = inputString("name");
		String id = inputString("id");
		String email = inputString("email");
		String password = inputString("password");
		int age = inputNumber("age");
		int gender = inputNumber("1) 남자 2) 여자");

		Person person = new Person();

		person.name = name;
		person.id = id;
		person.email = email;
		person.password = password;
		person.age = age;
		person.gender = gender;

		return person;
	}

	boolean isDuplicationUserId(String id) {
		for (int i = 0; i < size; i++) {
			Person user = group[i];
			if (group[i].id.equals(id)) {
				return true;
			}
		}
		return false;
	}

	void join() {
		Person user = createUser();

		if (isDuplicationUserId(user.id)) {
			System.err.println("중복되는 아이디입니다.");
			return;
		}
		// id 중복 예외처리
		// group 배열의 크기를 늘리고
		// 기존 값 옮겨오고
		// 마지막 인덱스에 새로운 Person 객체를 추가

		Person[] temp = size == 0 ? null : group.clone();
		group = new Person[size + 1];

		for (int i = 0; i < size; i++) {
			group[i] = temp[i];
		}
		group[size++] = user;

		System.out.println("회원가입 완료");
	}

	void runMenu(int select) {
		if (select == JOIN) {
			join();
		}
//		else if(select == LEAVE) {
//			leave();
//		}
//		else if (select == LOG_IN) {
//			login();
//		}
//		else if (select == LOG_OUT) {
//			logout();
//		}
//		else if (select == RESET_PASSWORD) {
//			resetPassword();
//		}
//		else if (select == VIEW_USER) {
//			printSubMenu();
//			int sel = inputNumber();
//			runSubMenu(sel);
//		}
	}

	boolean isRun() {
		return true;
	}

	void printMenu() {
		System.out.println("----CMS ----");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원탈퇴");
		System.out.println("3. 로그인");
		System.out.println("4. 로그아웃");
		System.out.println("5. 비밀번호 변경");
		System.out.println("6. 회원정보 조회");
		System.out.println("------------");
	}

	String inputString(String message) {
		System.out.print(message + " : ");
		return scan.next();
	}

	int inputNumber(String message) {
		int number = -1;

		System.out.print(message + " : ");
		try {
			String input = scan.next();
			number = Integer.parseInt(input);
		} catch (Exception e) {
			System.err.println("숫자를 입력하세요.");
		}

		return number;
	}

	void printGroupInfo() {
		for (int i = 0; i < size; i++) {
			System.out.println("\n" + (i + 1) + ". ");
//			Person user = group[i];
//			user.printInfo();

			// 객체의 주소 -> override 한 toString 메소드를 통해
			// 나만의 문자열 출력
			System.out.println(group[i]);
		}
	}

	void run() {
		while (isRun()) {
			printGroupInfo();
			printMenu();
			int sel = inputNumber("menu");
			runMenu(sel);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person[] group = null;
//		
//		group = new Person[1];	//{null}
//		
//		group[0] = new Person();//{주소}
//		group[0].name = "홍길동";

		// 회원관리 프로그램
		// ㄴ 회원 가입
		// ㄴ 회원 탈퇴
		// ㄴ 로그인/아웃
		// ㄴ 비밀번호 재설정
		// ㄴ 회원 조회
		// ㄴ 한 명 조회(아이디로)
		// ㄴ 전체 조회
		CMS system = new CMS();
		system.run();
	}
}