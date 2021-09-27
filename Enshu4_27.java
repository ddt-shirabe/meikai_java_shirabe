package Chap04;
/*
 * クラス名: Enshu4_27
 * 概要	:数当てゲーム(0～99を当てさせる)
 * 作成者:S.Sugita
 * 作成日:2021.09.13
 * 備考	:入力回数制限あり。（５回）
 */

import java.util.Random;
import java.util.Scanner;

public class Enshu4_27 {
	public static void main(String[] args) {
		// Randomクラスのインスタンスを初期化
		Random rand = new Random();
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 文章表示
		int no = rand.nextInt(100);
		System.out.println("数当てゲーム開始！");
		System.out.println("0～99の数を当てて下さい。");


		// xに実数値を読み込み、入力値によって大きいか小さいか文章を表示する
		int x;
		int count = 0;
		Outer:
			if(count == 5)
				 break Outer;
			do {
				count++;
				System.out.print("いくつでしょう。");
				x = stdIn.nextInt();
				if(x > no) {
					System.out.println("もっと小さな数だよ。");
				}else if(x < no) {
					System.out.println("もっと大きな数だよ。");
				}
			}while(x != no);
		System.out.println("正解は" + no +"です。");
	}

}
