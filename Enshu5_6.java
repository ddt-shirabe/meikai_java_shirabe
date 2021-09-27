package Chap05;
/*
 * クラス名: Enshu5_6
 * 概要	:float型の変数を0.0から1.0まで0.001単位で増やしていく様子と、int型の変数を1000で割った数をを表示
 * 作成者:S.Sugita
 * 作成日:2021.09.14
 * 備考	:特になし
 */

public class Enshu5_6 {
	public static void main(String[] args) {

		// 上部を表示
		System.out.println("   float       int");
		System.out.println("----------------------");

		/*
		 * for文で回し、float型の変数を0.0から1.0まで0.001単位で増やしていく様子と、
		 * int型の変数を1000で割った数をを
		 * 正規表現で整形して表示
		 */
		for(float x = 0.0f, y = 0.0f; x <= 1.0F; x += 0.001F, y++) {
			float ans = (float) y /1000;
			System.out.printf("%.7f   %.7f\n", x, ans);
		}
	}
}
