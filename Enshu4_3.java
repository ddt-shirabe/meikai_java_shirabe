package Chap04;
/*
 * クラス名: Enshu4_3
 * 概要	:二つの整数値を読み込み、間の整数値を表示する
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);				// 標準入力ストリーム

		System.out.print("整数Aを入力してください。：");		// 整数Aの入力を促す
		int a = stdIn.nextInt();								// aに実数値を読み込む
		System.out.print("整数Bを入力してください。：");		// 整数Bの入力を促す
		int b = stdIn.nextInt();								// bに実数値を読み込む

		int num = 0;											// 小さいほうの値を格納する変数の宣言
		int difference = 0;									// aとbの差を格納する変数の宣言

		if(a > b) {
			num = b;
			difference = a - b;
		}else if(a < b) {
			num = a;
			difference = b - a;
		}

		for (int i = 0; i < difference; i++) {
			System.out.println(num + i);
		}
	}
}