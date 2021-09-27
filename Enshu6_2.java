package Chap06;

/*
 * クラス名: Enshu6_2
 * 概要	:int型で要素数が5の配列に、先頭から5,4,3,2,1を格納して表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu6_2 {
	public static void main(String[] args) {
		// int配列の宣言
		int[] array = new int[5];
		// 要素数を取得して、格納する値に使用
		int num = array.length;

		// for文で回し、配列に値を格納
		for (int i = 0; i < array.length; i++) {
			array[i] = num;
			num--;
		}

		// 配列をfor文で回して表示
		for (int i = 0; i < array.length; i++) {
		System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}
