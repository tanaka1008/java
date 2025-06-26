package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ログイン処理
		System.out.println("生徒の人数を入力してください(2以上)");
		int number = scanner.nextInt();
		int[][] numbers = new int[number][4];
		String subject[] = { "英語", "数学", "理科", "社会" };
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(1 + i + "人目の" + subject[j] + "の点数を入力してください");
				numbers[i][j] = scanner.nextInt();
			}
		}

		int goukei[] = new int[number];
		int[] average = new int[number];

		System.out.println("\t" + "\t英語" + "\t数学" + "\t理科" + "\t社会");
		// 生徒一人ずつの平均
		for (int i = 0; i < number; i++) {
			System.out.print("\n" + (i + 1) + "人目");

			for (int j = 0; j < numbers[i].length; j++) {

				goukei[i] += numbers[i][j];

			}
			average[i] = goukei[i] / subject.length;
			System.out.println("平均点は" + average[i] + "点です");
		}

		int goukeiS[] = new int[subject.length];
		int[] subjectAve = new int[subject.length];
		// 教科ごとの平均

		for (int i = 0; i < subject.length; i++) {

			for (int j = 0; j < number; j++) {

				goukeiS[i] += numbers[j][i];

			}
			subjectAve[i] = goukeiS[i] / number;
			System.out.println(subject[i] + "平均点は" + subjectAve[i] + "点です");
		}

		//全体の平均
		int sum = Arrays.stream(average).sum();
		System.out.println("全体の平均点は" + (sum / number) + "点です。");
		scanner.close();

	}
}
