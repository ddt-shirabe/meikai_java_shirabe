package Chap09_3;
/*
 * クラス名: Enshu9_3
 * 概要	:銀行クラスAccountに口座開設日フィールドとtoStringメソッドを追加する
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:特になし
 */

class Account {
	// 何番まで識別番号を与えたかを保持するクラス変数
	private static int counter = 0;

	// 口座名義を保持するクラス変数
	private String name;
	// 口座番号を保持するクラス変数
	private String no;
	// 預金残高を保持するクラス変数
	private long balance;
	// 預金残高を保持するクラス変数
	private Day openingDate;
	// 識別番号を保持するクラス変数
	private int id;

	// Accountコンストラクタ
	public Account(String name, String no, long balance, Day openingDate){
		// 名前フィールド
		this.name = name;
		// 口座番号フィールド
		this.no = no;
		// 預金残高フィールド
		this.balance = balance;
		// 口座開設日フィールド
		this.openingDate = new Day(openingDate);
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
	// 口座開設日を取得して返すメソッド
	public Day getOpeningDate() {
		return new Day (openingDate);
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
		// 口座名義・口座番号・預金残高・口座開設日・識別番号を返却する
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n識別番号：%d\n開設日：%s\n", name, no, balance, id, openingDate);
	}
}

public class Enshu9_3 {
	public static void main(String[] args) {
		// Account型のインスタンス初期化
		Account adachi = new Account("足立幸一", "123456", 1000,new Day(2021,9,27));
		// メソッドwithdrawを呼び出し、adachiの預金残高から200マイナスする
		adachi.withdraw(200);

		// 文章表示
		System.out.println("■足立君の口座");
		// 文字列表現
		System.out.print(adachi.toString());

	}
}
