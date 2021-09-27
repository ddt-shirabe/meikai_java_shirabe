package Chap07;

/*
 * クラス名: Enshu7_22
 * 概要	:配列aと同じ配列を生成して返却するメソッドarrayCloneの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:特になし
 */


public class Enshu7_22 {

	// 配列aと同じ配列を生成して返却するメソッドarrayClone
	static int[] arrayClone(int[] a) {
		// 返却する配列cloneの宣言、要素数は配列aと同じにする
		int[] clone = new int[a.length];
		// 配列aの要素数分for文を回す
		for(int i = 0; i < a.length; i++) {
			// 配列a[i]の要素をclone[i]へ代入
			clone[i] = a[i];
		}
		// 配列cloneを返却
		return clone;
	}

	public static void main(String[] args) {
		// コピー元となる配列aの宣言
		int[] a = new int[5];
		// 要素の格納
		a[0] = 3;
		a[1] = 55;
		a[2] = 23;
		a[3] = -3;
		a[4] = 1097;

		// メソッドarrayCloneを呼び出し、返却された配列をbに格納
		int[] b =  arrayClone(a);
		// bの要素数分for文を回す
		for (int i = 0; i < b.length; i++) {
			// 配列bのi個目の要素を表示
			System.out.println("clone[" + i + "] = " + b[i]);
		}
	  }
}
