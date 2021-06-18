package ex08class;

class FruitSeller2{
	int numOfApple;
	int myMoney;
	int applePrice;
	// 클래스의 멤버상수를 선언하는 경우, 반드시 선언과 동시에 초기화 필수
	// 만일 초기화를 안 하면 에러 발생
	
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		applePrice = price;
	}
	
	public int saleApple(int money) {
		int num = money/applePrice;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);
	}
	
}

class FruitBuyer2{
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		
		// 초기화 메소드를 정의하였으므로 각각 성격이 다른 객체들 생성 가능
		
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
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
