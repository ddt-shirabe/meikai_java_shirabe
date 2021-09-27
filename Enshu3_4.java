package Chap03;

import java.util.Scanner;

public class Enshu3_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("数値a：");
		int a = stdIn.nextInt();

		System.out.print("数値b：");
		int b = stdIn.nextInt();

		if (a > b)
			System.out.println("aの方が大きいです。");
		else if(b < a)
			System.out.println("bの方が大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}
}