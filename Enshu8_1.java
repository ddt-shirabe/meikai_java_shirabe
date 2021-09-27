package Chap08;

/*
 * クラス名: Enshu8_1
 * 概要	:名前・身長・体重をメンバとして持つ「人間クラス」の作成
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:特になし
 */

// 名前・身長・体重をメンバとして持つ「人間クラス」Human
class Human{
	// フィールド値：名前
	private String name;
	// フィールド値：身長
	private long height;
	// フィールド値：体重
	private long weight;

	// Humanコンストラクタ
	Human(String name, long height, long weight){
		// 名前フィールド
		this.name = name;
		// 身長フィールド
		this.height = height;
		// 体重フィールド
		this.weight = weight;
	}
	// 名前を取得して返すメソッド
	String getName() {
		// 名前を返す
		return name;
	}
	// 身長を取得して返すメソッド
	long getHeight() {
		// 身長を返す
		return height;
	}
	// 体重を取得して返すメソッド
	long getWeight() {
		// 体重を返す
		return weight;
	}
	// 引数を体重から引き減量するメソッド
	void weightLoss(long k) {
		// 引数分だけ体重から値を引く
		weight -= k;
	}
	// 引数を体重から足し増量するメソッド
	void weightIncrease(long k) {
		// 引数分だけ体重から値を足す
		weight += k;
	}
}

public class Enshu8_1 {
	public static void main(String[] args) {
		// Humanクラスのコンストラクタを呼び出し、huseを宣言
		Human huse = new Human("布施明", 171, 55);
		// Humanクラスのコンストラクタを呼び出し、wadaを宣言
		Human wada = new Human("和田アキ子", 174, 60);

		// huseの体重を5kg増量
		huse.weightIncrease(5);
		// wadaの体重を10kg減量
		wada.weightLoss(10);

		// 文章表示
		System.out.println("プロフィール1");
		// huseの名前を取得して表示
		System.out.println("  名前：" + huse.getName());
		// huseの身長を取得して表示
		System.out.println("  身長：" + huse.getHeight());
		// huseの体重を取得して表示
		System.out.println("  体重：" + huse.getWeight());

		// 文章表示
		System.out.println("プロフィール2");
		// wadaの名前を取得して表示
		System.out.println("  名前：" + wada.getName());
		// wadaの身長を取得して表示
		System.out.println("  身長：" + wada.getHeight());
		// wadaの体重を取得して表示
		System.out.println("  体重：" + wada.getWeight());
	}
}
