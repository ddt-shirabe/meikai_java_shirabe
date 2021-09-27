package Chap03;

import java.util.Scanner;

public class Enshu3_9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();

		System.out.print("整数b：");
		int b = stdIn.nextInt();

		int maxi = a > b ? a : b;
		System.out.println("大きいほうの値は" + maxi + "です。");
	}

}
