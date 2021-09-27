package Chap09_3;
import java.util.Scanner;
/*
 * クラス名: Enshu9_1
 * 概要	:演習8-1で作成した人間クラスの配列を生成するプログラム
 * 作成者:S.Sugita
 * 作成日:2021.09.22
 * 備考	:配列生成時に要素を初期化するパターン、配列生成後に要素を代入する。
 * 		 演習9-4にて誕生日フィールドを追加したため、誕生日も合わせて表示する。
 */

public class Enshu9_1 {
	public static void main(String[] args) {
		// 標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);

		// 配列生成時に要素を初期化するパターン
		// Human型の配列を生成
		Human[] humanArray = {
				// Human型1人目の要素
				new Human("川崎修平", 175, 65, new Day(2001,4,28)),
				// Human型2人目の要素
				new Human("久保建英", 180, 75, new Day(2001,6,4)),
				// Human型3人目の要素
				new Human("鈴木武蔵", 181, 73, new Day(1994,2,11)),
				};

		// 配列の長さ分だけfor文を回す
		for(int i = 0; i < humanArray.length; i++) {
			// 文章表示
			System.out.println("プロフィール" + (i + 1));
			// プロフィール表示
			System.out.print(humanArray[i].toString());
		}
		// 改行
		System.out.println();

		// 配列生成後に要素を代入するパターン
		// Human型配列の宣言
		Human[] humanArray2 = new Human[3];
		// 名前を格納する変数
		String name;
		// 身長を格納する変数
		int hight;
		// 体重を格納する変数
		int weight;
		// 誕生年を格納する変数
		int y;
		// 誕生月を格納する変数
		int m;
		// 誕生日を格納する変数
		int d;

		// 配列の長さ分だけfor文を回す
		for(int i = 0; i < humanArray2.length; i++) {
			// 入力を促す文章
			System.out.println((i + 1) + "人目のプロフィールを入力してください。");
			// 名前の入力を促す文章
			System.out.println("名前：");
			// 入力された値の格納
			name = stdIn.next();
			// 身長の入力を促す文章
			System.out.println("身長：");
			// 入力された値の格納
			hight = stdIn.nextInt();
			// 体重の入力を促す文章
			System.out.println("体重：");
			// 入力された値の格納
			weight = stdIn.nextInt();
			// 誕生年の入力を促す文章
			System.out.println("誕生年：");
			// 入力された値の格納
			y = stdIn.nextInt();
			// 誕生月の入力を促す文章
			System.out.println("誕生月：");
			// 入力された値の格納
			m = stdIn.nextInt();
			// 誕生日の入力を促す文章
			System.out.println("誕生日：");
			// 入力された値の格納
			d = stdIn.nextInt();

			// 入力された値を基にHuman型の宣言
			humanArray2[i] = new Human(name, hight, weight, new Day(y,m,d));
		}

		// 配列の長さ分だけfor文を回す
		for(int i = 0; i < humanArray2.length; i++) {
			// 文章表示
			System.out.println("プロフィール" + (i + 1));
			// プロフィール表示
			System.out.print(humanArray2[i].toString());
		}
	}
}
