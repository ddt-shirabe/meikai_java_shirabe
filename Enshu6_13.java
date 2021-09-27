package Chap06;

import java.util.Scanner;


/*
 * クラス名:Enshu6_13
 * 概要	:配列の全要素を逆順でコピーする
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu6_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		/* 要素数を入力し、２つの配列を宣言
		 * int[] a はコピー元
		 * int[] b はコピー先
		*/
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		// 入力された値を配列aに格納
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		// aの最後の値から順にbへ格納していく
		for (int i = 0; i < n; i++) {
			b[i] = a[n - 1 - i];
		}

		// 配列bの表示
		System.out.println("aの全要素を逆順でbにコピーしました。");
		for(int i = 0; i < n; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
