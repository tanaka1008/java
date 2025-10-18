package java33;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private double height;
	private double weight;

	public Person(String lastName, String firstName, int age, double height, double weight) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.lastName + " " + this.firstName;
	}

	// Car購入メソッド
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	// Bicycle購入メソッド
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}