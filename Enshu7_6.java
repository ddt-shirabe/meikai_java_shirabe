package Chap07;
/*
 * クラス名: Enshu7_6
 * 概要	:引数mで指定された月の季節を表示するメソッドprintSeasonの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.21
 * 備考	:mが3,4,5の場合は「春」、6,7,8の場合は「夏」、9,10,11の場合は「秋」、12,1,2の場合は「冬」
 * 		 それ以外の数字の場合は何も表示しない
 */

import java.util.Scanner;

public class Enshu7_6 {
	// 引数mで指定された月の季節を表示するメソッドprintSeason
	static void printSeason(int m) {
		// 3,4,5いずれかの場合
		if(m == 3 || m == 4 || m == 5) {
			// 季節が「春」であることを表示
			System.out.println("春");
		// 6,7,8いずれかの場合
		}else if(m == 6 || m == 7 || m == 8) {
			// 季節が「夏」であることを表示
			System.out.println("夏");
		// 9,10,11いずれかの場合
		}else if(m == 9 || m == 10 || m == 11) {
			// 季節が「秋」であることを表示
			System.out.println("秋");
		// 12,1,2いずれかの場合
		}else if(m == 12 || m == 1 || m == 2) {
			// 季節が「冬」であることを表示
			System.out.println("冬");
		// 1～12以外の数字が表示された場合
		}else {
			// 何も表示しない
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 文章表示
		System.out.println("季節を表示します。");
		// 条件提示の文章表示
		System.out.println("1～12以外の数字が入力された場合、何も表示しません。");
		// 月の入力を促す文章
		System.out.print("月は：");
		// 入力された値を格納する変数n
		int month = stdIn.nextInt();
		// メソッドprintSeasonの呼び出し
		printSeason(month);
	}
}
