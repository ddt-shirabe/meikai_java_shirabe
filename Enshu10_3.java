package main;

import java.util.Scanner;

/*
 * クラス名: Enshu10_3
 * 概要	:二値/三値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めた
 * 		 ユーティリティクラスMinMaxの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:特になし
 */

// MinMax実行用クラスEnshu10_3
public class Enshu10_3 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		
		// 文章表示
		System.out.println("三値を比較します");
		// 一つ目の値の入力を促す文章表示
		System.out.print("1つ目の値：");
		// 入力された値を変数xに格納
		double x = stdIn.nextDouble();
		// 二つ目の値の入力を促す文章表示
		System.out.print("2つ目の値：");
		// 入力された値を変数yに格納
		double y = stdIn.nextDouble();
		// 三つ目の値の入力を促す文章表示
		System.out.print("3つ目の値：");
		// 入力された値を変数zに格納
		double z = stdIn.nextDouble();
		
		// メソッドminThreeNumを呼び出し、最小値の表示
		System.out.println("最小値は" + MinMax.minThreeNum(x, y, z) + "です。");
		// メソッドmaxThreeNumを呼び出し、最大値の表示
		System.out.println("最大値は" + MinMax.maxThreeNum(x, y, z) + "です。");
		
		// 改行
		System.out.println();
		
		
		// 文章表示
		System.out.println("二値を比較します");
		// 一つ目の値の入力を促す文章表示
		System.out.print("1つ目の値：");
		// 入力された値を変数vに格納
		double v = stdIn.nextDouble();
		// 二つ目の値の入力を促す文章表示
		System.out.print("2つ目の値：");
		// 入力された値を変数wに格納
		double w = stdIn.nextDouble();

		
		// メソッドminTwoNumを呼び出し、最小値の表示
		System.out.println("最小値は" + MinMax.minTwoNum(v, w) + "です。");
		// メソッドmaxTwoNumを呼び出し、最大値の表示
		System.out.println("最大値は" + MinMax.maxTwoNum(v, w) + "です。");
		
		// 改行
		System.out.println();
		
		
		// 文章表示
		System.out.println("配列内の要素を比較します");
		// 要素数の入力を促す文章表示
		System.out.print("配列の要素数は：");
		// 入力された要素数を変数elementに格納
		int elements = stdIn.nextInt();
		// 入力された要素数を持つ配列arrayの宣言
		double[] array = new double[elements];
		// 要素数分for文を回す
		for(int i = 0; i < elements; i++){
			// i個目の値の入力を促す文章
			System.out.print(( i + 1 ) + "つ目の値：");
			// 入力された値をi個目に格納
			array[i] = stdIn.nextDouble();
		}
		
		// メソッドをminArrayNum呼び出し、最小値の表示
		System.out.println("最小値は" + MinMax.minArrayNum(array) + "です。");
		// メソッドmaxArrayNumを呼び出し、最大値の表示
		System.out.println("最大値は" + MinMax.maxArrayNum(array) + "です。");
	}
	
}