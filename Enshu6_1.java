package Chap06;

/*
 * クラス名: Enshu6_1
 * 概要	:double型の配列(要素数：5)の配列を作成して表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu6_1 {
	public static void main(String[] args) {
		// double配列の宣言
		double[] array = new double[5];

		// 配列に値を格納
		array[0] = 51;
		array[1] = 37;
		array[2] = 51;
		array[3] = array[2] * 3;
		array[4] = array[0] + array[1];

		// インデックス毎に表示
		System.out.println("array[" + 0 + "] = " + array[0]);
		System.out.println("array[" + 1 + "] = " + array[1]);
		System.out.println("array[" + 2 + "] = " + array[2]);
		System.out.println("array[" + 3 + "] = " + array[3]);
		System.out.println("array[" + 4 + "] = " + array[4]);
	}

}
