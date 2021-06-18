package ex09package.kosmo;

// 패키지가 다른 경우 import하려면 반드시 public으로 선언해야 함 

public class FruitSeller4 {
	
	int numOfApple;
	int myMoney;
	int applePrice;
	//final int APPLEPRICE;
	
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		applePrice = price;
		//APPLEPRICE = price;
	}
	
	public int saleApple(int money) {
		//int num = money/APPLEPRICE;
		int num = money/applePrice;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자] 남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자] 판매수익: " + myMoney);
	}
	
}
