package Chap04;
/*
 * クラス名: Enshu4_22
 * 概要	:n段のピラミッドを表示する
 * 作成者:S.Sugita
 * 作成日:2021.09.13
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_22 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 数値入力を促す文章表示。正の整数ではない場合、再度入力を促す
		int n;
		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int stacks = 0;

		// 入力された正の整数値段のピラミッドを作成
		for (int i = n; i > 0; i--) {
			// カウントをして段数を数える
			stacks++;
			int ast = (stacks - 1) * 2 +1;

			for(int j = n - stacks; j >= 1 ; j--) {
				System.out.print(' ');
			}
			for(int j = ast; j >= 1; j--) {
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}
	}
}
