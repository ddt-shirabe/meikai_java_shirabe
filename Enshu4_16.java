package Chap04;
/*
 * クラス名: Enshu4_16
 * 概要	:入力された正の整数値を分だけアスタリスクを表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:アスタリスクを５個表示するごとに改行
 */

import java.util.Scanner;

public class Enshu4_16 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 文章表示
		System.out.println("何個*を表示しますか。");
		// nに実数値を読み込む
		int n = stdIn.nextInt();

		//入力された数値だけループさせてアスタリスクの表示
		for(int i = 1; i <= n; i++) {
			System.out.print('*');
			// 5個目のアスタリスクの場合、改行する。
			if(i % 5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
