package Chap04;
/*
 * クラス名: Enshu4_26
 * 概要	:読み込んだ整数を加算、平均値の提示（負の値は加算しない）
 * 作成者:S.Sugita
 * 作成日:2021.09.10
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_26 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 加算する値の数の入力を促す
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();

		// 合計値とループ数を格納する変数sumの宣言
		int sum = 0;
		int count = 0;

		for(int i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("負の値は加算しません。");
				continue;
			}
			sum += t;
			count++;
		}
		// 合計値と平均値を表示する
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + sum / count + "です。");
	}

}
