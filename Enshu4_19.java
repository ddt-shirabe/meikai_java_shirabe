package Chap04;
/*
 * クラス名: Enshu4_19
 * 概要	:入力された月の季節を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_19 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);				// 標準入力ストリーム

		int retry;												// 繰り返し判定用の変数の宣言

		do {

		int month;

			do {
				System.out.print("季節を求めます。\n何月ですか：");		// 月入力を促す
				month = stdIn.nextInt();								// monthに実数値を格納

				if (month >= 3 && month <= 5)							// 3～5月の場合
					System.out.println("それは春です。");				// 春である旨を表示
				else if(month >= 6 && month <= 8)						// 6～8月の場合
					System.out.println("それは夏です。");				// 夏である旨を表示
				else if(month >= 9 && month <= 11)						// 9～11月の場合
					System.out.println("それは秋です。");				// 秋である旨を表示
				else if(month == 12 || month == 1 || month == 2)		// 12月、1月、2月の場合
					System.out.println("それは冬です。");				// 冬である旨を表示
			}while(month < 1 || month > 12);

		System.out.print("もう一度？ 1…Yes／0…No ：");		// 再度判定を行うか文章表示
		retry = stdIn.nextInt();								// 入力された値をretryへ格納
		}while (retry == 1);									// 1の場合、再度判定
	}
}
