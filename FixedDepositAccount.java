/*
 * クラス名:FixedDepositAccount
 * 概要	:定期預金付き口座クラスの定期預金部分を表したクラス　演習12_2にて使用
 * 　　　定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド"compBalance"の作成
 * 作成者:S.Sugita
 * 作成日:2022.07.06
 * 備考	:特になし
 */

package chap12;

public class FixedDepositAccount extends Account{
	//定期預金残高
	private long timeDeposit;
	
	//スーパークラスAccountを継承したFixedDepositAccountのコンストラクタ
	public FixedDepositAccount(String accountHolder, int accountNo, long balance, long timeDeposit){
		// スーパークラスのコンストラクタの呼び出し
		super(accountHolder, accountNo, balance);
		this.timeDeposit = timeDeposit;
	}
	
	// 総残高を取得
	public long getBalance(){
		return timeDeposit + super.getBalance();
	}
	
	/* 定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド"compBalance"の作成
	 * ※変数名、メソッド名は参考書より指定あり
	 * static int compBalance(Account a, Account b)
	 * 合計額を比較し、aの方が大きい場合は1、等しければ0、bの方が多ければ-1を返却
	 * もしaやbの参照先が、定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較対象とする。
	 */
	static int compBalance(Account a, Account b){
		// 合計額を比較し、aの方が大きい場合は1、等しければ0、bの方が多ければ-1を返却する変数
		int compBalanceResultNum = 0;
		// 定期預金付き銀行口座クラス型変数aの総残高
		long totalBalanceA = a.getBalance();
		// 定期預金付き銀行口座クラス型変数aの総残高
		long totalBalanceB = b.getBalance();
		
		// aの方が高い場合は1を返す
		if(totalBalanceA > totalBalanceB){
			compBalanceResultNum = 1;
		// 同額の場合は0を返す
		}else if(totalBalanceA == totalBalanceB){
			compBalanceResultNum = 0;
		// bの方が高い場合は-1を返す
		}else if(totalBalanceA < totalBalanceB){
			compBalanceResultNum = -1;
		}
		
		// 判定結果を返却
		return compBalanceResultNum;
	}
}
