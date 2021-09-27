package Chap08;

/*
 * クラス名: Enshu8_2
 * 概要	:P.290 自動車クラスCarに対して自由にフィールドやメソッドを追加する
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:特になし
 */

import java.util.Scanner;

// 「自動車クラス」Car2
class Car2 {
	// フィールド値：車名
	private String name;
	// フィールド値：車幅
	private int width;
	// フィールド値：車高
	private int height;
	// フィールド値：車長
	private int length;
	// フィールド値：現在位置x座標
	private double x;
	// フィールド値：現在位置y座標
	private double y;
	// フィールド値：残燃料
	private double fuel;
	// フィールド値：タンク容量
	private double tankCapacity;
	// フィールド値：ナンバー
	private String carNumber;
	// フィールド値：燃費
	private double fuelEconomy;

	// Carコンストラクタ
	Car2(String name, int width, int height, int length, double fuel, double tankCapacity, String carNumber){
		// 車名フィールド
		this.name = name;
		// 車幅フィールド
		this.width = width;
		// 車高フィールド
		this.height = height;
		// 車長フィールド
		this.length = length;
		// 残燃料フィールド
		this.fuel = fuel;
		// タンク容量フィールド
		this.tankCapacity = tankCapacity;
		// ナンバーフィールド
		this.carNumber = carNumber;
	}

	// 現在位置x座標を取得して返すメソッド
	double getX() {
		// x座標を返す
		return x;
	}

	// 現在位置y座標を取得して返すメソッド
	double getY() {
		// y座標を返す
		return y;
	}

	// 残燃料を取得して返すメソッド
	double getFuel() {
		// 残燃料を返す
		return fuel;
	}

	// 燃費を取得して返すメソッド
	double getFuelEconomy() {
		// 残燃料を返す
		return fuelEconomy;
	}

	// 給油された量を取得して残燃料に反映するメソッド
	boolean refueling(double refuelingAmount) {
		// 残燃料と給油された量の和を求める
		double sumFuel = fuel + refuelingAmount;

		// 燃料の和がタンク容量を超えた場合
		if(sumFuel > tankCapacity) {
			// 超えている旨を文章表示、残燃料に加算しない。
			System.out.println("タンク容量を超えています。正しい給油量ではありません");
			return false;
		// タンク容量を超えなかった場合
		}else {
			// 給油量を残燃料に加算する
			fuel += refuelingAmount;
			return true;
		}
	}

	// スペックを表示するメソッド
	void putSpec() {
		// 車名の表示
		System.out.println("車名：" + name);
		// 車幅の表示
		System.out.println("車幅：" + width + "mm");
		// 車高の表示
		System.out.println("車高：" + height + "mm");
		// 車長の表示
		System.out.println("車長：" + length + "mm");
	}

	// 燃費を計算するメソッド、引数は走行距離mileageと給油量refuelingAmount
	void calcFuelEconomy(double mileage, double refuelingAmount) {
		fuelEconomy = mileage / refuelingAmount;
	}

	// X方向にdx・Y方向にdy、残燃料を見て移動可能か判定するメソッド
	boolean move(double dx, double dy, double refuelingAmount) {
		// 移動距離から消費する燃料を格納する変数の宣言、移動距離の計算
		double dist = Math.sqrt(dx * dx + dy * dy);

		// 残燃料と比較し燃料不足の場合
		if(dist > fuel) {
			// falseを返す
			return false;
		// 燃料が足りた場合
		}else {
			// 走行距離から燃費を計算するメソッドcalcFuelEconomyを呼び出す
			calcFuelEconomy(dist, refuelingAmount);
			// 残燃料から消費燃料を引く
			fuel -= dist;
			// x座標を更新
			x += dx;
			// y座標を更新
			y += dy;
			// trueを返す
			return true;
		}
	}
}

// 今回追加したメソッドを呼び出す
public class Enshu8_2 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// Car2インスタンス宣言
		Car2 alphard = new Car2("アルファード", 1850, 1950, 4950, 60, 75, "123-456");


		// 給油した量の入力を促す文章
		System.out.print("給油した量を入力して下さい。：");
		// 入力された給油量を格納する変数の宣言、格納
		double refuelingAmount = stdIn.nextInt();
		// 給油を反映する為にメソッドrefuelingを呼びだして、正しい給油量が入力された場合
		if(alphard.refueling(refuelingAmount)) {
			// 残燃料を表示
			System.out.println("残燃料は" + alphard.getFuel() + "です。");

			// 文章表示
			System.out.println("移動距離を入力して下さい。");
			// x方向への移動距離の入力を促す文章
			System.out.print("X方向の移動距離：");
			// 入力された給油量を格納する変数の宣言、格納
			double x = stdIn.nextInt();
			// x方向への移動距離の入力を促す文章
			System.out.print("y方向の移動距離：");
			// y方向への移動距離の入力を促す文章
			double y = stdIn.nextInt();

			// メソッドmoveの呼び出し、移動の可否を判定。移動可能な場合移動距離と燃料を反映する。
			if(!alphard.move(x, y, refuelingAmount)) {
				System.out.println("燃料が足りません！");
			}
			// 現在地、残燃料、燃費を表示
			System.out.println("現在地(" + alphard.getX() + "," + alphard.getY() + ")・残り燃料" + alphard.getFuel()+ "・燃費" + alphard.getFuelEconomy());
		// 給油量が正しくない場合、終了とする。
		}else {
			System.out.println("本機能を終了します。");
		}

	}
}
