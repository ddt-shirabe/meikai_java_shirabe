package Chap06;

import java.util.Scanner;

/*
 * クラス名: Enshu6_18
 * 概要	:P.214 UnivennessArrayを行数・各行の列数・各要素の値をキーボードから読み込むようにする。
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:特になし
 */

public class Enshu6_18 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 2次元配列cの宣言
		int[][] c;
		// 入力された行数を格納する変数の宣言、格納
		int line;
		// 入力された列数を格納する変数の宣言
		int column;


		// 文章表示
		System.out.println("まずは行数を入力します。");
		// 行数の入力を促す文章
		System.out.print("行数：");
		// 入力された行数を格納する変数の宣言、格納
		line = stdIn.nextInt();
		// 2次元配列cに行数を設定
		c = new int[line][];
		// 改行
		System.out.println();

		// 文章表示
		System.out.println("次に列数を入力します。");
		// 各行毎に列数を格納するため、行の長さ分for文で配列を回す
		for(int i = 0; i < c.length; i++) {
			// 列数の入力を促す文章
			System.out.print(i + "行目の列数：");
			// 入力された列数を格納する
			column = stdIn.nextInt();
			// i行目に入力された列数を格納する
			c[i] = new int[column];
		}
		// 改行
		System.out.println();

		// 文章表示
		System.out.println("最後に要素を入力します。");
		// 行数分for文を回す
		for (int i = 0; i < c.length; i++) {
			// i行目の列数分更にfor文を回す
			for (int j = 0; j < c[i].length; j++) {
				// 要素の入力を促す文章
				System.out.print("c[" + i + "][" + j + "]の要素は：");
				// 入力された要素を格納
				c[i][j] = stdIn.nextInt();
			}
			// 改行
			System.out.println();
		}

		// 要素を表示する為、まず行数分for文を回す
		for(int i = 0; i < c.length; i++) {
			// i行目の列数分for文を回す
			for(int j = 0; j < c[i].length; j++) {
				// 整形する為に3桁幅の10進数で対象の要素を表示
				System.out.printf("%3d", c[i][j]);
			}
			// 改行
			System.out.println();
		}
	}

}
