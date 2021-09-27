package Chap06;
/*
 * クラス名: ReverseArray
 * 概要	:配列の全要素を1～10の乱数で埋めるプログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

import java.util.Random;
import java.util.Scanner;

public class Enshu6_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 要素数を入力し、int配列を宣言
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] array = new int[n];

		/*
		 *  乱数で生成された値を配列に格納、表示。
		 *  前の値と同じ数の場合は再度乱数を生成して格納。
		 */
		for (int i = 0; i < n; i++) {
			array[i] = 1 + rand.nextInt(10) + 1;
			if(i != 0 && array[i] == array[i-1]) {
				array[i] = 1 + rand.nextInt(10) + 1;
			}
			System.out.println("array[" + i + "] =" + array[i]);
		}
	}
}
