package Chap04;
/*
 * クラス名: Enshu4_5
 * 概要	:正の整数値を0までカウントダウン
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:24行目のx--を--xとして動作確認を行う
 */

import java.util.Scanner;

public class Enshu4_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		// 標準入力ストリーム

		System.out.println("カウントダウンします。");	// 文章表示
		int x;											// 変数xの宣言
		do {
			System.out.print("正の整数値：");			// 文章表示
			x = stdIn.nextInt();						// xに実数値を読み込む
		}while(x <= 0);									// 正の整数値出ない場合、再度入力を求める。

		while(x >= 0) {									// 正の整数値が入力された場合
			System.out.println(--x);					// カウント数の表示
		}
	}

}
