package lv05;

import java.util.Arrays;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameData = "";
		nameData += "100001/이만수";
		nameData += "\n";
		nameData += "100002/이영희";
		nameData += "\n";
		nameData += "100003/유재석";
		nameData += "\n";
		nameData += "100004/박명수";
		nameData += "\n";
		nameData += "100005/김지연";
		nameData += "\n";
		nameData += "100006/박연미";

		String moneyData = "";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100003/7000";
		moneyData += "\n";
		moneyData += "100001/100";
		moneyData += "\n";
		moneyData += "100002/400";
		moneyData += "\n";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100004/900";
		moneyData += "\n";
		moneyData += "100001/130";
		moneyData += "\n";
		moneyData += "100003/200";
		moneyData += "\n";
		moneyData += "100002/700";
		moneyData += "\n";
		moneyData += "100002/900";
		moneyData += "\n";
		moneyData += "100004/800";

		// 문제) moneyData와 nameData를 조합해서 아래와 같이 만들어보세요
		// ㄴ userData를 완성할 때, moneyData 기준 해당 데이터의 주인의 이름을 함께 출력

		String userData = "";
//
//		String[] tmpNameData = nameData.split("/|\n");
//		String[] tmpMoneyData = moneyData.split("/|\n");
//
//		for (int i = 0; i < tmpMoneyData.length; i += 2) {
//			String numberData = tmpMoneyData[i];
//			for (int j = 0; j < tmpNameData.length; j += 2) {
//				if (numberData.equals(tmpNameData[j])) {
//					if (i == tmpMoneyData.length) {
//						userData += numberData + "/" + tmpNameData[j + 1] + "/" + tmpMoneyData[i + 1];
//					} else {
//						userData += numberData + "/" + tmpNameData[j + 1] + "/" + tmpMoneyData[i + 1] + "\n";
//					}
//				}
//			}
//		}
//		System.out.println(userData);
		String[] name = nameData.split("[\n | /]");
		String[] money = moneyData.split("[\n | /]");
		
		for (int i = 0; i < money.length; i+= 2) {
			userData += money[i] + "/";
			
			for (int j = 0; j < name.length; j += 2) {
				if (money[i].equals(name[j])) {
					userData += name[j + 1] + "/";
				}
			}

			userData += money[i + 1] + "\n";
		}
		
		System.out.println(userData);
	}

}
