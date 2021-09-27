package Chap03;
/*
 * クラス名: Enshu3_17
 * 概要	:乱数を生成してジャンケンをする
 * 作成者:S.Sugita
 * 作成日:2021.09.09
 * 備考	:特になし
 */

import java.util.Random;

public class Enshu3_17 {
	public static void main(String[] args) {
		Random rand = new Random();										// Randomクラスのインスタンスを初期化
		int janken = rand.nextInt(3);									// 0～2の乱数をjankenに格納

		System.out.println("じゃんけん…");								// 文章表示

		switch(janken) {												// case文による実数値jankenの判定
		case 0: System.out.println("グー");								// 0の場合、グーを出す
				break;
		case 1: System.out.println("チョキ");							// 1の場合、チョキを出す
				break;
		case 2: System.out.println("パー");								// 2の場合、パーを出す
				break;
		}
	}
}
