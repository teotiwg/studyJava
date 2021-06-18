package ex12Inheritance;

class Burger {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야체을 표현 */
	private String burgerName;
	private int price;
	private String patty;
	private String sauce;
	private String vegetable;
	
	public Burger(String burgerName, int price, String patty, String sauce, String vegetable) {
		super();
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}

	public int getPrice() {
		return price;
	}
	
	public void showBurger() {
		
	}
	//인자생성자
	
	//getter : price만 필요
	
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	//인자생성자
	public HamburgerPrice(Burger burger) {
		
	}
	//기본가격계산
	
	//햄버거와 결제금액 출력
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {	
	//인자생성자

	//세트가격계산(오버라이딩)
	
	//햄버거와 세트결제금액 출력(오버라이딩)	
}

public class QuBuyHamburgerA {

	public static void main(String[] args) {
		
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
				
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
				
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
		
	}

}
