package Chap04;

/*
 * クラス名: Enshu4_7
 * 概要	:入力された正の整数値を分だけ交互に*と+を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */


import java.util.Scanner;

public class Enshu4_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		// 標準入力ストリーム

		System.out.println("何個*と+を表示しますか。");	// 文章表示
		int n = stdIn.nextInt();						// nに実数値を読み込む

		int i = 0;										// カウント用変数の宣言


		while(i < n) {									// 入力された数値だけループ
			if(i % 2 == 0) {							// カウントが偶数の場合
				System.out.print('*');					// アスタリスクの表示
				i++;									// カウント
			}else {										// カウントが奇数の場合
				System.out.print('+');						// プラスの表示
				i++;										// カウント
			}

		}
	}
}
