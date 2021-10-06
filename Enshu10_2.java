package main;

import java.util.Scanner;

/*
 * クラス名: Enshu10_2
 * 概要	:Enshu10_1で作成したクラスIdを備考欄記載の条件を付与したExIdに書き換える
 * 作成者:S.Sugita
 * 作成日:2021.10.06
 * 備考	:ExId条件
 * 		 ・インスタンスを生成するたびに識別番号をn(正の整数)ずつ増やして与える。
 * 		 ・nの値は指定されない限り1とするが、メソッドを通して取得・変更できるようにする。
 */


class ExId {
	// 何番まで識別番号を与えたかを保持するクラス変数
	public static int counter = 0;

	// 識別番号を格納するインスタンス変数
	private static int id  = 0;
	
	// 識別番号の増加分を格納するインスタンス変数
	private static int increase = 1;
	
	// 識別番号をidに格納するコンストラクタ
	public ExId() {
		// 文章表示
		System.out.println("Idを作成します。");
		// メソッドcountPlusの呼び出し
		countPlus();
		// 増加分だけidに足す
		id = id + increase;
		// 与えた識別番号をcounterに格納する
		counter = id;
	}
	// 識別番号を取得するメソッド
	public int getId() {
		return id;
	}
	// 最後に与えた識別番号を返すクラスメソッド
	static int getMaxId() {
		return counter;
	}
	
	// 識別番号の現在の増加分を返すクラスメソッド
	static int getIncrease() {
		return increase;
	}
	
	// 識別番号の増加分を変更するクラスメソッド
	static void  countPlus() {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		// 識別番号の増加を問う文章
		System.out.println("識別番号の増加量は変更しますか？：1…Yes／0…No");
		// 入力された値を変数に格納
		int num = stdIn.nextInt();
		// 入力された値が1（Yes）の場合
		if(num == 1){
			// 増加量の入力を促す文章
			System.out.println("識別番号の増加量を正の整数で入力して下さい");
			// 入力された数値を増加分格納変数increaseへ入れる
			increase = stdIn.nextInt();
		}
	}
}
public class Enshu10_2{
	public static void main(String[] args) {
		// 識別番号1番の宣言
		ExId a = new ExId();
		// aの識別番号の表示
		System.out.println("aの識別番号：" + a.getId());
		// aの識別番号の表示
		System.out.println("a.counter = " + a.counter);
		
		// 識別番号2番の宣言
		ExId b = new ExId();
		// bの識別番号の表示
		System.out.println("bの識別番号：" + b.getId());
		// クラス変数counterにアクセスして表示
		System.out.println("ExId.counter = " + ExId.counter);
		// bの識別番号の表示
		System.out.println("b.counter = " + b.counter);
		
		// 識別番号3番の宣言
		ExId c = new ExId();
		// cの識別番号の表示
		System.out.println("cの識別番号：" + c.getId());
		// クラス変数counterにアクセスして表示
		System.out.println("ExId.counter = " + ExId.counter);
		// cの識別番号の表示
		System.out.println("c.counter = " + c.counter);
		
		// クラスメソッドgetMaxIdを呼び出し、最後の識別番号を表示
		System.out.println("最後の識別番号：" + ExId.getMaxId());
		// クラスメソッドgetIncreaseを呼び出し、識別番号の増加分を表示
		System.out.println("現在の識別番号の増加分：" + ExId.getIncrease());
	}
}