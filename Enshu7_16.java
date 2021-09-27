package Chap07;

/*
 * クラス名: Enshu7_16
 * 概要	:配列aの要素の最小値を求めるメソッドminOfの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_16 {

	// 配列aの全要素の合計を求めるメソッドsumOf
	static int minOf(int[] a) {
		// 最小値を格納する変数の宣言、0番目の要素を同時に格納
		int min = a[0];
		// 配列の要素数分for文を回す
		for(int i = 1; i < a.length; i++) {
			// i番目の要素がminに格納されている数値より小さい場合
			if(a[i] < min) {
				// i番目の値をminに代入する
				min = a[i];
			}
		}
		// 最小値を返却
		return min;
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 要素数の入力を促す文章
		System.out.print("要素数：");
		// 要素数を格納する変数
		int num = stdIn.nextInt();
		// 入力された要素数分を持つ配列xの宣言
		int[] x = new int[num];

		// 要素数分for文を回す
		for(int i = 0; i < num; i++) {
			// i番目の要素入力を促す文章
			System.out.print((i + 1) + "番目の要素：");
			// 入力された値の格納
			x[i] = stdIn.nextInt();
		}

		// メソッドsumOfを呼び出し、全要素の合計を受取り表示
		System.out.println("配列aの最小値：" + minOf(x));
	}
}