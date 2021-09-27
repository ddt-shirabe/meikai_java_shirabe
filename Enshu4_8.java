package Chap04;
/*
 * クラス名: Enshu4_8
 * 概要	:正の整数を読み込んで桁数を出力する。
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);	// 標準入力ストリーム
		System.out.println("桁数を表示します。");	// 文章表示
		int x;										// 正の整数値を格納する変数の宣言

		do {
			System.out.print("正の整数値:");		// 数値の入力を促す
			x = stdIn.nextInt();					// xに正の整数値を読み込む
		}while(x <= 0);								// 正の整数値ではない値が入力された場合、再度入力を促す

		System.out.print("桁数は");					// 文章表示
		int count = 0;								// カウント用変数宣言
		while(x > 0) {
			count++;								// 桁数カウント
			x /= 10;								// 10で割る(1桁減らす)
		}
		System.out.println(count + "です。");		// 文章表示
	}


}
