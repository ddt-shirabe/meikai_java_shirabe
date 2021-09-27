package Chap07;
/*
 * クラス名: Enshu7_30
 * 概要	:二つのint型整数a,bの最小値、三つのint型整数a,b,cの最小値、配列aの要素の最小値を求める
 * 		 多重定義されたメソッド群の作成
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:int min(int a, int b)
 * 		 int min(int a, int b, int c)
 * 		 int min(int[] a)
 */

import java.util.Scanner;

public class Enshu7_30 {
	// 二つのint型整数a,bの最小値を求めるメソッド
	static int min(int a, int b) {
		// aとbの内、小さい値を返却
		return a < b ? a : b;
	}

	// 三つのint型整数a,bの最小値を求めるメソッド
	static int min(int a, int b,int c) {
		// 最小値を格納する変数minを宣言、aを格納
		int min = a;
		// minよりもbが小さい場合
		if(b < min) {
			// minにbを代入
			min = b;
		}
		// minよりもcが小さい場合
		if(c < min) {
			// minにcを代入
			min = c;
		}
		// 最小値を返却
		return min;
	}

	// 配列a内の最小値を求めるメソッド
	static int min(int a[]) {
		// 配列内の最小値を格納
		int min = a[0];
		// 配列の要素数分for文を回す
		for(int i = 1; i < a.length; i++) {
			// i個目の要素がminよりも小さい場合
			if(a[i]< min) {
				// i個目の要素をminへ代入
				min = a[i];
			}
		}
		// 最小値を返却
		return min;
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// xの値の入力を促す文章
		System.out.print("xの値：");
		// 入力された値を変数xに格納
		int x = stdIn.nextInt();
		// yの値の入力を促す文章
		System.out.print("yの値：");
		// 入力された値を変数yに格納
		int y = stdIn.nextInt();
		// zの値の入力を促す文章
		System.out.print("zの値：");
		// 入力された値を変数zに格納
		int z = stdIn.nextInt();

		// 配列の要素数の入力を促す文章
		System.out.print("配列aの要素数：");
		// 入力された値を変数nに格納
		int n = stdIn.nextInt();
		// 入力された要素数を持つ配列aの宣言
		int[] a = new int[n];

		// 要素数分for文を回す
		for(int i = 0; i < n; i++) {
			// zの値の入力を促す文章
			System.out.print("配列aの" + i + "個目の要素を入力：");
			// 配列aのi個目の要素を入力
			a[i] = stdIn.nextInt();
		}
		// x、yの最小値を表示
		System.out.println("x,yの最小値は" + min(x,y) + "です");
		// x、y、zの最小値を表示
		System.out.println("x,y,zの最小値は" + min(x,y,z) + "です");
		// 配列aの最小値を表示
		System.out.println("配列aの最小値は" + min(a) + "です");
	}
}
