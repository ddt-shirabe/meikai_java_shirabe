/*
 * クラス名:CarInfo
 * 概要	:演習12_1、総走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスの作成。
 * 作成者:S.Sugita
 * 作成日:2022.01.26
 * 備考	:Car2クラスを継承
 */

package chap12;

import main.Day;

public class CarInfo extends Car2 {
	
	// 走行距離
	private double mileage = 0;
	
	// 走行距離を調べるメソッド
	public double mileage(double dx, double dy){
		// 継承したCar2クラスのmoveメソッドを呼びだし、trueであった(燃料が足り、移動できた)場合
		if(super.move(dx ,dy)){
			// 移動距離を計算
			double dist = Math.sqrt(dx * dx + dy * dy);
			mileage += dist;
		// 移動できない場合
		}else{
			mileage = 0;
			System.out.println("燃料不足のため、移動できません。");
		}
		// 走行距離を返却
		return mileage;
	}
	
	// TODO 自動生成されたコンストラクター・スタブ
	public CarInfo(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		this.mileage = mileage;
	}
	
	void setMileage (double mileage) {
		this.mileage = mileage;
	}
}
