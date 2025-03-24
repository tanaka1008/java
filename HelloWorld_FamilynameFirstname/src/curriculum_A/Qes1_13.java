package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args){
	// 問1
	byte d;
	short myShort;
	int g;
	long l;
	double f;
	char a;
	String b;
	Boolean c;
	
	// 問２
	d = 0;
	myShort = 0;
	g = 0;
	l = 0L;
	f = 0.0d;
	a = '\u0000';
	b = null;
	c = false;
	
	//問３
	d = 10;
	myShort = 100;
	g = 1000;
	l = 10000L;
	f = 10.5d;
	a = 'a';
	b = "ハロー";
	c = true;
	
	//問４
	 System.out.println(l + g + myShort + d);
	 System.out.println(d * 2);
	 System.out.println(a + b + c);
	 System.out.println(a * myShort * g * l);
	 System.out.println(f / myShort);
	 System.out.println(d - 100);
	 
	
    //問５
	 int num= 20;
	 int num1 = 23;
	 System.out.println("ハローJAVA" + (num + num1));
	 
	//問６,７
	 String name = "山田太郎";
	 int age = 25;
	 double height = 170.5;
	 double weight = 62.2;
	 String hobby = "寿司";
	 double BMI = weight / (height * height) * (100 * 100);
	    
	        System.out.println("初めまして" + name + "です");
	    	System.out.println("年齢は" + age + "歳です");
	    	System.out.println("身長は" + height + "cmです");
	    	System.out.println("体重は" + weight + "kgです");
	    	System.out.println("好きな食べ物は" + hobby + "です");
	    	System.out.println("BMIは" + BMI  + "です");
	    	 
	    
    //問８、９、１０、１１、１２、１３
     name = "鈴木一郎";
	 age = 24;
	 height = 168.5;
	 weight = 64.2;
	 hobby = "オムライス";
	 BMI = weight / (height * height) * (100 * 100);
	    	
	    	System.out.println("初めまして" + name + "です");
	    	System.out.println("年齢は" + age + "歳です");
	    	System.out.println("身長は" + height + "cmです");
	    	System.out.println("体重は" + weight + "kgです");
	    	System.out.println("好きな食べ物は" + hobby + "です");
	    	System.out.println("BMIは" + BMI + "です");
	    	
	    	System.out.println("初めまして" + name + "です");
	    	System.out.println("年齢は" + age * 2 + "歳です");
	    	System.out.println("身長は" + height * 2 + "cmです");
	    	System.out.println("体重は" + weight * 2 + "です");
	    	System.out.println("好きな食べ物は" + hobby + "です");
	    	System.out.println("BMIは" + BMI / 2 + "です");
	    	System.out.println(age > 25);
	    	
	    	String age1 = String.valueOf(age);
	    	String height1 = String.valueOf(height);
	    	String weight1 = String.valueOf(weight);
	    	
	    	System.out.println(age1 + height1 + weight1);
	    	
	    	age = Integer.valueOf(age1);
	    	height = Double.parseDouble(height1);
	    	
	    	System.out.println(age > 25 || height > 160);
	}
	    	
	    	}
