package Chap04;
/*
 * クラス名: Enshu4_24
 * 概要	:読み込んだ整数が素数であるかを判定
 * 作成者:S.Sugita
 * 作成日:2021.09.10
 * 備考	:0以下の数値が入力された場合、再度入力を促す
 */

import java.util.Scanner;

public class Enshu4_24 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 判定する値の数の入力を促す
		int n = 0;
		do {
			System.out.println("素数であるかを判定します。");
			System.out.print("正の整数値を入力：");
			n = stdIn.nextInt();
		} while (n < 0);

		// 2以上n未満の数で割り、割り切れた場合素数ではないとみなしブレイクする
		for(int i = 2; i <= n; i++) {
			if(i == n){
				System.out.println("入力された数は素数です。");
			}else if (n % i == 0) {
				System.out.println("入力された数は素数ではありません。");
				break;
			}
		}
	}
}
