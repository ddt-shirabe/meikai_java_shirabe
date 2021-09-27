package Chap06;

/*
 * クラス名: Enshu6_17
 * 概要	:6人の二科目(国語・数学)の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.15
 * 備考	:特になし
 */

public class Enshu6_17 {

	// 生徒の数を格納する変数(今回は決まっている為定数とする)
	final static int STUDENT_NUM = 6;
	// 教科の数を格納する変数(今回は決まっている為定数とする)
	final static int SUBJECT_NUM = 2;

	public static void main(String[] args) {
		// 点数を格納する2次元配列
		int[][] score = { {69,18}, {46,49}, {11,40}, {77, 77}, {59,45},{90,99} };
		// 平均を求めるための合計値を格納する変数
		int sum = 0;
		// 国語の平均を求めるための合計値を格納する変数
		int japaneseSum = 0;
		// 数学平均を求めるための合計値を格納する変数
		int mathSum = 0;

		// 学生人数分配列を回す
		for (int i = 0; i < STUDENT_NUM; i++) {
			// 教科数分配列から値を取り出す
			for (int j = 0; j < SUBJECT_NUM; j++) {
				// 指定された行列の点数を合計値の変数へ格納
				sum += score[i][j];
			}
			// 合計値を教科数で割って平均点を表示
			System.out.println((i + 1) + "人目の平均点は" + sum / SUBJECT_NUM + "です。");
			// 表示後、合計値の変数を初期化
			sum =0;
		}

		// 学生数分配列を回す
		for (int i = 0; i < STUDENT_NUM; i++) {
			japaneseSum += score[i][0];
			mathSum += score[i][1];
			}
		// 国語の合計値を学生人数分で割って平均点を表示
		System.out.println("国語の平均点は" + japaneseSum / STUDENT_NUM + "です。");
		// 数学の合計値を学生人数分で割って平均点を表示
		System.out.println("数学の平均点は" + mathSum / STUDENT_NUM + "です。");
	}

}
