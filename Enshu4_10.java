package Chap04;
/*
 * クラス名: Enshu4_10
 * 概要	:入力された正の整数値を分だけアスタリスクを表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		// 標準入力ストリーム

		System.out.println("何個*を表示しますか。");	// 文章表示
		int n = stdIn.nextInt();						// nに実数値を読み込む

		for(int i = 0; i < n; i++) {					// 入力された数値だけループ
			System.out.print('*');						// アスタリスクの表示
			if (n <= i) {								// 入力値が0以下だった場合
				System.out.println();					// 改行文字を表示しない
			}
		}
	}
}
