package Chap05;
/*
 * クラス名: Enshu5_7
 * 概要	:0.0から1.0まで0.001おきに、その値と、その値の２乗を表示するプログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu5_7 {
	public static void main(String[] args) {

		/*
		 * for文で回し、0.0から1.0まで0.001単位で増やしていく様子と、
		 * その値を2乗した数を
		 * 正規表現で整形して表示
		 */
		for(float x = 0.0f; x <= 1.0F; x += 0.001F) {
			float y = x * x;
			System.out.printf("%.7f   %.7f\n", x, y);
		}
	}
}
