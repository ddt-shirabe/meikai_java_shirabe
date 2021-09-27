package Chap07;

/*
 * クラス名: Enshu7_11
 * 概要	:整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認する
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu7_11 {

	// int型のビット構成を表示するメソッドprintBits
	static void printBits(int x) {
		// 31ビットとしている為、31回のfor文とする
		for (int i = 31; i >= 0; i--) {
			// 該当桁数が1か0かを表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 文章表示
		System.out.print("整数：");
		// ビット構成行う整数を入力、格納
		int num = stdIn.nextInt();

		// シフトするビット数の入力を促す文章
		System.out.print("シフトするビット数：");
		// 入力された値の格納
		int shiftNum = stdIn.nextInt();

		// 文章表示
		System.out.print("ビット構成 = ");
		// メソッドprintBitsを呼び出して、入力された整数のビット構成を表示
		printBits(num);

		// 左にシフトした数を表記する旨を表す文章
		System.out.print("\nx <<  n = ");
		// 入力されたシフト数分値を左にシフトして、メソッドprintBitsを呼び出しビット構成を表示
		printBits(num << shiftNum);
		// 右にシフトした数を表記する旨を表す文章
		System.out.print("\nx >>  n = ");
		// 入力されたシフト数分値を右にシフトして、メソッドprintBitsを呼び出しビット構成を表示
		printBits(num >> shiftNum);


		// ビット構成を行った値を2のべき乗で乗算する為に改めて変数に格納する
		int multiplyValue = num;
		// シフトするビット数に指定された値分for文を回す
		for(int i = 0; i < shiftNum; i++) {
			// 乗算
			multiplyValue = multiplyValue * 2;
		}
		// 文章表示
		System.out.print("\nxの2のべき乗での乗算:");
		// べき乗で乗算した値をメソッドprintBitsを呼び出しビット構成を表示
		printBits(multiplyValue);

		// ビット構成を行った値を2のべき乗で除算する為に改めて変数に格納する
		int divideValue = num;
		// シフトするビット数に指定された値分for文を回す
		for(int i = 0; i < shiftNum; i++){
			// 除算
			divideValue = divideValue / 2;
		}
		// 文章表示
		System.out.print("\nxの2のべき乗での除算:");
		// べき乗で除算した値をメソッドprintBitsを呼び出しビット構成を表示
		printBits(divideValue);
		}
}
