package Chap06;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名: Enshu6_7
 * 概要	:線形探索、後ろから探索する
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:「LinearSearch」を書き換える。
 */

public class Enshu6_7 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 設定されている要素数12を入れて配列の宣言
		final int n = 12;
		int[] a = new int[n];

		// 0～9までのランダムな数字を生成、配列に格納する
		for (int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}

		// 配列の値を全表示
		System.out.print("配列aの全要素の値\n{");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("}");

		// 探す値を入力する
		System.out.print("探す数値：");
		int key = stdIn.nextInt();

		// 探す値について、末尾側からfor文で回し評価していく
		int i;
		for (i = n - 1; i >= 0; i--) {
			if(a[i] == key) {
				break;
			}
		}

		// 結果表示文
		if(i < n) {
			System.out.println("それはa[" + i + "]にあります。");
		}else{
			System.out.println("それはありません。");
		}
	}
}
