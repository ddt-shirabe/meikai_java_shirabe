package Chap06;

import java.util.Scanner;

/*
 * クラス名: Enshu6_8
 * 概要	:配列の全要素の和、平均を求めて表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu6_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 要素数を入力し、int配列を宣言
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		double[] array = new double[n];

		// 配列内の要素を格納
		for (int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			array[i] = stdIn.nextInt();
		}

		// 要素数をカウントする変数
		int count = 0;
		// 合計を格納する変数
		double sum = 0;
		for (double i : array) {
			sum += i;
			count++;
		}
		System.out.println("全体の和は" + sum + "です。");
		System.out.println("全体の平均は" + sum / count + "です。");
	}
}
