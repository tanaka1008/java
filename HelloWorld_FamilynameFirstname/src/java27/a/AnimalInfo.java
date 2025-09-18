package java27.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("動物情報を入力してください（例: ライオン：2.1:80、ゾウ：3.2:40）：");
        
        String input = scanner.nextLine();

        input = input.replace('、', ',').replace('，', ',').replace('：', ':');

        String[] animals = input.split(",");

        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラレオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");

        for (String animalData : animals) {
            String[] parts = animalData.split(":");
            if (parts.length != 3) {
                System.out.println("データ形式が正しくありません: " + animalData);
                continue;
            }

            String name = parts[0];
            String length = parts[1];
            String speed = parts[2];
            String scientificName = scientificNames.getOrDefault(name, "不明");

            System.out.println("-----");
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
        }

        scanner.close();
    }
}