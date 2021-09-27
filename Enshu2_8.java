package Chap02;

import java.util.Random;
import java.util.Scanner;

public class Enshu2_8 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int r = stdIn.nextInt();

		int a = rand.nextInt(11) - 5 + r;

		System.out.println("その値の±5の乱数を生成しました。それは" + a + "です。" );
	}

}
