package ex08class;

class FruitSeller{
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLEPRICE = 1000;
	// 클래스의 멤버상수를 선언하는 경우, 반드시 선언과 동시에 초기화 필수
	// 만일 초기화를 안 하면 에러 발생
	
	public int saleApple(int money) {
		int num = money/APPLEPRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);
	}
	
}

class FruitBuyer{
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple);
	}
}

public class E06FruitSalesMain1 {

	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
	}

}
