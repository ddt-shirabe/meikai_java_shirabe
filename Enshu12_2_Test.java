/*
 * クラス名: Enshu12_2_Test
 * 概要	:FixedDepositAccount.javaのテストクラス
 * 作成者:S.Sugita
 * 作成日:2022.04.20
 * 備考	:特になし
 */

package chap12;

public class Enshu12_2_Test {
	public static void main(String[] args) {
		// 比較対象の定期預金付き銀行口座の宣言
		// おくやすさんの定期預金付き銀行口座
		FixedDepositAccount okuyasuAccount = new FixedDepositAccount("Okuyasu Nishimura", 011111111, 3000, 2000);
		// ひろせさんの定期預金付き銀行口座
		FixedDepositAccount kouichiAccount = new FixedDepositAccount("Kouichi Hirose", 022222222, 10000, 3000);
		
		// 普通預金と定期預金残高の合計額を比較する。
		System.out.println(FixedDepositAccount.compBalance(okuyasuAccount,kouichiAccount));
		
	}

}
