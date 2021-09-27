package Chap04;
/*
 * クラス名: Enshu4_14
 * 概要	:1から整数nまでの和を式とともに
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);						// 標準入力ストリーム

		System.out.println("1からnまでの和を求めます。");				// 文章表示
		int n;
		do {
			System.out.print("nの値：");								// nの値の入力を促す
			n = stdIn.nextInt();										// nに実数値を読み込む
		}while(n <= 0);													// 正の整数値出ない場合、再度入力を促す

		int sum= 0;														// 合計値を入れる変数の宣言
		for(int i = 1; i<=n; i++) {										// 1からnの値をループさせ足していく
			System.out.print(i);										// 数値の表示
			System.out.print(i == n ? " = " : " + ");					// 最後の数値の場合はイコールを、それ以外はプラスを表示
			sum += i ;													// sumにiを足す
		}
		System.out.println( sum );										// 和の表示
	}
}
