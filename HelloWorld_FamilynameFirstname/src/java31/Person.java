package java31;

public class Person {
		// 問題1：クラスフィールド count（初期値 0）
		private static int count = 0;

		// インスタンスフィールド
		private String name;
		private int age;
		private double height;
		private double weight;

		// コンストラクタ
		Person(String name, int age, double height, double weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;

			// 問題2：インスタンス生成時に count をインクリメント
			count++;
		}

		// BMIを返すメソッド
		public double bmi() {
			double rawBmi = this.weight / (this.height * this.height);
			return Math.floor(rawBmi);
		}


		// 自己紹介メソッド
		public void print() {
			System.out.println("名前は" + this.name + "です");
			System.out.println("年は" + this.age + "です");
			System.out.println("BMIは" + this.bmi() + "です");
		}

		// 問題4 & 5：クラスメソッドで人数を表示
		public static void printCount() {
			System.out.println("合計" + count + "人です");
		}
	}

