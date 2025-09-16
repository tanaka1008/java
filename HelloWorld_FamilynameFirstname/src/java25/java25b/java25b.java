package java25.java25b;

import java.util.Scanner;

import java25.java25a.Player;

public class java25b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();  

        Player player = new Player(name); 
        player.setHp(player.generateRandom());
        player.setMp(player.generateRandom());
        player.setAttackPower(player.generateRandom());
        player.setSpeed(player.generateRandom());
        player.setDefense(player.generateRandom());
        player.showStatus();

        scanner.close();
    }
}