package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		String num[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09" };
		String kukustr = null ;
		System.out.println("###掛け算の九九をループで表示###");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				int kuku = Integer.valueOf(num[i]) * Integer.valueOf(num[j]);
				if (kuku <= 9) {
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
