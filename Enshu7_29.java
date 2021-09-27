package Chap07;

/*
 * クラス名: Enshu7_29
 * 概要	:二次元配列aと同じ配列を生成して返却するメソッドarray2Cloneの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:特になし
 */


public class Enshu7_29 {
	// 配列aと同じ配列を生成して返却するメソッドarray2Clone
	static int[][] array2Clone(int[][] a) {
		// 返却する配列cloneの宣言、要素数は配列aと同じにする
		int[][] clone = new int[a.length][a[0].length];
		// 配列aの行数分for文を回す
		for(int i = 0; i < a.length; i++) {
			// 配列aの列数分for文を回す
			for(int j = 0; j < a[i].length; j++) {
				// 配列a[i][j]の要素をclone[i][j]へ代入
				clone[i][j] = a[i][j];
			}
		}
		// 配列cloneを返却
		return clone;
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
		// コピー元となる二次元配列aの宣言
		int[][] a = {{33,1,56},{6,46,77}};
		// メソッドarray2Cloneを呼び出し、返却された二次元配列をbに格納
		int[][] b =  array2Clone(a);
		// 文章表示
		System.out.println("配列a");
		// 配列aの表示のためメソッドprintMatrixを呼ぶ
		printMatrix(a);
		// 文章表示
		System.out.println("配列aのクローン");
		// 配列bの表示のためメソッドprintMatrixを呼ぶ
		printMatrix(b);
	  }
}
