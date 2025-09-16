package java25.java25a;

import java.util.Random;

public class Player extends Character {
	private String name;

	// ランダムなステータス値を生成
	public int generateRandom() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}

	// コンストラクタ
	public Player(String name) {
		this.name = name;
	}

	// 名前のGetterとSetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ステータス表示メソッド
	public void showStatus() {
		System.out.println("こんにちは 「" + name + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttackPower());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println("さあ冒険に出かけよう！");
	}
}