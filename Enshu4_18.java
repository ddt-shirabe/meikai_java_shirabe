package Chap04;
/*
 * クラス名: 4_18
 * 概要	:1から読み込んだ整数nまでの二乗値を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);			// 標準入力ストリーム

		System.out.print("整数値：");						// 文章表示
		int n = stdIn.nextInt();							// nに実数値を読み込む

		for (int i = 1, j = 0; i <= n; i++) {				// for文でループ
			j = i * i;
			System.out.println(i + "の二乗は" + j);			// 約数表示
		}
	}
}
