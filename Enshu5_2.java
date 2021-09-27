package Chap05;
/*
 * クラス名: Enshu5_2
 * 概要	:入力されたfloat型とdouble型の数値を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.13
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu5_2 {
	public static void main(String[] args) {

		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 数値入力を促す文章表示、数値の格納
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x：");
		float x = stdIn.nextFloat();
		System.out.print("y：");
		double y = stdIn.nextDouble();

		// 表示
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
	}
}
