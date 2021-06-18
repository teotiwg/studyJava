package ex12Inheritance;

public class E07RideAndLoad02 {

	public static void main(String[] args) {
		
		System.out.println("Child형 참조변수로 Child객체 참조");
		DeChild child = new DeChild("율곡이이", 49, "00학번");
		
		/*
		 오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건 자식쪽 메소드가 호출됌
		 */
		child.excercise();
		child.sleep();
		child.printParent();
		
		child.study(); // 자식에서 확장한 메소드(부모에는 없음)
		child.walk(); // 오버로딩 - 부모쪽에 정의
		child.walk(25); // 오버로딩 - 자식쪽에 정의
		
		/*
		 정적메소드는 클래스명을 통해 호출
		 static의 기본규칙을 따름. 오버라이딩의 대상이 될 수 없음
		 */
		DeChild.staticMethod();
		
		System.out.println("Parent형 참조변수로 Child객체 참조");
		DeParent parent = new DeChild("퇴계이황", 35, "99학번");
		
		/*
		 오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건 자식 쪽 메소드가 호출됌
		 참조변수의 영향을 받지 않음
		 */
		parent.excercise();
		parent.sleep();
		parent.printParent();
		
		//parent.study(); // 자식에서 확장한 메소드이므로 접근 불가
		parent.walk();
		//parent.walk(20); // 역시 접근 불가
		
		/*
		 정적메소드는 오버라이딩되지 않음. 클래스명만으로 호출됌
		 */
		DeParent.staticMethod();
		
	}

}
