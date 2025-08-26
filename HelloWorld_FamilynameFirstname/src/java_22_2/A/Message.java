package java_22_2.A;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
	private String greeting;
	private String sushiComment;
	private String cuisineType;
	private String currentDateTime;

  // コンストラクタ
  public Message() {
      this.greeting = "こんにちは！ここは日本です！";
      this.sushiComment = "この寿司はうまい";
      this.cuisineType = "寿司は和食です";

      // 現在日時を取得
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      this.currentDateTime = now.format(formatter);
  }

  // メッセージを表示するメソッド
  public void displayMessage() {
      System.out.println(this.greeting);
      System.out.println(this.sushiComment);
      System.out.println(this.cuisineType);
      System.out.println("今の現在日時は" + this.currentDateTime + "です");
  }
}
