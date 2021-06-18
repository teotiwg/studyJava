package figure;

public class Circle implements IFigure, IDrawable {
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 인터페이스에 정의된 메소드를 필수적으로 오버라이딩해야 함
	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다.");
	}
	
	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적(r * r * PI): " + (radius * radius * Math.PI));
		
	}
	
}
