package Chap10;
/*
 * クラス名: Enshu10_5
 * 概要	:銀行クラスAccountを変更し、
 * 		 インスタンスが生成される度に「明解銀行での口座開設ありがとうございます。」と表示するようにする。
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:指定の文章表示はインスタンス初期化子で行う事。
 */

class Account2 {
	// 何番まで識別番号を与えたかを保持するクラス変数
	private static int counter = 0;

	// 口座名義を保持するクラス変数
	private String name;
	// 口座番号を保持するクラス変数
	private String no;
	// 預金残高を保持するクラス変数
	private long balance;
	// 識別番号を保持するクラス変数
	private int id;

	// インスタンス初期化子による指定文章表示
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	// Account2コンストラクタ
	public Account2(String name, String no, long balance){
		// 名前フィールド
		this.name = name;
		// 口座番号フィールド
		this.no = no;
		// 預金残高フィールド
		this.balance = balance;
		// 識別番号フィールド
		id = ++counter;
	}

	// 口座名義を取得して返すメソッド
	public String getName() {
		return name;
	}

	// 口座番号を取得して返すメソッド
	public String getNo() {
		return no;
	}
	// 預金残高を取得して返すメソッド
	public long getBalance() {
		return balance;
	}
	// 識別番号を取得して返すメソッド
	public int getId() {
		return id;
	}

	// 預金残高から引数kを引いて返すメソッド
	public void deposit(long k) {
		balance += k;
	}
	// 預金残高から引数kを足して返すメソッド
	public void withdraw(long k) {
		balance -= k;
	}
	// 文字列表現を返却するメソッド
	public String toString() {
		// 口座名義・口座番号・預金残高・識別番号を返却する
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n識別番号：%d\n", name, no, balance, id);
	}
}

public class Enshu10_5 {
	public static void main(String[] args) {
		// Account2型のインスタンス初期化
		Account2 adachi = new Account2("足立幸一", "123456", 1000);
		// メソッドwithdrawを呼び出し、adachiの預金残高から200マイナスする
		adachi.withdraw(200);

		// 文章表示
		System.out.println("■足立君の口座");
		// 文字列表現
		System.out.print(adachi.toString());

	}
}
