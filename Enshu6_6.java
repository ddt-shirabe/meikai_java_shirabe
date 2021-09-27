package Chap06;

import java.util.Scanner;

/*
 * クラス名: Enshu6_6
 * 概要	:人数と点数を読み込んで最高点・最低点・合計点・平均点を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */


public class Enshu6_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 人数を入力し、テストの点数を格納する配列を宣言する
		System.out.println("人数を入力してください：");
		int persons = stdIn.nextInt();
		int[] test = new int[persons];

		System.out.println("一人ずつ点数を入力してください。");
		for (int i = 0; i < persons; i++) {
			System.out.print((i + 1) + "番の点数：");
			test[i] = stdIn.nextInt();
		}

		// 配列を回して合計値を出す。さらに数値を比較し、最高点と最低点を出す
		int max = test[0];
		int min = test[0];
		int sum = test[0];
		for(int i = 1; i < test.length; i++) {
			sum += test[i];
			if(test[i] > max) {
				max = test[i];
			}
			if(test[i] < min) {
				min = test[i];
			}
		}

		// 最高点、最低点、合計点、平均点を表示する
		System.out.println("最高点は" + max + "です。");
		System.out.println("最低点は" + min + "です。");
		System.out.println("合計点は" + sum + "です。");
		System.out.println("平均点は" + sum / persons + "です。");
	}

}
