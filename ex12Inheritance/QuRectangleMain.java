package ex12Inheritance;

/*
 정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오. 

 */

class Rectangle{
	int sideA, sideB;
	
	public Rectangle(int side1, int side2) {
		sideA = side1;
		sideB = side2;
		//int areaR = sideA * sideB;
	}
	public void ShowAreaInfo() {
		System.out.printf("직사각형 면적: %d\n", (sideA * sideB));
	}
} 

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
	int side;
	
	public Square(int sideA) {
		super(sideA, sideA); //////////////
		side = sideA;
	}
	public void ShowAreaInfo() {
		System.out.printf("정사각형 면적: %d\n", (side * side));
	}
} 

public class QuRectangleMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
       	
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();
		
	}

}
