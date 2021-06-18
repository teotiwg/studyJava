package ex12Inheritance;

/*
 오버라이딩(Overriding):
 	클래스가 상속관계에 있을 때 하위클래스에서 상위클래스의 멤버메소드와 완전히 동일한 모양으로 재정의하는 것
 	오버로딩과 다른 점은 매개변수의 갯수, 반환타입이 완전 똑같은 형태로 정의하는 것
 	하위클래스에서 오버라이딩한 메소드는 상위클래스의 메소드를 가리게 되므로
 	항상 최하위 클래스에서 오버라이딩한 메소드가 호출됌.
 */

class Speaker{
	
	private int volumnRate;
	
	// 외부 설정가능한 setter 메소드
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	
	// 상속관게에서 오버라이딩을 목적으로 정의한 메소드
	public void showState() {
		System.out.println("스피커 볼륨 크기: " + volumnRate);
	}
	
}

class BaseSpeaker extends Speaker{
	private int baseRate;
	
	public void setBase(int bas) {
		baseRate = bas;
	}
	
	/*
	 @Override:
	 '이노테이션' 오버라이딩된 메소드에 추가하여 컴파일러에게 알려주는 역할
	 */
	@Override
	public void showState() {

	/*
	 super를 통해 부모클래스에 정의된 멤버메소드 호출
	 특히 오버라이딩된 메소드를 호출할때 super가 없으면 재귀함수가 되므로 기술 필수	
	 */
		super.showState();
		System.out.println("베이스 볼륨 크기: " + baseRate);
	}
}

public class E06Overriding {

	public static void main(String[] args) {
		
		// 자식클래스를 통해 객체생성
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		// 자식 객체로 호출했으므로 자식클래스에서 오버라이딩한 showState()메소드가 호출됌
		
		System.out.println();
		
		/*
		 부모클래스의 참조변수가 자식클래스의 객체를 참보 가능
		 이 경우 접근범위는 부모클래스로 제한
		 즉 아래 호출 부분에서speaker참조변수를 통해선 setBase()메소드는 호출 불가
		 setBase()는 자식클래스에서 정의된 멤버메소드이기 때문
		 단, 오버라이딩 처리된 메소드가 있는 경우엔 하위클래스의 메소드가 호출됌
		 */
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
		//speaker.setBase(40);
		speaker.showState();
	}

}
