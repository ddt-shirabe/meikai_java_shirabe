package Chap09_3;

/*
 * クラス名: Enshu9_4
 * 概要	:演習8-1で作成した人間クラスに誕生日のフィールドとtoStringメソッドを追加
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:toStringメソッドでプロフィールを表示する
 */


public class Enshu9_4 {
	public static void main(String[] args) {
		// Humanクラスのコンストラクタを呼び出し、huseを宣言
		Human huse = new Human("布施明", 171, 55, new Day(1947, 12, 18));
		// Humanクラスのコンストラクタを呼び出し、wadaを宣言
		Human wada = new Human("和田アキ子", 174, 60, new Day(1950, 4, 10));

		// huseの体重を5kg増量
		huse.weightIncrease(5);
		// wadaの体重を10kg減量
		wada.weightLoss(10);

		// 文章表示
		System.out.println("プロフィール1");
		// toStringメソッドを呼び出し、huseのプロフィールを表示
		 System.out.print(huse.toString());

		// 文章表示
		System.out.println("プロフィール2");
		// toStringメソッドを呼び出し、wadaのプロフィールを表示
		 System.out.print(wada.toString());
	}
}
