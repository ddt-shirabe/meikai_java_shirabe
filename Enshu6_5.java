package Chap06;

/*
 * クラス名: Enshu6_5
 * 概要	:配列の要素数と個々の要素の値を読み込んで、各要素の値を表示するプログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu6_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// int配列に入力した要素数を格納
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] array = new int[n];

		// 入力を促す文章、入力された値の格納
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			array[i] = stdIn.nextInt();
		}

		//for文で回して配列の値を表示、最後の数以外は句読点を入れる。
		System.out.print("a = {");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
			if(i != n-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
}
