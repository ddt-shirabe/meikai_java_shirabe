package Chap07;

/*
 * クラス名: Enshu7_4
 * 概要	:1からnまでの全整数の和を求めて返却するメソッドsumUpの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_4 {

	// 1からnまでの全整数の和を求めて返却するメソッドsumUp
	static int sumUp(int n) {
		// 合計値を格納して返却する変数sum
		int sum = 0;
		// n回目まで値を足す
		for(int i = 0; i <= n; i++) {
			// 今周分の整数を格納する
			sum += i;
		}
		// 和を返却する
		return sum;
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 文章表示
		System.out.println("1からnまでの全整数の和を求めます");
		// 実数nの入力を促す文章
		System.out.print("実数n：");
		// 入力された値を変数nに格納する
		int n = stdIn.nextInt();

		// メソッドsumUpを呼び出して整数の和を表示する
		System.out.println("1からの" + n + "までの整数の和は" + sumUp(n) + "です。");

		// Scannerクラスのインスタンスを開放する
		stdIn.close();
	}
}
