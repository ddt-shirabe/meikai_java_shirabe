/*
 * クラス名: Enshu12_1_Test
 * 概要	:CarInfoのテストクラス
 * 作成者:S.Sugita
 * 作成日:2022.01.26
 * 備考	:特になし
 */

package chap12;
import java.util.Scanner;

import main.Day;

public class Enshu12_1_Test {
	public static void main(String[] args) {
		// 入力可能にする
		Scanner stdIn = new Scanner(System.in);
		// 車インスタンスを宣言（初期状態）
		CarInfo car = new CarInfo("車", 1500, 1000, 4500, 100.0 ,new Day(1990,1,1));

		// 説明文
		System.out.println("好きな車を選んで下さい。(半角数字で入力)");
		// 選択肢
		System.out.println("1：日産セレナ 2：豊田アルファード");
		// 入力値を格納
		int carNum = stdIn.nextInt();
		// セレナが選ばれた場合
		if(carNum == 1){
			car = new CarInfo("セレナ", 1500, 1000, 4500, 2000 ,new Day(2022,1,26));
			// アルファードが選ばれた場合
		}else if(carNum == 2){
			car = new CarInfo("アルファード", 1500, 1000, 4500, 2000 ,new Day(2021,1,26));
			// 1と2以外が入力された場合
		}else{
			// 正しい入力値を促す
			System.out.println("正しい数値を入力してください。");
			// ここでcarNumの入力に戻らせる。（while文？）
		}

		// 燃料がある場合は走行を続けるか問い、続けない場合はループから抜ける。
		// 燃料が尽きた場合は移動できませんというログを出す。
		while(true){
			// 説明文
			System.out.println("走行する距離を入力して下さい。");
			// 説明文
			System.out.println("x方向へ(半角数字で入力)");
			// 入力された値を格納
			double dx = stdIn.nextDouble();
			// 説明文
			System.out.println("y方向へ(半角数字で入力)");
			// 入力された値を格納
			double dy = stdIn.nextDouble();
			// 走行距離を算出
			System.out.println("走行距離を算出します(km)");
			// 走行距離を調べるメソッドの呼び出し
			double mileage = car.mileage(dx,dy);
			System.out.println(mileage + "km");

			// 燃料が尽きた時
			if (mileage == 0){
				// 走行を止める
				break;
			}else if(mileage > 0){
				// 走行を続けるか問う
				System.out.println("走行を続けますか？/ Yes…1、No…0");
				// 入力された数値が0（No）の場合
				if (stdIn.nextInt() == 0){
					// ループから抜ける
					break;
				}
			}
		}
		System.out.println("走行を終了します。");
	}
}
