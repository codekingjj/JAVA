package lv01;

// 1. Random 클래스 가져오기
import java.util.Random;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 Random : 무작위 난수를 추출
		
		// 2. Random : 객체를 생성하여 변수로 담아줌
		Random random = new Random();
		
		// 3. nextInt() 메소드 호출
		// ㄴ netInt(난수의 개수)
		// ㄴ 0부터 시작
		//int ranNum = random.nextInt(5);
		//ranNum = ranNum +1;
		
		int ranNum = random.nextInt(5) +1;
		
		System.out.println(ranNum);
		
		
	}

}
