package ex12Inheritance;

/*
연습문제]  AnimalDog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델
	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할것
 */

public class AnimalDog extends Animal{
	// 확장한 멤버변수
	String dogKind;
	String name;
	
	
	// 부모클래스의 species 멤버변수는 private으로 선언되어 자식에선 접근불가능하므로
	// 이때 public으로 선언된 getter메소드를 통해 접근 필요
	void bark() {
		
		System.out.printf("%s(%s/%s)(이)가 짖는다\n", name, getSpecies(), dogKind);
	}	
	
	void showDog() {
		// 여기서 사용된 super는 부모클래스의 객체를 가리키는 의미로 
		// 부모클래스의 showAnimal()메소드를 호출
		super.showAnimal();
		
		System.out.printf("품종: %s\n", dogKind);
		System.out.printf("이름: %s", name);
	}
	
	public AnimalDog(String species, String gender, int age, String dogKind, String name) {
		
		// 자식클래스에선 반드시 부모클래스의 객체를 먼저 생성해줘야 함
		// 여기서 사용된 super()는 부모클래스의 생성자메소드를 호출
		super(species, age, gender);

		// 자기 멤버변수 초기화
		this.dogKind = dogKind;
		this.name = name;
		
		
	}
	
}
