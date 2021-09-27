package Chap04;
/*
 * クラス名: Enshu4_21_1
 * 概要	:左上が直角の直角三角形を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_21_1 {

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 数値入力を促す文章表示、数値の格納
		System.out.println("左上が直角の三角形を表示します。");
		System.out.print("段数は：");
		int a = stdIn.nextInt();

		// 左上が直角の直角三角形を表示
		for (int i = a; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}
	}

}
