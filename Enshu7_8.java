package Chap07;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名: Enshu7_8
 * 概要	:a以上b未満の乱数を生成して、その値を返却するメソッドrandomの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:bの値がaより小さい場合は、aの値をそのまま返す。
 */

public class Enshu7_8 {

	// a以上b未満の乱数を生成して、その値を返却するメソッドrandom
	static int random(int a, int b) {

		// Randomクラスの初期化
		Random random = new Random();

		// 生成された乱数を格納して返却する変数randomNum
		int randomNum = 0;

		// bの値がa以上の場合
		if(b >= a) {
			randomNum = random.nextInt(b - a)+a;
		// bがaより小さい場合
		}else if(a > b){
			// aを返却値に格納
			randomNum = a;
		}

		// 生成された乱数を返却する
		return randomNum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 文章表示
		System.out.println("a以上b未満の乱数を生成します");
		// 条件提示の文章表示
		System.out.println("bの値がaより小さい場合、aの値を表示します。");

		// aの値の入力を促す文章
		System.out.print("aの値：");
		// 入力された値を格納する変数n
		int a = stdIn.nextInt();
		// bの値の入力を促す文章
		System.out.print("bの値：");
		// 入力された値を格納する変数n
		int b = stdIn.nextInt();

		// メソッドrandomの呼び出し、表示
		System.out.println(random(a, b));
	}
}
