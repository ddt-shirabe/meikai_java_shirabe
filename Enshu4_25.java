package Chap04;
/*
 * クラス名: Enshu4_25
 * 概要	:読み込んだ整数の加算と平均値を求める
 * 作成者:S.Sugita
 * 作成日:2021.09.10
 * 備考	:合計値が1,000を超えない範囲で加算する
 */

import java.util.Scanner;

public class Enshu4_25 {
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

		// n回文for文でループさせ、入力された数を足していく(0が入力されたら終了)
		for(int i = 0; i < n; i++) {
			System.out.print("整数’(0で終了)：");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1,000を超えました");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum += t;
			count++;
		}
		// 合計値と平均値を表示する
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + sum / count + "です。");
	}
}
