package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	private static final int MAX = 12;
	private static Scanner scanner = new Scanner(System. in);
	private static Random r = new Random();
	
	public static void main(String[] args) {
		String[] strs = scanner. nextLine().split("、");
		for (String str : strs) {
			int n = r.nextInt(MAX);
			String cap = str + "の残りの台数は" + n + "台です";
			switch (str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ":
				cap = "テレビ" .equals(str) ? str + "の残り台数は" + (MAX - n)  : cap;
			case "ディスプレイ":
				cap = "ディスプレイ".equals(str) ? str + "の残り台数は" + (12 - (MAX - n))  : cap;
				break;
				default:
					cap = " 『 " + str + " 』 は指定の商品ではありません";
			}
			System.out.println(cap);
			}
		}
	}


