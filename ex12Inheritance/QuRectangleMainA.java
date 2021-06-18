package ex12Inheritance;

//직사각형을 표현한 클래스
class Rectangle2{
	
	int width;
	int height;
	
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void ShowAreaInfo() {
		System.out.println("직사각형 넓이: " + (width * height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square2 extends Rectangle{
	/*
	 멤버변수: 
	 	해당 클래스의 경우, 부모 클래스가 이미 가로, 세로에 대한 멤버변수를 정의했으므로
	 	자식쪽에 멤버변수의 확장은 필요 없다.
	 */
	/*
	 자식의 생성자: 정사각형은 가로, 세로의 길이가 동일하므로 
	 인자값 1개로 부모의 멤버변수 2개를 초기화하도록 super()를 정의
	 */
	
	public Square2(int width) {
		super(width, width);
	}
	/*
	 자식객체를 통해 넓이를 구할 때는 정사각형의 넓이가 나와야 하므로 오버라이딩으로 정의
	 오버라이딩된 메소드는 상속관계에서 항상 최하위의 메소드가 호출됌
	 */
	
	@Override
	public void ShowAreaInfo() {
		//System.out.println("정사각형 넓이: " + (width * height));
	}
} 

public class QuRectangleMainA {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
       	
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();

	}

}
