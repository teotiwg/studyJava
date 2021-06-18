package ex17collection;

class Orange{
	int sugar;
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("오렌지 당도는 " + sugar + "입니다.");
	}
}
// 오렌지만 담는 박스 -> Orange객체만 저장가능한 클래스
class OrangeBox{
	Orange item;
	public void store(Orange item) {
		this.item = item;
	}
	public Orange pullOut() {
		return item;
	}
}

// 과일상자 -> Object기반으로 모든 객체(과일) 저장가능한 클래스
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
public class Ex01GenericBasic {

	public static void main(String[] args) {
		/*
		 OrangeBox에 Orange객체를 생성한 후 저장하고 정보 출력
		 */
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
		// 상자1은 오렌지전용이므로 다른 과일(객체) 저장 불가
		// 컴파일 에러가 발생하므로 실행 자체가 불가능
		// -> 즉 자료형에는 안전하지만 , 구현에는 불편함이 있음
		// 다른 객체를 저장하기 위해선 또 다른 Box클래스 생성해야 함
		//oBox1.store("당도가 20인 오렌지"); <- 컴파일 에러 발생
		//Orange orange2 = oBox1.pullOut();
		//orange2.showInfo();
		
		/*
		 Object를 기반으로 한 FruitBox는 구현에는 편리하나 
		 코드레벨에서 에러가 발생하지 않으므로 오류 찾아내기가 더 어려움
		 따라서 자료형에는 안전하지 못한 코드가 됌
		 */
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut(); 
		orange3.showInfo();
		
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
		Orange orange4 = (Orange)fBox2.pullOut(); // <- 런타임 에러 발생
		orange4.showInfo();
		
	}

}
