package main;

//二値/三値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティクラスMinMax
class MinMax{
	
	// 三値の最小値を求めるメソッドminThreeNum
	public static double minThreeNum(double x,double y, double z){
		// Math.min()を使用して三値の最小値を変数minに格納
		double min =   Math.min(z, Math.min(x,y));
		// 最小値を返す
		return min;
	}
	// 三値の最大値を求めるメソッドmaxThreeNum
	public static double maxThreeNum(double x,double y, double z){
		// Math.max()を使用して三値の最大値を変数miaxに格納
		double max =   Math.max(z, Math.max(x,y));
		// 最大値を返す
		return max;
	}
	// 二値の最小値を求めるメソッドminTwoNum
	public static double minTwoNum(double x,double y){
		// Math.min()を使用して二値の最小値を変数minに格納
		double min =   Math.min(x,y);
		// 最小値を返す
		return min;
	}
	// 二値の最大値を求めるメソッドmaxTwoNum
	public static double maxTwoNum(double x,double y){
		// Math.min()を使用して二値の最小大値を変数maxに格納
		double max =   Math.max(x,y);
		// 最大値を返す
		return max;
	}
	// 配列の最小値を求めるメソッドminArrayNum
	public static double minArrayNum(double[] x){
		// 配列の最初の値を変数minに格納
		double min = x[0];
		// 配列の長さ分、for文を回す
		for(int i = 1; i < x.length; i++){
			// 変数minの値と配列xのi番目の値を比較し、より小さいほうをminへ格納
			min =   Math.min(min,x[i]);
		}
		// 最小値を返す
		return min;
	}
	// 配列の最大値を求めるメソッドmaxArrayNum
	public static double maxArrayNum(double[] x){
		// 配列の最初の値を変数maxに格納
		double max = x[0];
		// 配列の長さ分、for文を回す
		for(int i = 1; i < x.length; i++){
			// 変数maxの値と配列xのi番目の値を比較し、より大きいほうをmaxへ格納
			max =   Math.max(max,x[i]);
		}
		// 最大値を返す
		return max;
	}
}