package ex10accessmodifier;

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

public class E02FruitSalesMain5 {

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
		
		
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의 관계가 전혀 맞지 않는 논리적 오류 발생
		 즉 코드(메소드)로 구현한 규책이 완전 무너짐
		 객체지향 프로그래밍에선 이런 오류를 막기 위해 멤버변수에 대한 "정보은닉"을 하도록 규정
		 */
		
		seller1.myMoney += 1000; // 판매자1에게 1000원 지불하고 사과 50개 구매
		seller1.numOfApple -= 50;
		buyer.numOfApple += 50; // 구매자는 사가 50개 증가
		
		seller2.myMoney += 1000; // 판매자2에게 1000원 지불
		seller1.numOfApple -= 70; // 사과 70개 구매
		buyer.numOfApple += 70; // 따라서 구매자는 70개 증가 하지만 구매자의 보유금액은 차감되지 않음
		
		System.out.println("구매가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
	}

}
