package Chap06;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名:Enshu6_15
 * 概要	:曜日を表示して、その英語表現を入力させる英単語学習プログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.15
 * 備考	:出題する曜日は乱数で生成
 * 		 学習者が望む限り何度でも繰り返せる、
 * 		 同一の曜日は連続して出さない。
 */

public class Enshu6_15 {

	// 一週間の日数を表す定数を宣言
	final int DAY_WEEK = 7;

	// 0の初期値を使用できない(初期値を0とすると1周目に日曜日が表示されない不具合が発生)場合、下記の定数を使用
	final static int NINETY_NINE = 99;

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// Randomクラスの宣言
		Random rand = new Random();

		// 英語の小文字入力という条件を提示する文章
		System.out.println("英語の曜日名を小文字で入力して下さい。");

		// 英語の曜日を格納する配列
		String[] englishWeekString = {
				"sunday","monday","tuesday","wednesday","thursday","friday","saturday"
				};

		// 日本語の曜日を格納する配列
		String[] japaneseWeekString = {
				"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"
				};

		/* 2周目以降の際に、生成された乱数が前回と同じ数か否かを判定する用の変数
		 * 初期値を0とすると1周目に日曜日が表示されない不具合が発生するため、定数NINETY_NINEを置く。
		 */
		int prevDayWeekNumber = NINETY_NINE;

		// 一週間の日数を表す定数を宣言
		final int DAY_WEEK = 7;

		// 曜日を呼び出す際に使用する値を格納する変数
		int dayWeekNumber = 0;

		// 入力された文字列を格納する変数
		String englishWeek;

		// 入力された文字列が問題の回答と一致したかの判定結果を格納する変数
		boolean judge = true;

		// もう一度行うかを判定する値を格納する変数
		boolean retry = true;


		// 乱数によって曜日を呼び出し、入力された英語の曜日と比較する。
		do {
			// 前周と同じ乱数が生成された場合、再度乱数を生成する
			do {
				// 0～6の乱数を格納
				dayWeekNumber = rand.nextInt(DAY_WEEK);
			// false(前周文と違う値が生成された)の場合、値生成ループから抜ける
			}while(dayWeekNumber == prevDayWeekNumber);

			// 正解が入力されるまで繰り返す
			do {
				// 問題となる曜日の提示
				System.out.println(japaneseWeekString[dayWeekNumber] + ":");
				// 入力値を格納
				englishWeek = stdIn.next();

				// 入力結果と問題の回答が一致するかの判定結果を格納
				judge = englishWeek.equals(englishWeekString[dayWeekNumber]);

				// 回答と一致した場合
				if(judge) {
					// 正解である旨を表示
					System.out.println("正解です。");
					// 問題を繰り返す場合、前回と同じ問題を出題しないよう、今周分の乱数を格納
					prevDayWeekNumber = dayWeekNumber;
				// 回答と一致しない場合
				}else{
					// 誤答である旨を表示
					System.out.println("違います。");
				}
			// 誤答の場合、入力まで戻る
			}while(!judge);

			// もう一度行うかを問う文章
			System.out.print("もう一度？ 1…Yes／0…No：");
			// 入力値が1の場合true、0の場合false
			if(!(stdIn.nextInt() == 1)) {
				// 1ではない場合、falseを代入
				retry = false;
			}
		// 入力値が1(true)の場合、問題を繰り返す
		}while(retry);
	}

}
