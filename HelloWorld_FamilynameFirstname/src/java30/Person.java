package java30;

class Person {
	// インスタンスフィールドを定義（問題1、4）
	public String name;
	public int age;
	public double height;
	public double weight;

	// 人数カウント用クラスフィールド（問題10）
	static int count = 0;

	// コンストラクタ（問題2、3、4）
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数をカウント
		count++;
	}

	// BMIを計算するメソッド（問題6、7）
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 自己紹介を出力するメソッド（問題8、9）
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	// 人数合計を出力するメソッド（問題10）
	static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}