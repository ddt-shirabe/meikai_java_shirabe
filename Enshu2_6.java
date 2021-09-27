package Chap02;

import java.util.Scanner;

public class Enshu2_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積を求めます。");

		System.out.print("底辺：");
		double x = stdIn.nextDouble();

		System.out.print("高さ：");
		double y = stdIn.nextDouble();

		System.out.println("面積は" + (x * y) /2 + "です。");
	}

}
