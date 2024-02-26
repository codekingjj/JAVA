package lv05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//파일 디렉토리
		// ㄴ기본 경로 : 프로젝트 하위에 위치
		// * 변경 가능
		String fileName = "test.txt";
		FileWriter fw = null;
		String data = "이재정";
		
		String filePath = System.getProperty("user.home");
		String sep = System.getProperty("file.separator");
		
		filePath += sep + "desktop";
		System.out.println(filePath);
		File file = new File (filePath, fileName);
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 바탕화면에(유저 홈 경로 하위에 desktop)에 파일 생성
//		
		
	}

}
