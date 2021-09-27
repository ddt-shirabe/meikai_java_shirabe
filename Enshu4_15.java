package Chap04;
/*
 * クラス名: Enshu4_15
 * 概要	:身長と標準体重の対応表を表示するプログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:標準体重は(身長-100)×0.9によって求められる為、100cm以上の身長入力とする。
 */

import java.util.Scanner;

public class Enshu4_15 {

	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		//開始値、終了値、増分の変数宣言
		int start;
		int end;
		int difference;

		// 100cm以下の身長、もしくは1未満の増分が入力された場合、再入力を促す
		do {
			//開始する身長を格納
			System.out.print("何cmから：");
			start = stdIn.nextInt();

			//終了する身長を格納
			System.out.print("何cmまで：");
			end = stdIn.nextInt();

			//増分を格納
			System.out.print("何cmごと：");
			difference = stdIn.nextInt();

		}while(start <= 100 || end <= 100 || difference <= 0);

		// 表題表示
		System.out.println("身長 標準体重");

		// 標準体重「(身長-100)×0.9」を増分をカウントとしてそれぞれ求める
		for(int i = start; i <= end; i += difference ) {
			System.out.println(i + " " + (i-100)*0.9 );
		}
	}

}
