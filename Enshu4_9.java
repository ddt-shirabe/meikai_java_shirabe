package Chap04;
/*
 * クラス名: Enshu4_9
 * 概要	:1から整数nまでの積を求める
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:オーバーフローを起こさないよう、入力値は39までとする。
 */

import java.util.Scanner;

public class Enshu4_9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);						// 標準入力ストリーム

		System.out.println("1からnまでの積を求めます。");				// 文章表示
		long n;
		do {
			System.out.print("nの値：");								// nの値の入力を促す
			n = stdIn.nextLong();										// nに実数値を読み込む
			if(n > 39) {
				System.out.println("より小さい値を入力してください。");	// より小さい値の入力を促す。
				n = 0;													// nの値を0にして再度入力を促す
			}
		}while(n <= 0);													// 正の整数値出ない場合、再度入力を促す

		long sum= 1;													// 合計値を入れる変数の宣言
		long i = 1;														// カウント用変数の宣言

		while(i <= n) {
			sum *= i;													// sumにiを掛ける
			i++;														// iをインクリメント
		}
		System.out.println("1から" + n +"までの積は" + sum + "です。");	// 積表示
	}
}
