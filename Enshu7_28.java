package Chap07;

/*
 * クラス名: Enshu7_28
 * 概要	:行列xとyの和を格納した2次元配列を返すメソッドaddMatrixの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:配列x、yは行数及び列数が同一である前提として良い
 */

public class Enshu7_28 {
	// 行列xとyの和を格納した2次元配列を返すメソッドaddMatrix
	static int[][] addMatrix(int[][] x, int[][]y) {
		int[][]z = new int[2][3];
			// 配列xの行数for文を回す
			for (int i = 0; i < x.length; i++) {
				// 配列xの列数分for文を回す
				for(int j = 0; j < x[i].length; j++) {
					// 配列zにxとyの要素数の和を格納する
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			// 配列zを返す
			return z;

	}
	// 行列mの全要素を表示するメソッドprintMatrix
	static void printMatrix(int[][]m) {
		// mの行数分for文を回す
		for (int i = 0; i < m.length; i++) {
			// mの列数分for文を回す
			for(int j = 0; j < m[i].length; j++) {
				// 該当の要素の表示
				System.out.print(m[i][j] + " ");
			}
			// 改行
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// 配列aの宣言
		int[][] a = {{54,2,33},{42,51,3}};
		// 配列bの宣言
		int[][] b = {{22,23,44},{65,11,42}};
		// 配列cの宣言
		int[][] c = new int[2][3];

		// メソッドaddMatrixを呼び出し、trueが返ってきた場合
		c =addMatrix(a,b);
		// 文章表示
		System.out.println("行列a");
		// メソッドprintMatrixを呼び出し、配列aの要素を全て表示
		printMatrix(a);
		// 文章表示
		System.out.println("行列b");
		// メソッドprintMatrixを呼び出し、配列bの要素を全て表示
		printMatrix(b);
		// 文章表示
		System.out.println("行列c");
		// メソッドprintMatrixを呼び出し、配列cの要素を全て表示
		printMatrix(c);
	}
}
