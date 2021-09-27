package Chap07;

/*
 * クラス名: Enshu7_27
 * 概要	:P.258 AddMatrixを修正し、三つの配列の要素数が正しい場合はtrueを返して計算を行い、
 *       等しくなければ計算は行わずfalseを返すようにする。
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:特になし
 */

public class Enshu7_27 {
	// 三つの配列の要素数が正しい場合はtrueを返して計算を行い、等しくなければ計算は行わずfalseを返すメソッドaddMatrix
	static boolean addMatrix(int[][] x, int[][]y, int[][]z) {
		// 三つの配列の要素数が等しい場合
		if(x.length == y.length && x.length == z.length) {
			// 配列xの行数for文を回す
			for (int i = 0; i < x.length; i++) {
				// 配列xの列数分for文を回す
				for(int j = 0; j < x[i].length; j++) {
					// 配列zにxとyの要素数の和を格納する
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			// 要素数が等しいため、trueを返す
			return true;
		// 要素数が等しくない場合
		}else {
			// 文章表示
			System.out.println("要素数が等しくありません。計算は行わず終了します。");
			// 要素数が等しく無い場合、falseを返す
			return false;
		}
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
		int[][] a = {{1,2,3},{4,5,6}};
		// 配列bの宣言
		int[][] b = {{6,3,4},{5,1,2}};
		// 配列cの宣言
		int[][] c = new int[2][3];

		// メソッドaddMatrixを呼び出し、trueが返ってきた場合
		if(addMatrix(a,b,c)) {
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
}
