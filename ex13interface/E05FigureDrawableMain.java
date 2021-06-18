package ex13interface;

import figure.Circle;
import figure.IDrawable;
import figure.IFigure;
import figure.Rectangle;
import figure.Triangle;

public class E05FigureDrawableMain {

	public static void main(String[] args) {
		
		// 부모인터페이스의 참조변수로 자식객체를 참조하는 이질화형태
		IFigure figure = new Circle(30);
		//오버라이딩됐으므로 별도의 형변환 없이 즉시 호출 가능
		figure.area("원");
		// 자식객체에 접근하기 위해 다운캐스팅 후 메소드 호출
		((Circle)figure).draw("나도 원");
		
		IFigure fig1 = new Rectangle(100, 90);
		figure.area("사각형");
		((Rectangle)fig1).draw("사각형");
		
		IDrawable draw = new Triangle(100, 90);
		draw.draw("삼각형");
		((Triangle)draw).draw("삼각형");
		
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("나도 원");
		
		
		
	}

}
