package ex12Inheritance;

class Burger {

	String name, patty, sauce, veg;
	int price;

	public Burger(String name, int price, String patty, String veg, String sauce) {
		this.name = name;
		this.price = price;
		this.patty = patty;
		this.veg = veg;
		this.sauce = sauce;
	}
	public void showBurger() {
		System.out.printf("%s\n가격: %d\n식재료: %s, %s, %s\n", name, price, patty, sauce, veg);
	}
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	int price;
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	public HamburgerPrice(Burger burger) {
		this.burger = burger;
		this.price = burger.price + COKE + POTATO;
	}
	public void showPrice() {
		burger.showBurger();
		System.out.println("결제금액: " + price + "원");
		System.out.println("=============================");
	}
}

class SetPrice extends HamburgerPrice {	
	int price;
	Burger burger;

	public SetPrice(Burger burger) {
		super(burger);
		this.burger = burger;
		this.price = (burger.price + COKE + POTATO) - 500;
	}
	public void showPrice() {
		burger.showBurger();
		System.out.println("세트 결제금액: " + price + "원");
		System.out.println("=============================");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상추");

		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();
		//HamburgerPrice price1 = new SetPrice(burger1); 
		//price1.showPrice();
		HamburgerPrice price2 = new HamburgerPrice(burger2); 
		price2.showPrice();
		//HamburgerPrice price2 = new SetPrice(burger2); 
		//price2.showPrice();
		
	}

}
