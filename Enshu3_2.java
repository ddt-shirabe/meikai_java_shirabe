package Chap03;

import java.util.Scanner;

public class Enshu3_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A：");
		int a = stdIn.nextInt();

		System.out.print("整数B：");
		int b = stdIn.nextInt();

		if ((a % b) == 0 )
			System.out.println("BはAの約数です。");
	}

}
