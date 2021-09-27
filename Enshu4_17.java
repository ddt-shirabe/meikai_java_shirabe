package Chap04;
/*
 * クラス名: 4_17
 * 概要	:読み込んだ整数の約数を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);			// 標準入力ストリーム

		System.out.print("整数値：");						// 文章表示
		int n = stdIn.nextInt();							// nに実数値を読み込む

		int count = 0;										// 約数の個数を格納する変数の宣言
		for (int i = 1;i <= n; i++)							// for文でループ
			if(n % i == 0) {								// 割り切れたら約数
				System.out.println(i);						// 約数表示
				count++;									// 約数が表示されるたびカウントする
			}
			System.out.println("約数は" + count + "個です"); //約数の数の表示
	}
}
