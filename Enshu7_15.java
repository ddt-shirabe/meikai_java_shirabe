package Chap07;

/*
 * クラス名: Enshu7_15
 * 概要	:配列aの全要素の合計を求めるメソッドsumOfの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_15 {

	// 配列aの全要素の合計を求めるメソッドsumOf
	static int sumOf(int[] a) {
		// 合計値を格納する変数の宣言、0番目の要素を同時に格納
		int sum = a[0];
		// 配列の要素数分回す
		for(int i = 1; i < a.length; i++) {
			// i番目の要素を足す
			sum += a[i];
		}
		// 合計値を返却
		return sum;
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
		System.out.println("配列aの全要素の合計の和 = " + sumOf(x));
	}
}