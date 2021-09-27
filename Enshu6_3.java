package Chap06;

/*
 * クラス名: Enshu6_3
 * 概要	:配列の各要素に1.1、2.2、3.3、4.4、5.5を代入して表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu6_3 {
	public static void main(String[] args) {
		// double配列の宣言
		double[] array = new double[5];

		// for文で回し、配列に値を格納
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1 + 0.1 * ( i + 1);
		}

		// 配列をfor文で回して表示
		for (int i = 0; i < array.length; i++) {
		System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}
