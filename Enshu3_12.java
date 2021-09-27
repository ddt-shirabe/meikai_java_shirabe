package Chap03;
/*
 * クラス名: Enshu3_12
 * 概要	:入力した三つの整数値の最小値を求める
 * 作成者:S.Sugita
 * 作成日:2021.09.08
 * 備考	:特になし
 */

import java.util.Scanner;
public class Enshu3_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);			// 標準入力ストリーム

		System.out.print("整数a：");						// aの値の入力を促す
		int a = stdIn.nextInt();							// aに実数値を読み込む

		System.out.print("整数b：");						// bの値の入力を促す
		int b = stdIn.nextInt();							// bに実数値を読み込む

		System.out.print("整数c：");						// cの値の入力を促す
		int c = stdIn.nextInt();							// cに実数値を読み込む

		int min = a; 										// minをaの値で初期化する
		if(b < min) min = b;								// bの値がminよりも小さい場合、bを代入する
		if(c < min) min = c;								// cの値がminよりも小さい場合、cを代入する

		System.out.println("最小値は" + min + "です。");	// 最小値を表示する
	}
}
