package Chap05;
/*
 * クラス名: DecOctHexLiteral
 * 概要	:入力された10進数を8進数と16進数に変換する
 * 作成者:S.Sugita
 * 作成日:2021.09.13
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu5_1 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 数値入力を促す文章表示、数値の格納
		System.out.println("入力された数を8進数と16進数に変換します");
		System.out.print("整数を入力してください：");
		int n = stdIn.nextInt();

		// 変換して表示
		System.out.println(n + "は8進数に変換すると" + Integer.toOctalString (n) + "です。");
		System.out.println(n + "は16進数に変換すると" + Integer.toHexString(n) + "です。");
	}
}
