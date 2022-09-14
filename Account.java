/*
 * クラス名: Account
 * 概要	:口座クラス　演習12_2にて使用
 * 作成者:S.Sugita
 * 作成日:2022.04.20
 * 備考	:特になし
 */

package chap12;

public class Account {
	//口座名義
	private String accountHolder;
	//口座番号
	private int accountNo;
	//残高
	private long balance;
	
	//コンストラクタ
	public Account(String accountHolder, int accountNo, long balance){
		this.accountHolder = accountHolder;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	// 口座名義を取得
	public String getAccountHolder(){
		return accountHolder;
	}
	
	// 口座名義を取得
	public int getAccountNo(){
		return accountNo;
	}
	
	// 残高を取得
	public long getBalance(){
		return balance;
	}
	
	// 預け入れ
	public void deposit(long depositAmount){
		balance += depositAmount;
	}
	
	// 引き出し
	public void withdraw(long withdrawAmount){
		balance -= withdrawAmount;
	}
}

