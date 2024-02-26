package lv05;

import java.util.Arrays;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0, data.length() - 1);
//		System.out.println(data);

		// 문제1) 위 데이터는 각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
		// 데이터를 아래와 같이 출력 하시오 (각 회원별 구입 총합)
		/*
		 * 
		 * =============================== 10001 김철수 2670 10002 이영희 1950 10003 유재석 4080
		 * 10004 박명수 7130
		 */

		String[] info = data.split("/|\n");

		String result = "";

		for (int i = 0; i < info.length; i += 3) {
			String key = info[i];
			String name = info[i +1];

			boolean isDupl = false;
			for (int j = 0; j < i; j += 3) {
				if (key.equals(info[j])) {
					isDupl = true;
				}
			}
			if (!isDupl) {
				int total = 0;

				for (int j = 0; j < info.length; j += 3) {
					if (key.equals(info[j])) {
						total += Integer.parseInt(info[j + 2]);
					}

				}
				result += key + " " + name + " " + total + "\n";
			}
		}
		System.out.println(result);
//		System.out.println(Arrays.toString(tmpData));
//		for (int i = 0; i< tmpData.length; i +=3) {
//			for (int j = i; j < tmpData.length; j+=3) {
//				if (tmpData[i].equals(tmpData[]))
//					
//			}
//		}
	}

}
