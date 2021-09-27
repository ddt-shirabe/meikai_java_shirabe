package Chap03;
/*
 * クラス名: Enshu3_15
 * 概要	:入力された二つの整数値を降順にソートする
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;
public class Enshu3_15 {
	public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);				// 標準入力ストリーム

			System.out.print("整数a：");							// aの値の入力を促す
			int a = stdIn.nextInt();								// aに実数値を読み込む

			System.out.print("整数b：");							// bの値の入力を促す
			int b = stdIn.nextInt();								// bに実数値を読み込む

			if (a < b) {											// aがbより小さい場合
				int t = a;											// 一時的に値を格納する変数tを宣言
				a = b;												// aにbの値を入れる
				b = t;												// bにtの値(元はaに入っていた値)を入れる
			}

			System.out.println("a≧bとなるようにソートしました。");	// 文章表示
			System.out.println("変数aは" + a + "です。");			// 変数aの表示
			System.out.println("変数bは" + b + "です。");			// 変数bの表示

		}
}
