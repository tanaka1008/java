package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		String[] num = {
			"001", "002", "003", "004", "005", "006", "007", "008", "009", "010",
			"011", "012", "013", "014", "015", "016", "017", "018", "019", "020"
		};

		System.out.println("### 001×001 から 009×020 までの九九を表示 ###");

		for (int i = 0; i < 9; i++) {  // 001〜009 まで
			for (int j = 0; j < num.length; j++) {  // 001〜020 まで
				int kuku = Integer.valueOf(num[i]) * Integer.valueOf(num[j]);
				String kukuStr = String.format("%03d", kuku);
				System.out.print(num[i] + " × " + num[j] + " = " + kukuStr + " || ");
			}
			System.out.println();  // 1段ごとに改行
		}
	}
}