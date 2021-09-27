package Chap07;
/*
 * クラス名: Enshu7_1
 * 概要	:受け取ったint型引数の値nが正か負かを判定するメソッドsignOfの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:負の数の場合は-1、0であれば0、正であれば1を返す
 */

import java.util.Scanner;

public class Enshu7_1 {

	// 受け取ったint型引数の値nが正か負かを判定するメソッドsignOfの作成
	static int signOf(int n) {
		// 返却値を格納する変数numの宣言、nの代入
		int num = 0;

		// nが負の数の場合
		if(n < 0) {
			//返却値に指定の-1を代入
			num = -1;
		// nが0の場合
		}else if(n == 0) {
			// 返却値に指定の0を代入(本来は不要だが、今回は指定がある為記載)
			num = 0;
		// nが正の数の場合
		}else if(n > 0) {
			// 返却値に指定の1を代入
			num = 1;
		}
		// numを返却
		return num;
	}

	// 上記メソッドsignOfを実際に作動させる
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 整数nの入力を促す文章
		System.out.print("整数n:");
		// 入力された値をint型の変数nに代入する
		int n = stdIn.nextInt();

		// メソッドsignOfを呼び出し、返り値表示
		System.out.println("返り値は" + signOf(n) + "です。");
	}
}
