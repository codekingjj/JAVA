package lv05;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 김철수/20,이만수/30,이영희/40

		String[] name = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };

		String fileName = "fileTest01.txt";
		FileWriter fw = null;
		String data = "";

		for (int i = 0; i < name.length; i++) {
			if (i == name.length - 1) {
				data += name[i] + "/" + ages[i];
			} else {
				data += name[i] + "/" + ages[i] + ",";
			}
		}

		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
