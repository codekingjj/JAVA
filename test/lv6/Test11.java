package test.lv6;

class MiniTetris {
	String run(String a, String b) {
		
		
		return a;
	}
}

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		System.out.println(data);
		
		String block = "";
		
		//block += "2,2,2,2";
		
		block += "2,2,0";
		block += "\n0,2,2";
		
		System.out.println(block);
		
		MiniTetris game = new MiniTetris();
		data = game.run(data, block);
		
		System.out.println(data);
		
	}

}
