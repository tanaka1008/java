package java23;

public class java23 {
    private String name;
    private double length;
    private int speed;

    public void setName(String name) {
        this.name = name;  
    }

    public void setLength(double length) {
        this.length = length;  
    }

    public void setSpeed(int speed) {
        this.speed = speed;  
    }

    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void printInfo() {
        System.out.println("動物名：" + getName());
        System.out.println("体長：" + getLength() + "m");
        System.out.println("速度：" + getSpeed() + "km/h");
    }

    public static void main(String[] args) {
        java23 lion = new java23();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        lion.printInfo(); 
    }
}

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
体長：2.1m
速度：80km/h
	
*/