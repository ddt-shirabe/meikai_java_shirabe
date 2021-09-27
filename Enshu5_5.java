package Chap05;
/*
 * クラス名: Enshu5_5
 * 概要	:三つの整数値の平均値と合計値を実数で求める
 * 作成者:S.Sugita
 * 作成日:2021.09.13
 * 備考	:キャスト演算子を利用すること
 */

import java.util.Scanner;

public class Enshu5_5 {
	public static void main(String[] args) {

		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 数値入力を促す文章表示、数値の格納
		System.out.println("整数値x、y、zの平均値を求めます。");
		System.out.print("x：");
		int x = stdIn.nextInt();
		System.out.print("y：");
		int y = stdIn.nextInt();
		System.out.print("z：");
		int z = stdIn.nextInt();

		//平均値と合計値を求め、表示
		double ave = (double)(x + y + z) / 3;
		double	sum = (double)(x + y + z);
		System.out.println("平均値は" + ave + "です。");
		System.out.println("合計値は" + sum + "です。");
	}
}
