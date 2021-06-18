package ex12Inheritance;

// 자식클래스
public class DeChild extends DeParent {
	
	// 자식에서 확장한 멤버변수
	String stNumber;
	
	// 생성자메소드
	public DeChild(String name, int age, String stNumber) {
		// 부모의 인자생성자 호출
		super(name, age);
		this.stNumber = stNumber;
	}
	/*
	 자식클래스에서 새롭게 확장한 멤버메소드
	 */
	public void study() {
		System.out.println(getName() + "이(가) 공부한다.");
	}
	/*
	 오버라이딩 아님:
	 	부모클래스에서 private 멤버메소드로 선언하였기 때문에
	 	자식쪽에선 보이지 않아 오버라이딩의 대상이 될 수 없음
	 	해당 함수는 자식클래스에서 새롭게 확장한 메소드가 됌
	 */
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	
	/*
	 메소드 오버라이딩의 조건
	 - 부모클래스에서 선언될 때와 비교해서 접근범위가 동일하거나 더 넓으면 가능
	 - 즉 부모에서 디폴트로 선언했다면 자식에서는 디폴트 혹은 퍼블릭으로 선언하면 오버라이딩 가능
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	
	// 이름만 같고 오버라이딩 ㄴㄴ 다른 함수임
	/*
	 메소드의 형태가 부모쪽과 다르므로 오버라이딩 ㄴㄴ
	 오버로딩의 형태로 자식에서 확장된 메소드임
	 */
	public int walk(int age) {
		System.out.println("나이가 " + age + "살인 학생이 "+ "산책한다.");
		return 0;
	}
	
	// 오버라이딩 메소드 정의
	@Override
	public void excercise() {
		//super.excercise();
		System.out.println("학생이 운동한다.");
	}
	@Override
	public void printParent() {
		/*
		 super의 두 사용법
		 - super(): 부모클래스의 생성자 메소드 호출
		 - super.멤버메소드 : 부모클래스에 정의된 멤버메소드 혹은 멤버변수를 접근할 때 사용
		 */
		super.printParent();
		System.out.printf(", 학번: %s \n", stNumber);
	}

	/*
	 static(정적) 메소드는 오버라이딩의 대상이 될 수 없음
	 클래스 외부(메소드영역)에 존재하므로 오버라이딩 되지 않고 
	 호출할 때는 각 클래스명을 통해 호출해야 함.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메소드");
	}

}
