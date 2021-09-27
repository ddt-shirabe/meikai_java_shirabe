package Chap04;
/*
 * クラス名: Enshu4_12
 * 概要	:入力された正の整数値を0からカウントダウン
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		// 標準入力ストリーム

		System.out.println("カウントダウンします。");	// 文章表示
		int x;											// 変数xの宣言
		do {
			System.out.print("正の整数値：");			// 文章表示
			x = stdIn.nextInt();						// xに実数値を読み込む
		}while(x <= 0);									// 正の整数値出ない場合、再度入力を求める。

		for(int i = 0; i <= x; i++) {					// 変数iを宣言してxに到達するまでループさせる
			System.out.println(i);						// カウント数の表示
		}
	}
}
