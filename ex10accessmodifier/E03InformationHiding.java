package ex10accessmodifier;

class FruitSeller{
	
	// 외부 클래스에서 접근할 수 없도록 private으로 선언
	private int numOfApple;
	private int myMoney;
	private final int APPLEPRICE;
	
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLEPRICE = price;
	}
	
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
	
	private int myMoney = 5000;
	private int numOfApple = 0;
	
	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple);
	}
}

public class E03InformationHiding {

	public static void main(String[] args) {
		
		// 초기화 메소드를 정의하였으므로 각각 성격이 다른 객체들 생성 가능
		
		FruitSeller seller1 = new FruitSeller(0, 100, 1000);
		
		FruitSeller seller2 = new FruitSeller(0, 80, 500);
		
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
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
		 
		 멤버변수를 private로 선언하면 클래스 외부에서는 접근이 불가능하므로 아래 코드는 모두 에러 발생
		 멤버변수의 정보은닉을 통해 비정상적 접근을 차단하고,
		 멤버메소드를 통해서만 구매가 이뤄지도록 구현
		 */
		/*
		seller1.myMoney += 1000; // 판매자1에게 1000원 지불하고 사과 50개 구매
		seller1.numOfApple -= 50;
		buyer.numOfApple += 50; // 구매자는 사가 50개 증가
		
		seller2.myMoney += 1000; // 판매자2에게 1000원 지불
		seller1.numOfApple -= 70; // 사과 70개 구매
		buyer.numOfApple += 70; // 따라서 구매자는 70개 증가 하지만 구매자의 보유금액은 차감되지 않음
		 */
		
		System.out.println("구매가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
	}

}
