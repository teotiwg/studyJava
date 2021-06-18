package ex12Inheritance;

class Point2{
   	int xDot, yDot;
   	public Point2(int x, int y){
        xDot=x;
        yDot=y;
   	}
   	public void showPointInfo(){
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle2{	
	//멤버변수
	int radian;//반지름
	Point2 center;
	// 생성자
	public Circle2(int x, int y, int r) {
		radian = r;
		center = new Point2(x, y);
	}
	public void showCircleInfo() {
		/*
		 반지름은 멤버변수를 통해 즉시 출력하고, 중심점은 Point객체의 멤버메소드를 호출하여 출력
		 */
		System.out.println("반지름: " + radian);
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring2{
	//멤버변수
	Circle2 innerCircle;//안쪽의 원
	Circle2 outerCircle;//바깥쪽의 원
	//생성자
	/*
	 링 클래스에선 원이 2개 있어야 하므로 아래처럼
	 Circle객체를 2개 생성
	 */
	public Ring2(int inX, int inY, int inR, int outX, int outY, int outR) {
		// 멤버변수가 객체이므로 해당 객체 생성
		innerCircle = new Circle2(inX, inY, inR);
		outerCircle = new Circle2(outX, outY, outR);
	}
	// 링 표현 메소드
	public void showRingInfo() {
		/*
		 상속관게가 아니므로 각각의 멤버변수(Circle 객체)를 통해 멤버메소드를 호출해야 함
		 */
		System.out.println("안쪽 원의 정보: ");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽 원의 정보: ");
		outerCircle.showCircleInfo();
	}
}

public class QuRingMakeA {

	public static void main(String[] args) {
		
		Ring2 c = new Ring2(1,1,3,2,2,9);
		c.showRingInfo();

		
	}

}
