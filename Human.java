package Chap09_3;


// 名前・身長・体重をメンバとして持つ「人間クラス」Human
public class Human{
	// フィールド値：名前
	private String name;
	// フィールド値：身長
	private long height;
	// フィールド値：体重
	private long weight;
	// フィールド値：誕生日
	private Day birthday;

	// Humanコンストラクタ
	public Human(String name, long height, long weight, Day birthday){
		// 名前フィールド
		this.name = name;
		// 身長フィールド
		this.height = height;
		// 体重フィールド
		this.weight = weight;
		// 誕生日フィールド
		this.birthday = new Day(birthday);
	}
	// 名前を取得して返すメソッド
	public String getName() {
		// 名前を返す
		return name;
	}
	// 身長を取得して返すメソッド
	public long getHeight() {
		// 身長を返す
		return height;
	}
	// 体重を取得して返すメソッド
	public long getWeight() {
		// 体重を返す
		return weight;
	}
	// 誕生日を取得して返すメソッド
	public Day getBirthday() {
		// 誕生日を返す
		return new Day(birthday);
	}

	// 引数を体重から引き減量するメソッド
	public void weightLoss(long k) {
		// 引数分だけ体重から値を引く
		weight -= k;
	}
	// 引数を体重から足し増量するメソッド
	public void weightIncrease(long k) {
		// 引数分だけ体重から値を足す
		weight += k;
	}

	// 文字列表現を返却するメソッド
	public String toString() {
		// 名前・身長・体重・誕生日を返却する
		return String.format("名前：%s\n身長：%d\n体重：%d\n誕生日：%s\n", name, height, weight, birthday);
	}
}
