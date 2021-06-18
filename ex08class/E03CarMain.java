package ex08class;



class Car{
	
	// 멤버상수
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	String carGear = AUTO;
	String carModel;
	int carYear;
	Human owner;
	/*
	 소유주: Human클래스를 기반으로 하는 멤버변수로 
	 초기화를 위해 이름/ 나이/ 에너지 세가지 값이 필요
	 이와 같이 클래스를 구성할 때 또다른 객체를 멤버변수로 선언 가능
	 */
	
	// 멤버메소드
	void drive() {
		System.out.println(owner.name + "이(가) " + carModel + "을 운전한다.");
	}
	
	//
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	
	// 위와 동일한 이름의 메소드로 오버로딩으로 초기화된 메소드
	// 초기화를 진행하는 역할은 동일하나, 매개변수를 통해 다양한 형태의 객체 초기화 가능
	void initialize(String model, int year, String name, int age, int energy){
		carModel = model;
		carYear = year;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명: %s\n", carModel);
		System.out.printf("연식: %d\n", carYear);
		System.out.printf("기어: %s\n", carGear);
	}

}

public class E03CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출 전]");
		System.out.println("car1.owner = " + car1.owner);
		//car1.drive();
		/*
		 실행 시 예외 발생
		 자동차 소유주를 표현하는 Human객체가 초기화되지 않은 상태에서 출력을 시도하여 
		 런타임에러가 발생
		 */
		
		System.out.println("[초기화메소드 호출 후]");
		car1.initialize();
		car1.drive();
		car1.showCarInfo();
		
		// 만약 2개 이상의 객체를 생성해야 할 경우 아래의 초기화코드를 중복사용해야 하기에 비추
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "벤틀리";
		car2.carYear = 2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니 스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차 정보와 소유자 정보 같이 보기");
		car2.showCarInfo();
		
	}

}
