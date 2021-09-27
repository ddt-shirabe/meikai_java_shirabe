package Chap02;

import java.util.Random;

public class Enshu2_7 {
	public static void main(String[] args) {
		Random rand = new Random();

		int a = rand.nextInt(9) +1;
		int b = rand.nextInt(9) +1;
		int c = rand.nextInt(90) +10;

		System.out.println("今日のラッキーナンバーは" + a + "です。");
		System.out.println("今日のラッキーナンバーは" + -b + "です。");
		System.out.println("今日のラッキーナンバーは" + c + "です。");

	}

}
