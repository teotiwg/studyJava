package ex12Inheritance;

/*
 Is-A관계
X is a Y => X는 Y의 일종이다로 표현 가능
- 노트북은 컴퓨터의 일종이다.
- 휴대폰은 전화기의 일종이다.
이와같이 Is-A관계가 성립하는 개체를 상속으로 표현하기에 적합
 */

class Computer{
	String owner;
	
	//public Computer() {}
	// 생성자를 개발자가 추가하면 인자가 없는 기본생성자는 생성되지 않는다.
	public Computer(String name) {
		owner = name;
	}
	
	/*
	 private 접근지정자로 선언된 멤버메소드는 외부클래스 혹은 상속받은 클래스에서 접근이 불가능하므
	 public으로 선언된 메소드를 통해 간접호출해야 한다.
	 상속관계라면 protected로 선언된 메소드로도 호출 가능
	 */
	private void keyboardTouch() {
		System.out.println("키보드 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() {
		keyboardTouch();
		calculate();
	}
}

class NotebookComputer extends Computer{
	int battary;
	
	/*
	 부모생성자 호출을 위해 사용하는 super()는 생략이 가능하지만
	앞에 다른 문장이 먼저 오면 오류가 발생하므로 주의 필요
	여기선 부모의 인자생성자 호출중
	 */
	public NotebookComputer(String name, int initCharge) {
		
		//여기서 super()생략되면 에러 발생
		// 부모클래스에서 인자를 정의했으므로
		super(name);
		battary = initCharge;
	}
	public void charging() {
		battary += 5;
	}
	public void movigCal() {
		if(battary < 1) {
			System.out.println("배터리 방전 사용불가");
			return;
		}
		System.out.println("이동하면서 ");
		
		// private으로 선언되서 직접호출 불가능
		//keyboardTouch();
		//calculate();
		calculateFunc();
		
		battary -= 1;
	}
}

class TabletNotebook extends NotebookComputer{
	
	String registPencil;
	
	public TabletNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	public void write(String penInfo) {
		if(battary < 1 ) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		
		//A.compareTo(B)
		//: 문자열 A와 B를 비교하여 0이 반환되면 같고
		//-1, 1이 반환되면 다른 문자열로 판단하는 String 클래스 메소드
		if(registPencil.compareTo(penInfo) != 0) {
			System.out.println("등록된 팬이 아니다.");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -= 1;
	}
}

public class E04ISAInheritance {

	public static void main(String[] args) {
		
		NotebookComputer noteBook = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");
		
		System.out.println("===노트북 컴퓨터 사용===");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();

		System.out.println("ISE-1234 펜으로 태블릿 사용==");
		tablet.write("ISE-1234");

		System.out.println("XYZ-9876 펜으로 태블릿 사용==");
		tablet.write("XYZ-9876");
		
		
		
	}

}
