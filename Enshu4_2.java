package Chap04;
/*
 * クラス名: Enshu4_2
 * 概要	:数当てゲーム(10～99を当てさせる)
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Random;
import java.util.Scanner;

public class Enshu4_2 {
	public static void main(String[] args) {
		Random rand = new Random();										// Randomクラスのインスタンスを初期化
		Scanner stdIn = new Scanner(System.in);						// 標準入力ストリーム

		int no = rand.nextInt(90)+10;
		System.out.println("数当てゲームスタート");						// 文章表示
		System.out.println("10～99の数を当てて下さい。");				// 文章表示

		int x;
		do {
			System.out.print("いくつでしょう。");						// 文章表示
			x = stdIn.nextInt();										// xに実数値を読み込む

			if(x > no) { 												// 入力値が政界の数字より大きい場合
				System.out.println("もっと小さな数です。");				// 文章表示
			}else if(x < no) {											// 入力値が1の場合
				System.out.println("もっと大きな数です。");				// チョキを表示
			}
		}while(x != no);
		System.out.println("正解です。");								// 文章表示
	}

}
