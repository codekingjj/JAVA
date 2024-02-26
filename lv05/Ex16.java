package lv05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		
		String data = "";

		if (file.exists()) {
			try {
//			String[] tmp = null;
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				
				while(br.ready()) {
					data += br.readLine() + "\n";
				}
//				String line = br.readLine();
//				while(line != null) {
//					data += line + "\n";
//					line = br.readLine();
//				}
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("불러오기 실패");
			}
			
		}
		String[] temp = data.split("\n");
		int cnt = temp.length;
		ids = new String[cnt];
		pws = new String[cnt];
		moneys = new int[cnt];
		for (int i =0; i< cnt; i++) {
			String[] info = temp[i].split("/");
			
			ids[i] = info[0];
			pws[i] = info[1];
			moneys[i] = Integer.parseInt(info[2]);
		}
		System.out.println();
	}

}
