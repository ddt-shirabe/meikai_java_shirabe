package Chap04;
/*
 * クラス名: Enshu4_20
 * 概要	:入力されたnの段の正方形をアスタリスクで表示する
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_20 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);


		//nの数を取得
		//do文で正の整数値以外の数値が入力された場合、再度入力を促す
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		}while(n <= 0);

		// アスタリスクをn個表示する、n回文表示処理を繰り返し実行。
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n ; j++ ) {
				System.out.print('*');
				// n個目になった際に改行、そうでない場合は空欄での整形
				if (j == n) {
					System.out.println();
				}else {
					System.out.print(' ');
				}

			}
		}

	}

}
