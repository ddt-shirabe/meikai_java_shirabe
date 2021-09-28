package Chap10;

/*
 * クラス名: Enshu10_1
 * 概要	:P.340で作成した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加する。
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:特になし
 */

class Id2 {
	// 何番まで識別番号を与えたかを保持するクラス変数
	public static int counter = 0;

	// 識別番号を格納するインスタンス変数
	private int id;

	// 識別番号をidに格納するコンストラクタ
	public Id2() {
		id = ++counter;
	}
	// 識別番号を取得するメソッド
	public int getId() {
		return id;
	}
	// 最後に与えた識別番号を返すクラスメソッド
	static int getMaxId() {
		return counter;
	}

}
public class Enshu10_1{
	public static void main(String[] args) {
		// 識別番号1番の宣言
		Id2 a = new Id2();
		// 識別番号2番の宣言
		Id2 b = new Id2();

		// aの識別番号の表示
		System.out.println("aの識別番号：" + a.getId());
		// bの識別番号の表示
		System.out.println("bの識別番号：" + b.getId());
		// クラス変数counterにアクセスして表示
		System.out.println("Id2.counter = " + Id2.counter);
		// aの識別番号の表示
		System.out.println("a.counter = " + a.counter);
		// bの識別番号の表示
		System.out.println("b.counter = " + b.counter);
		// クラスメソッドgetMaxIdを呼び出し、最後の識別番号を表示
		System.out.println("最後の識別番号：" + Id2.getMaxId());
	}
}
