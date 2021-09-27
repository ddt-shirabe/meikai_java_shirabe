package Chap03;
/*
 * クラス名: Enshu3_18
 * 概要	:月を1～12の整数値として読み込み、対応する季節を表示
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Scanner;

public class Enshu3_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);								// 標準入力ストリーム

		System.out.print("月を入力してください(1～12)：");						// 値の入力を促す
		int month = stdIn.nextInt();											// monthに実数値を読み込む
		int num = 0;															// switch文の評価に使用する変数numの宣言

		if(month == 12 || month == 1 || month == 2) {							// 12月、1月、2月の場合
			num = 1;															// numに1を格納する
		}else if(month == 3 || month == 4 || month == 5){						// 3～5月の場合
			num = 2;															// numに2を格納する
		}else if(month == 6 || month == 7 || month == 8){						// 6～8月の場合
			num = 3;															// numに3を格納する
		}else if(month == 9 || month == 10 || month == 11){						// 9～11月の場合
			num = 4;															// numに4を格納する
		}else {																	// 月に不適合な数値の場合
			System.out.print("正しい月を入力してください。");					// 文章表示
		}

		switch(num) {															// case文による実数値の判定
		case 1:System.out.print("冬");											// 1(12月、1月、2月)の場合、冬を表示
				break;
		case 2: System.out.print("春");											// 2(3～5月)の場合、春を表示
				break;
		case 3: System.out.print("夏");											// 3(6～8月)の場合、夏を表示
				break;
		case 4:	System.out.print("秋");											// 4(9～11月)の場合、秋を表示
				break;
		}
	}

}
