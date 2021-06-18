package ex08class;

class FruitSeller3{
	int numOfApple;
	int myMoney;
	final int APPLEPRICE;
	
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLEPRICE = price;
	}
	
	// 상수는 값 변경이 불가능하고 단 한번만 초기화되기에 일반메소드에서는 초기화 불가능
	// 하지만 생성자메소드는 객체 생성 시 한번만 호출되고, 
	// 개발자가 함부로 호출할 수 없으므로 한번 이상 초기화되지 않음
	// 따라서 멤버상수는 생성자메소드에서 초기화 가능
	
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

class FruitBuyer3{
	int myMoney = 5000;
	int numOfApple = 0;
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		
		// 초기화 메소드를 정의하였으므로 각각 성격이 다른 객체들 생성 가능
		
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매가 일어나기 전 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매가 일어난 후 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
	}

}
