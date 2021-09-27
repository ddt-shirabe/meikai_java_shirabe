package Chap09_3;
/*
 * クラス名: Enshu9_5
 * 概要	:開始日と終了日とから構成される「期間」を表すクラスPeriodの作成
 * 作成者:S.Sugita
 * 作成日:2021.09.27
 * 備考	:フィールドは指定あり、コンストラクタやメソッドは自由に定義する。
 */

class Period{
	// フィールド値：開始日
	private Day from;
	// フィールド値：終了日
	private Day to;
	// Periodコンストラクタ
	public Period(Day from, Day to) {
		// 開始日フィールド
		this.from = new Day(from);
		// 終了日フィールド
		this.to = new Day(to);
	}

	// 開始日を取得して返すメソッド
	public Day getFrom() {
		return new Day(from);
	}
	// 終了日を取得して返すメソッド
	public Day getTo() {
		return new Day(to);
	}

	// 文字列表現を返却するメソッド
	public String toString() {
		// 開始日と終了日を返却する
		return String.format("開始日：%s\n終了日：%s\n", new Day(from),new Day(to));
	}
}

public class Enshu9_5 {
	public static void main(String[] args) {
		// Dayクラスのコンストラクタを呼び出し、fromを宣言
		Day from = new Day(2001,9,9);
		// Dayクラスのコンストラクタを呼び出し、toを宣言
		Day to = new Day(2008,10,30);
		// Periodクラスのコンストラクタを呼び出し、periodを宣言
		Period period = new Period(from, to);
		// toStringメソッドを呼び出し、日付を表示
		System.out.print(period.toString());
	}
}
