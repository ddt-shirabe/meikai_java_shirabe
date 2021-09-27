package Chap02;

import java.util.Random;

public class Enshu2_9 {
	public static void main(String[] args) {
		Random rand = new Random();


		double a = rand.nextDouble();

		double b = rand.nextDouble();
		int random1 = rand.nextInt(10);

		double c = rand.nextDouble();
		int random2 = rand.nextInt(2);

		System.out.println("0.0以上1.0未満の実数値をランダム表示：" + a);
		System.out.println("0.0以上10.0未満の実数値をランダム表示：" + (b + random1));
		System.out.println("-1.0以上1.0未満の実数値をランダム表示：" + (c - random2));
	}
}
