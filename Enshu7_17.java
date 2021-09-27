package Chap07;

/*
 * クラス名: Enshu7_17
 * 概要	:探索するキーと一致する最も末尾側に位置する要素を見つけるメソッドlinearSearchRの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:P.250のLinearSearch参照
 */

import java.util.Scanner;

public class Enshu7_17 {

	// 探索するキーと一致する最も末尾側に位置する要素を見つけるメソッドlinearSearchR
	static int linearSearchR(int[] a, int key) {
		// 返却値の宣言、初期は-1として"値がないもの"としている
		int num = -1;
		// 要素数分for文を回す
		for(int i = 0; i < a.length; i++) {
			// i番目の要素が検索する値と一致した場合
			if(a[i] == key){
				// 返却値をi番目とする
				num = i;
				}
			}
		// 返却値
		return num;
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 要素数の入力を促す文章
		System.out.print("要素数：");
		// 入力された要素数を格納する変数の宣言
		int num = stdIn.nextInt();
		// 入力された要素数分の配列の宣言
		int[] x = new int[num];

		// 要素数分for文を回す
		for(int i = 0; i < num; i++) {
			// i番目の要素の入力を促す文章
			System.out.print("x[" + i + "]：");
			// 入力された要素を配列xのi番目に格納
			x[i] = stdIn.nextInt();
		}
		// 探す値の入力を促す文章
		System.out.print("探す値：");
		// 入力された検索値の格納
		int ky = stdIn.nextInt();

		// メソッドlinearSearchRを呼び出し、値の検索
		int idx = linearSearchR(x, ky);

		// 検索結果が無かった場合(-1が返却された場合)
		if(idx == -1) {
			// 文章表示
			System.out.println("その値は存在しません。");
		// 返却値があった場合
		}else {
			// 位置の表示
			System.out.println("その値はx[" + idx + "]にあります。");
		}
	}
}
