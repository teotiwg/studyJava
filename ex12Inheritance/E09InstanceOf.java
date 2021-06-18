package ex12Inheritance;

/*
 instanceof연산자:
 	인스턴스 변수가 어떤 타입의 변수인지 판단하는 연산자로
 	형변환(즉 상속관계가 있으면)이 가능하면 true, 아니면 false 반환
 	- 객체 간의 형변환이 되려면 반드시 두 클래스 간에 상속관계가 있어야 함
 	- 부모클래스의 참조변수로 자식객체를 참조할 수 있으므로 매개변수로 전달된 인자가 어떤타입인지 확인할 때 주로 사용
 */

class Box{
	public void boxWrap() {
		System.out.println("Box로 포장합니다.");
	}
}

class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다.");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다.");
	}
}

public class E09InstanceOf {
	/*
	 - 여기서 instanceof연산자를 통해 형변환 가능여부를 판단하는 이유는 전달된 매개변수를 최상위클래인 Box타입을 받고 있기 때문
	 - Box타입으로 인자를 받게되면 자동으로 업캐스팅(자동형변환)이 되기 때문에 자식 클래스의 멤버메소드를 호출할 수 없게 된다
	 - 이때 자식의 멤버메소드를 호출하기 위해서 다운캐스팅(명시적형변환)이 필요
	 - 따라서 전달된 인자를 각각의 타입으로 형변환이 가능한지 판단한 후 다운캐스팅을 진행하고 각 클래스의 멤버메소드를 호출할 수 있게 된다.
	 */
	static void wrapBox(Box b) {
		int num1 = (int)1.0;
		double num2 = 1;
		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}

	public static void main(String[] args) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		String str = new String("나는 누구?");
		//wrapBox(str); -> String객체와 상속관계가 없으므로 호출 불가
		
	}

}
