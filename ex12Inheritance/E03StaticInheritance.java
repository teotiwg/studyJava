package ex12Inheritance;

/*
 static(정적) 타입의 멤버도 상속이 되고
하위클래스에서 접근 시 멤버변수의 이름만으로 접근 가능
단, 클래스 외부에서 접근할 경우객체생성 없이 클래스명을 통해서도 접근 가능
즉 static이 가진 기본규칙을 그대로 따름
 */

class Adder{
	
	public static int val = 0;
	
	/*
	 static으로 선언된 멤버변수는 실제론 외부(메소드영역)에 생성되어 있으므로
	 클래스명을 통한 접근 허용됌
	 코드레벨에서 보면 해당클래스의 멤버변수이므로 
	 */
	
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

// 자식클래스의 멤버메소드는 모두 실행 및 접근 가능
class AdderFriend extends Adder{
	public void friendAdd(int num) {
		val += num;
		Adder.val += num;
	}
	public void showVal() {
		System.out.println("val = " + val);
		System.out.println("val = " + Adder.val);
		
	}
}

public class E03StaticInheritance {

	public static void main(String[] args) {

		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		Adder.val += 5;
		AdderFriend.val += 7;
		
		adFriend.showVal();
	
	}

}
