package java29.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java29.a.Prefecture;

public class Main {
    private static final String[] rawData = {
            "北海道:札幌市:83424",
            "青森県:青森市:9646",
            "岩手県:盛岡市:15275",
            "宮城県:仙台市:7282",
            "秋田県:秋田市:11638",
            "山形県:山形市:9323",
            "福島県:福島市:13784",
            "茨城県:水戸市:6097",
            "栃木県:宇都宮市:6408",
            "群馬県:前橋市:6362",
            "埼玉県:さいたま市:3798"
    };

    private static List<Prefecture> prefectureList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// データをオブジェクトとして読み込み
			for (String data : rawData) {
			    String[] parts = data.split(":");
			    String name = parts[0];
			    String capital = parts[1];
			    double area = Double.parseDouble(parts[2]);
			    prefectureList.add(new Prefecture(name, capital, area));
			}

			System.out.println("番号をカンマ区切りで入力してください (例: 8,5,9):");
			String[] indexInput = scanner.nextLine().split(",");

			System.out.println("昇順（asc）または降順（desc）を入力してください:");
			String order = scanner.nextLine().trim().toLowerCase();

			List<Prefecture> selected = new ArrayList<>();

			// 入力された番号に対応する都道府県を抽出
			for (String idxStr : indexInput) {
			    try {
			        int idx = Integer.parseInt(idxStr.trim());
			        if (idx >= 0 && idx < prefectureList.size()) {
			            selected.add(prefectureList.get(idx));
			        }
			    } catch (NumberFormatException e) {
			        System.out.println("無効な番号です: " + idxStr);
			    }
			}

			// ソート
			selected.sort((a, b) -> {
			    if (order.equals("asc")) {
			        return Double.compare(a.getArea(), b.getArea());
			    } else if (order.equals("desc")) {
			        return Double.compare(b.getArea(), a.getArea());
			    } else {
			        return 0; // 指定が不正な場合ソートなし
			    }
			});

			// 出力
			for (Prefecture p : selected) {
			    p.printInfo();
			}
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }
}
