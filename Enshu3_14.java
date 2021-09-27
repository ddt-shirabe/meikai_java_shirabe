package Chap03;
/*
 * クラス名: Enshu3_14
 * 概要	:入力された二つの整数値の最小値と最大値を求めて表示する
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */
import java.util.Scanner;
public class Enshu3_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);					// 標準入力ストリーム

		System.out.print("整数a：");								// aの値の入力を促す
		int a = stdIn.nextInt();									// aに実数値を読み込む

		System.out.print("整数b：");								// bの値の入力を促す
		int b = stdIn.nextInt();									// bに実数値を読み込む

		if(a == b) {													// aがbより小さい場合
			System.out.println("二つの値は同じです。");					// 文章表示
		}else {
			int min = 0;													// 最小値を格納する変数の宣言
			int max = 0;													// 最大値を格納する変数の宣言
				if(a < b) {													// aがbより小さい場合
					min = a;												// aが最小値
					max = b;												// bが最大値
				}else if (a > b) {											// bがaより小さい場合
					min = b;												// bが最小値
					max = a;												// aが最大値
				}
			System.out.println("小さいほうの値は" + min + "です。");	// 最小値の表示
			System.out.println("大きいほうの値は" + max + "です。");	// 最大値の表示
		}
	}
}