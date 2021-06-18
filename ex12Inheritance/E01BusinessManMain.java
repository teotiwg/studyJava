package ex12Inheritance;

/*
 상속(Inheritance):
기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스를 정의한 것
부모클래스를 자식클래스가 상속할 땐 extends키워드 사용
 */

class Man{
	//부모클래스(상위, 기본, super)
	private String name;
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man클래스 인자 생성자 호출");
	}
	public void tellYourName() {
		System.out.println("내 이름은 " + name + "입니다.");
	}
}

//자식클래스(하위, 유도, sub)
class BusinessMan extends Man{
	private String company;
	private String position;
	
	// 상속받은 자식클래스는 부모클래스의 생성자를 호출하여 부모객체가 먼저 생성되도록 해야 함
	// super()는 부모클래스의 생성자 호출할 때 쓰지 않으면 디폴트생성자가 호출됌 
	public BusinessMan(String name, String company, String position) {
		super(name);
		
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	public void tellYourInfo() {
		System.out.println("회사명은 " + company + "입니다.");
		System.out.println("직급은 " + position + "입니다.");
		
		tellYourName();
	}
}

public class E01BusinessManMain {
// 자식클래스를 통해 객체를 실행하지만 실행결과에는 부모클래스의 생성자가 먼저 호출
	//항상 부모클래스가 먼저 호출되고 자식클래스가 호출됌
	public static void main(String[] args) {
		
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}

}
