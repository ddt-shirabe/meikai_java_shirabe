package Chap09_3;
/*
 * クラス名: Enshu9_2
 * 概要	:日付クラス第三版(p.322)を利用するプログラムの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:iすべてのコンストラクタの働きを確認できるようにする。
 */

import java.util.Scanner;

public class Enshu9_2 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// day1の入力を促す文章
		System.out.println("day1を入力せよ。");
		// day1の年の入力を促す文章
		System.out.print("年：");
		// 入力されたday1の年を変数yに格納する
		int y = stdIn.nextInt();
		// day1の月の入力を促す文章
		System.out.print("月：");
		// 入力されたday1の月を変数mに格納する
		int m = stdIn.nextInt();
		// day1の日の入力を促す文章
		System.out.print("日：");
		// 入力されたday1の日を変数dに格納する
		int d = stdIn.nextInt();

		// day1の宣言
		Day day1 = new Day(y, m, d);
		// day1の表示
		System.out.println("day1 = " + day1);

		// day2の宣言、Day型インスタンスday1をそのまま渡す
		Day day2 = new Day(day1);
		// 文章表示
		System.out.println("day2をday1と同じ日付として作りました。");
		// day2の表示
		System.out.println("day2 = " + day2);

		// equalToメソッドを呼び出し、day1とday2の等価の判定を行う
		if(day1.equalTo(day2)) {
			// 等しい場合の文章表示
			System.out.println("day1とday2は等しいです。");
		// 等しくない場合
		}else {
			// 等しくない場合の文章表示
			System.out.println("day1とday2は等しくありません。");
		}

		// Day型インスタンスd1の宣言
		Day d1 = new Day();
		// Day型インスタンスd2の宣言
		Day d2 = new Day(2010);
		// Day型インスタンスd3の宣言
		Day d3 = new Day(2010, 10);
		// Day型インスタンスd4の宣言
		Day d4 = new Day(2010, 10, 15);

		// d1の表示
		System.out.println("d1 = " + d1);
		// d2の表示
		System.out.println("d2 = " + d2);
		// d3の表示
		System.out.println("d3 = " + d3);
		// d4の表示
		System.out.println("d4 = " + d4);

		// 配列の要素数を入力を促す文章
		System.out.print("配列の要素数を入力：");
		// 入力された要素数をelementsに格納する
		int elements = stdIn.nextInt();
		//入力された要素数分のDay型配列aの宣言
		Day[] a = new Day[elements];
		// 年を格納する変数yearの宣言
		int year;
		// 月を格納する変数monthの宣言
		int month;
		// 日を格納する変数dayの宣言
		int day;

		// aの長さ分for文を回す
		for(int i = 0; i < elements; i++) {
			// 年月日入力を促す文章
			System.out.println("年月日を入力して下さい。");
			// 年の入力を促す文章
			System.out.print("年：");
			// 入力された年を変数yearに格納する
			year = stdIn.nextInt();
			// 月の入力を促す文章
			System.out.print("月：");
			// 入力された月を変数monthに格納する
			month = stdIn.nextInt();
			// 日の入力を促す文章
			System.out.print("日：");
			// 入力された日を変数dayに格納する
			day = stdIn.nextInt();
			// i個目の要素としてDay型のインスタンスを宣言
			a[i] = new Day(year,month,day);
		}

		// aの長さ分for文を回す
		for (int i = 0; i < elements; i++) {
			// 配列aのi個目の要素を表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
