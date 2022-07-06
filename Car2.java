/*
 * クラス名: Car2
 * 概要	:自動車クラス
 * 作成者:S.Sugita
 * 作成日:2022.01.26
 * 備考	:P324に記載。演習12_1で使用。
 */


package chap12;

import main.Day;

public class Car2 {
	// 名前
	private String name;
	// 幅
	private int width;
	// 高さ
	private int height;
	// 長さ
	private int length;
	// 現在位置x座標
	private double x;
	// 現在位置y座標
	private double y;
	// 残り燃料
	private double fuel;
	// 購入日
	private Day purchaseDay;
	
	// コンストラクタ
	public Car2(String name, int width, int height, int length, double fuel,Day purchaseDay ){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	// 現在位置X座標を取得
	public double getX(){
		return x;
	}
	
	// 現在位置Y座標を取得
	public double getY(){
		return y;
	}
	
	// 残り燃料を取得
	public double getFuel(){
		return fuel;
	}
	
	// 購入日を取得
	public Day getPurchaseDay(){
		return new Day(purchaseDay);
	}
	
	// スペックを表示
	public void putSpec(){
		System.out.println("名前：" + name );
		System.out.println("車幅：" + name + "mm");
		System.out.println("車高：" + name + "mm");
		System.out.println("車長：" + name + "mm");
	}
	
	// X方向にdx、Y方向にdy移動
	public boolean move(double dx, double dy){
		// 移動距離を計算
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 移動できない場合…燃料不足
		if (dist > fuel){
			return false;
		// 移動可能の場合
		}else{
			// 残燃料から走行距離で使用した燃料を引く
			fuel -= dist;
			// x座標を移動した分プラスする。
			x += dx;
			// y座標を移動した分プラスする。
			y += dy;
			return true;
		}
		
	}

}
