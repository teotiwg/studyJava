package ex17collection;

class Apple{
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo() {
		System.out.println("사과의 무게는 " + weight + "입니다.");
	}
}

class Banner{
	int sugar;
	public Banner(int s) {
		sugar = s;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는 " + sugar + "입니다.");
	}
}

/*
 class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}
=> 기존 Object기반의 FruitBox를 아래와 같에 제네릭클래스로 변경
자료형에 해당하는 부분을 타입매개변수로 교체하고 
객체 생성 시 자료형을 결정하기 위해 클래스명<T> 형태로 변경
 */

class GenericFruitBox<T>{
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class Ex02GenericClass {

	public static void main(String[] args) {
		/*
		 인스턴스 생성 시 T 부분을 결정하므로 구현의 편의성이 보장됌
		 각각 Apple, Banana객체를 저장가능한 인스턴스가 생성됌
		 */
		
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banner> bannerBox = new GenericFruitBox<Banner>();
		bannerBox.store(new Banner(20));
		Banner banner = bannerBox.pullOut();
		banner.showInfo();
		
		/*
		 orangeBox는 인스턴스 생성 시 Orange를 저장가능한 용도로 생성되었기에
		 다른 객체는 저장 불가
		 아래 코드에서 컴파일 에러가 발생하므로 자료형에도 안전한 코드가 됌
		 */
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
		//orangeBox.store("나는 오렌지"); -> 컴파일 에러
		//orangeBox.store(apple); -> 컴파일 에러
		//orangeBox.store(banner); -> 컴파일 에러
	}

}
