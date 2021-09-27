package Chap03;
/*
 * クラス名: Enshu3_13
 * 概要	:入力した３整数値のうち中央値を求める
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Arrays;
import java.util.Scanner;

public class Enshu3_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);			// 標準入力ストリーム

		System.out.print("整数a：");						// aの値の入力を促す
		int a = stdIn.nextInt();							// aに実数値を読み込む

		System.out.print("整数b：");						// bの値の入力を促す
		int b = stdIn.nextInt();							// bに実数値を読み込む

		System.out.print("整数c：");						// cの値の入力を促す
		int c = stdIn.nextInt();							// cに実数値を読み込む

		int[] numArray = new int[3]; 						// 値を入れる配列を宣言
		numArray[0] = a;									// aの値を配列に格納
		numArray[1] = b;									// bの値を配列に格納
		numArray[2] = c;									// cの値を配列に格納

		Arrays.toString(numArray);							// 配列numArrayを昇順にソート
		System.out.println(numArray[1]);					// 二番目に格納されている値を表示
	}

}
