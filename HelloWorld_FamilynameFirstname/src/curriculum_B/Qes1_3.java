package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {

		Scanner sCanner = new Scanner(System.in);
		String name = null;
		boolean iflg = false;
		while (iflg == false) {
			name = sCanner.nextLine();
			 //name変数に値が入っているかどうか
			if (name.isEmpty() || name.length() == 0) { 
				System.out.println("[名前を入力してください]");
			} else if (name.length() >= 10) {  
				System.out.println("「名前を10文字以内にしてください」");
			} else if (!name.matches("[0-9a-zA-Z]*")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
			} else {
				System.out.printf("ユーザー名「%s」を登録しました%n", name);
				iflg = true;
			}
		}
		
		//じゃんけんの処理
		Random random = new Random();
		//じゃんけんの入力をわかりやすくしています
		System.out.println("じゃんけんをします。");
		String[] result = new String[3];
		result[0] = "グー";
		result[1] = "チョキ";
		result[2] = "パー";
		boolean flag = false;
		int userWins = 0;
		while (flag == false) {
			int myhund = sCanner.nextInt();
			int youhund = random.nextInt(3);

			System.out.println(name + "の手は[" + result[myhund] + "]");
			System.out.println("相手の手は[" + result[youhund] + "]");

			if ((myhund == 0 && youhund == 1) || (myhund == 1 && youhund == 2) || (myhund == 2 && youhund == 0)) {
				System.out.println("やるやん。\n次は俺にリベンジさせて");
				flag = true;
			} else if ((myhund == 0 && youhund == 2)) {
				System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
			} else if ((myhund == 1 && youhund == 0)) {
				System.out.println("俺の勝ち！\n何で負けたか、明日までに考えといてください。\nそしたら何かが見えてくるはずです");
			} else if ((myhund == 2 && youhund == 1)) {
				System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
			} else {
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
			userWins++;
		}
		System.out.println("\nおめでとうございます！勝つまでにかかった回数: " + userWins + "回");
		sCanner.close();
	}

}
