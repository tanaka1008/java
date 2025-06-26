package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		String num[] = { "001", "002", "003", "004", "005", "006", "007", "008", "009" };
		String kukustr = null ;
		System.out.println("###掛け算の九九をループで表示###");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				int kuku = Integer.valueOf(num[i]) * Integer.valueOf(num[j]);
				if (kuku <= 9) {
					kukustr = "00" + kuku;
				} else if(kuku <= 90) {
						kukustr = "0" + kuku;
				} else {
				kukustr = String.valueOf(kuku);
				}
				if (Integer.valueOf(num[j]) < 9) {
					System.out.print(num[i] + " × " + num[j] + " = " + kukustr + "||");
				} else {
					System.out.print(num[i] + " × " + num[j] + " = " + kukustr + "||\r\n");	
				}
			}
		}
	}
}
