package Chap07;

/*
 * クラス名: Enshu7_10
 * 概要	:P.238のMentalArithmetic.javaを加減の様々なパターンに対応できるように書き換える
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:指定パターン「x+y+z」、「x+y-z」、「x-y+z」、「x-y-z」
 */

import java.util.Random;
import java.util.Scanner;

public class Enshu7_10 {
	// 標準入力ストリーム
	static Scanner stdIn = new Scanner(System.in);

	// 問題出題を再度行うか判定するメソッドconfirmRetry
	static boolean confirmRetry() {
		// 判定値を格納する変数cont
		int cont;
			// 0か1以外の値が入力されたら再入力させる
			do {
				// 入力を促す文章
				System.out.println("もう一度？<Yes…1/No…0>：");
				// 入力値を格納
				cont = stdIn.nextInt();
			// 入力値が0か1かを判定
			}while(cont != 0 && cont != 1);
			// contが1であればtrue、0であればfalseを返却する
			return cont == 1;
	}

	public static void main(String[] args) {
		// Randomクラスの初期化
		Random rand = new Random();

		// 文章表示
		System.out.println("暗算力トレーニング!!");

		// 使用する3つの乱数を格納する変数をそれぞれ宣言
		int x;
		int y;
		int z;

		// 解答された値を格納する変数を宣言
		int k;

		// 再度出題の際はdo while間をもう一度通す
		do {

			// 使用する3つの乱数を生成、格納
			x = rand.nextInt(900) + 100;
			y = rand.nextInt(900) + 100;
			z = rand.nextInt(900) + 100;

			// x+y+zの問題出題
			while(true) {
				// 問題表示
				System.out.println(x + "+" + y + "+" + z + "=");
				// 入力された値の格納
				k = stdIn.nextInt();
				// 解答が答えと一致した場合
				if(k == x + y + z) {
					// while文のループを抜け出す
					break;
				}
				// 誤答文章表示
				System.out.println("違います!!");
			}

			// x+y-zの問題出題
			while(true) {
				// 問題表示
				System.out.println(x + "+" + y + "-" + z + "=");
				// 入力された値の格納
				k = stdIn.nextInt();
				// 解答が答えと一致した場合
				if(k == x + y - z) {
					// while文のループを抜け出す
					break;
				}
				// 誤答文章表示
				System.out.println("違います!!");
			}

			// x-y+zの問題出題
			while(true) {
				// 問題表示
				System.out.println(x + "-" + y + "+" + z + "=");
				// 入力された値の格納
				k = stdIn.nextInt();
				// 解答が答えと一致した場合
				if(k == x - y + z) {
					// while文のループを抜け出す
					break;
				}
				// 誤答文章表示
				System.out.println("違います!!");
			}

			// x-y-zの問題出題
			while(true) {
				// 問題表示
				System.out.println(x + "-" + y + "-" + z + "=");
				// 入力された値の格納
				k = stdIn.nextInt();
				// 解答が答えと一致した場合
				if(k == x - y - z) {
					// while文のループを抜け出す
					break;
				}
				// 誤答文章表示
				System.out.println("違います!!");
			}
		}while(confirmRetry());
	}

}
