package Chap04;
/*
 * クラス名: Enshu4_1
 * 概要	:入力された整数値が正か負かを判定する
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu4_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;														// 繰り返し判定用の変数の宣言
		do {
			System.out.print("整数値を入力してください。：");			// 数値の入力を促す文章
			int n = stdIn.nextInt();									// 入力された値を変数nに格納

			if (n > 0) {												// nが正の数の場合
				System.out.println("その値は正です。");					// 文章表示
			}else if(n < 0) {											// nが負の数の場合
				System.out.println("その値は負です。");					// 文章表示
			}else {														// nが0の場合
				System.out.println("その値は０です。");					// 文章表示
			}
		System.out.print("もう一度判定しますか？ 1…Yes／0…No ：");	// 再度判定を行うかを問う文章表示
		retry = stdIn.nextInt();										// 入力された値をretryへ格納
		}while (retry == 1);											// 1の場合、再度判定
	}
}