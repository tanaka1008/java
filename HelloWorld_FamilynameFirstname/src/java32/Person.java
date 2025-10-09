package java32;
public class Person {
    private static int count = 0;
    private String firstName;
    private String lastName; // 問題1: lastName を追加
    private int age;
    private double height, weight;

    // オーバーロードされたコンストラクタ（問題2,3対応）
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;  // 問題3: lastNameの代入
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++;            // 問題3: count をインクリメント
    }

    public String fullName() {
        return this.lastName + this.firstName;  // 日本式に姓+名
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}
