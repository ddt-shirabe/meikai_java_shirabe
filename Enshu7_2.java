package Chap07;
/*
 * クラス名: Enshu7_2
 * 概要	:三つのint型引数a,b,cの最小値を求めるメソッドminの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_2 {
	// 三つのint型引数a,b,cの最小値を求めるメソッドmin
	static int min(int a, int b, int c) {
		// 返却値minの宣言、引数aの代入
		int min = a;
		// 引数bがminよりも小さい場合
		if(b < min) {
			// bを返却値minに代入する
			min = b;
		}
		// 引数cがminよりも小さい場合
		if(c < min) {
			// cを返却値minに代入する
			min = c;
		}
		// 最小値が格納されたint型minを返却する。
		return min;
	}

	// 上記メソッドminを実際に作動させる
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 整数aの入力を促す文章
		System.out.print("整数a：");
		// 入力された値をint型の変数aに代入する
		int a = stdIn.nextInt();
		// 整数bの入力を促す文章
		System.out.print("整数b:");
		// 入力された値をint型の変数bに代入する
		int b = stdIn.nextInt();
		// 整数cの入力を促す文章
		System.out.print("整数c:");
		// 入力された値をint型の変数cに代入する
		int c = stdIn.nextInt();

		// メソッドminを呼び出し、最小値の表示
		System.out.println("最小値は" + min(a, b, c) + "です。");
	}
}
