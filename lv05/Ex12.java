package lv05;

import java.io.FileWriter;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 처리
		//ㄴ1) 쓰기 : FileWriter
		
		String fileName = "test.txt";
		FileWriter fw = null;
		
		//1. try-catch 구문 필요(IOException)
		try {
			//2.new FileWriter("파일명.확장자:)
			// fileName으로 FileWriter 객체 생성 -> 변수 fw에 담음
			 fw = new FileWriter(fileName);	// fileName으로 FileWriter 객체를 생성 -> 변수 fw에 담음
			 
			 // 3. 파일 쓰기 write(문자열)
 			 fw.write("이재정");
			 // 4. 사용 끝난 후, 종료시킴.close()
			 fw.close();
			 
			 System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("파일 쓰기 실패");
		}
	}

}
