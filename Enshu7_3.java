package Chap07;
/*
 * クラス名: Enshu7_3
 * 概要	:三つのint型引数a,b,cの中央値を求めるメソッドmedの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_3 {
	// 三つのint型引数a,b,cの中央値を求めるメソッドmed
	static int med(int a, int b, int c) {
		// aがb以上の場合
		if (a >= b) {
			// bがc以上の場合(a >= b >= cの場合)
			if (b >= c) {
				// 中央値bを返す
				return b;
			// cがa以上の場合(c >= a >= bの場合)
			}else if(a <= c) {
				// 中央値aを返す
				return a;
			// a >= c >= b の場合
			}else{
				// 中央値cを返す
				return c;
			}
		// b > a > c の場合
		}else if(a > c){
			// 中央値aを返す
			return a;
		// b > c > a の場合
		}else if (b > c){
			// 中央値cを返す
			return c;
		// c > b > aの場合
		}else{
			// 中央値bを返す
			return b;
		}
	}

	// 上記メソッドmedを実際に作動させる
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 整数aの入力を促す文章
		System.out.print("整数a:");
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

		// メソッドmedを呼び出し、中央値の表示
		System.out.println("中央値は" + med(a, b, c) + "です。");
	}

}
