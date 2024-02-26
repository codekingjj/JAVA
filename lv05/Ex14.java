package lv05;

import java.io.FileWriter;
import java.io.IOException;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "mom", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };

		String fileName = "fileTest02.txt";
		FileWriter fw = null;
		String data = "";
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) {
				data += names[i] + "/" + pws[i] + "/" + moneys[i];
			} else {
				data += names[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
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
