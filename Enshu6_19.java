package Chap06;

import java.util.Scanner;

/*
 * クラス名: Enshu6_19
 * 概要	:クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラムの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.24
 * 備考	:合計点と平均点は、クラスごとのもの、全体のものをそれぞれ表示する
 */



public class Enshu6_19 {

	static int max() {
		int max = 0;

		return max;
	}

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 2次元配列testの宣言
		int[][] test;
		// 入力された行数を格納する変数の宣言、格納
		int numOfClass;
		// 入力された列数を格納する変数の宣言
		int numOfstudents;


		// クラス数の入力を促す文章
		System.out.print("クラス数：");
		// 入力されたクラス数(行数)を格納する変数の宣言、格納
		numOfClass = stdIn.nextInt();
		// 2次元配列testに行数を設定
		test = new int[numOfClass][];
		// 改行
		System.out.println();

		// 各行毎に列数を格納するため、クラス数分for文で配列を回す
		for(int i = 0; i < test.length; i++) {
			// 生徒数の入力を促す文章
			System.out.print(( i + 1 ) + "組の生徒数：");
			// 入力された生徒数を格納する
			numOfstudents = stdIn.nextInt();
			// i行目に入力された生徒数を格納する
			test[i] = new int[numOfstudents];

			// i組目の生徒数分更にfor文を回す
			for (int j = 0; j < test[i].length; j++) {
				// 点数の入力を促す文章
				System.out.print( ( i + 1 ) + "組" + ( j + 1 ) + "番の点数：");
				// 入力された点数を格納
				test[i][j] = stdIn.nextInt();
			}
			// 改行
			System.out.println();
		}
		// 改行
		System.out.println();
		// 文章表示
		System.out.println( " 組 |   合計   平均");
		// 文章表示
		System.out.println( "----+--------------");

		// 各クラスの合計点を格納する変数の宣言
		int sum = 0;
		// 全体の合計点を格納する変数の宣言
		int allSum = 0;

		// 点数を取得する為、まずクラス数分for文を回す
		for(int i = 0; i < test.length; i++) {
			// クラス毎に合計値を初期化
			sum = 0;
			// クラスの表示
			System.out.print((i + 1) + "組 |" );
			// クラスの生徒数分for文を回す
			for(int j = 0; j < test[i].length; j++) {
				// 該当する生徒のテストの点数を格納
				sum += test[i][j];
			}
			// クラスの合計点を表示
			System.out.printf("%7d", sum);
			// 全体の合計点算出のため、クラスの合計点を格納
			allSum += sum;
			// クラスの平均点を計算して表示。小数点第一の表示のため、double型にキャストする。
			System.out.printf("%7.1f\n", (double)sum / test[i].length);
			// 改行
			System.out.println();
		}
		// 文章表示
		System.out.println( "----+--------------");
		// 文章表示
		System.out.print( " 計 |");
		// 全体の合計点の表示
		System.out.printf("%7d", allSum);
		// 全体の平均点を計算して表示。小数点第一の表示のため、double型にキャストする。
		System.out.printf("%7.1f\n", (double)allSum / test.length);
		// 改行
		System.out.println();
	}
}
