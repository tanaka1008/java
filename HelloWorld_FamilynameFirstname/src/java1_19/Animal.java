package java1_19;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Animal {
	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		@SuppressWarnings("unused")
		Dog dog = new Dog();
		System.out.println(dog.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(1);
		System.out.println(dog2.count);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。
		LocalDateTime nowDate = LocalDateTime.now();
		System.out.println(nowDate);
		@SuppressWarnings("unused")
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");

	}

}