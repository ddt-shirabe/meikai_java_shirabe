package Chap07;

/*
 * クラス名: Enshu7_9
 * 概要	:正の整数値をキーボードから読み込み、その値を返却するメソッドreadPlusIntの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:0や負の値が入力されたら再入力させる
 */

import java.util.Scanner;

public class Enshu7_9 {
	// 標準入力ストリーム
	static Scanner stdIn = new Scanner(System.in);

	// 正の整数値をキーボードから読み込み、その値を返却するメソッドreadPlusInt
	static int readPlusInt() {
		// 入力された値を格納する変数num
		int num = 0;
		// 0または負の数の場合再度入力を求めるためのdo while文
		do {
			// 正の整数値の入力を促す文章
			System.out.print("正の整数値：");
			// 入力された値を変数numに格納
			num = stdIn.nextInt();
		// 0以下の場合再度繰り返す
		}while(num <= 0);

		// 正の整数値を返却する
		return num;
	}

	public static void main(String[] args) {
		// 文章表示
		System.out.print("正の整数値を入力して下さい。");
		// メソッドreadPlusIntを呼び出して返却値を表示
		System.out.print(readPlusInt());
	}
}
