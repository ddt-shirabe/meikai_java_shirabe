package Chap07;

/*
 * クラス名: Enshu7_7
 * 概要	:P.232記載のIsoscelesTriangleLBを
 * 		 P.233記載のIsoscelesTriangleRBに含まれるメソッドputCharsを呼び出す形に書き換える
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_7 {

	/*
	 * 条件指定されたメソッドputChars
	 * 引数に記載された文字cを0以上～引数n未満個数のcを並べて表示する
	 */
	static void putChars(char c, int n) {
		// 0以上～n未満個数のcを並べて表示する
		while (n-- > 0) {
			// 引数cの表示
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 文章表示
		System.out.println("左下直角の三角形を表示します。");
		// 段数入力を促す文章
		System.out.print("段数は：");
		// 入力された値を格納
		int n = stdIn.nextInt();

		// 入力された段数分for文を繰り返す
		for (int i = 1; i <= n; i++) {
			// メソッドputCharsの呼び出し
			putChars('*', i);
			// 改行
			System.out.println();
		}
	}
}
