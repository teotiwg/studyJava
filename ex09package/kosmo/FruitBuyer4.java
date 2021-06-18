package ex09package.kosmo;

import ex09package.kosmo.FruitSeller4;

/*
 해당 클래스는
 buyApple(FruitSeller4 seller, int money)메소드를 호출할 때
 매개변수로 FruitSeller4타입을 사용
 따라서 해당 클래스를 반드시 import처리해야 함
 */

public class FruitBuyer4 {
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 현재잔액: " + myMoney);
		System.out.println("[구매자] 사과 갯수: " + numOfApple);
	}
	
}
