package Chap03;
/*
 * クラス名: Enshu3_11
 * 概要	:入力した整数値の差を表記
 * 作成者:S.Sugita
 * 作成日:2021.09.08
 * 備考	:特になし
 */

import java.util.Scanner;
public class Enshu3_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);			// 標準入力ストリーム

		System.out.print("整数a：");						// aの値の入力を促す
		int a = stdIn.nextInt();							// aに実数値を読み込む

		System.out.print("整数b：");						// bの値の入力を促す
		int b = stdIn.nextInt();							// bに実数値を読み込む

		int number = Math.abs(a - b);						// 2つの値の絶対値を求める

		if(number <= 10 ) { 								// 値の差が10以下の場合
			System.out.println("それらの差は10以下です。");	// 文章表示
		}else {
			System.out.println("それらの差は11以上です。");	// 文章表示
		}

	}

}
