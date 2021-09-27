package Chap04;

/*
 * クラス名: Enshu4_6
 * 概要	:入力された正の整数値を分だけアスタリスクを表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:読み込んだ数値が1以下である場合、改行文字を表示しない。
 */


import java.util.Scanner;

public class Enshu4_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		// 標準入力ストリーム

		System.out.println("何個*を表示しますか。");	// 文章表示
		int n = stdIn.nextInt();						// nに実数値を読み込む

		int i = 0;										// カウント用変数の宣言


		while(i < n) {									// 入力された数値だけループ
			System.out.print('*');						// アスタリスクの表示
			i++;										// カウント
		}
		if (n >= 1) {									// 入力された数値が1以下である場合
			System.out.println();						// 改行文字を表示しない
		}
	}

}
