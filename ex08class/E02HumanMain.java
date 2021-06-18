package ex08class;

/*
 해당 예제에선 Human클래스를 외부파일로 선언
 동일한 패키지로 정의된다면 컴파일러는 해당 클래스를 찾아 즉시 객체(인스턴스)화 가능
 만약 다른 패키지에 선언된 클래스라면 import 선언 필수
 
 */

public class E02HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();
		human.eat();
		human.walk();
		human.thinking();
		human.showState();
		
		for(int i = 1; i <= 20; i++) {
			human.walk();
		}
		human.showState();
		for( int i = 1; i <= 20; i++) {
			human.eat();
		}
		human.showState();
		
	}

}
