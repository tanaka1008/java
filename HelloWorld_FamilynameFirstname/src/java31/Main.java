package java31;

     class Main {
	  public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		    person1.print();

		    Person person2 = new Person("山田花子", 22, 1.5, 40);
		    person2.print();

		    // 問題3 & 問題6：人数を出力（クラスメソッド呼び出し）
		    Person.printCount();
		  }
		}


