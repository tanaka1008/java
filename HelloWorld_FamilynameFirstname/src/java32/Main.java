package java32;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("太郎", "鈴木", 20, 1.7, 60);
        person1.print();

        Person person2 = new Person("花子", "山田", 22, 1.5, 40);
        person2.print();

        Person.printCount();
    }
}