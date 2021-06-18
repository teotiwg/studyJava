package ex12Inheritance;

/*
 구성관계로 표현하기에 적합한 Has-A관계
 	X has a Y => X가 Y를 소유
 	
 	Has - A와 같이 소유의 관계를 상속으로 표현하면 
 	클래스 간의 강한 연결고리가 형성되어 권총이 없는 경찰을 표현하기가 힘들어짐
 	따라서 이 경우에는 구성관계로 표현하는 것이 적합
 	구성관계를 클래스의 멤버로 또 다른 객체를 정의하는 걸 의미
 	
 */

class Gun{
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	public void shutGun() {
		System.out.println("빵야");
		bullet--;
	}
}

class Police{
	int handCuffs;
	Gun gun;
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		
		if(bNum <= 0) {
			gun = null; // 참조변수가 null값이란 건 참조할 객체가 없다는 의미(즉 힙에 생성된 객체가 없다는 것)
		}
		else {
			gun = new Gun(bNum);
		}
	}
	public void putHandcuff() {
		System.out.println("수갑/ 수감");
		handCuffs--;
	}
	public void shut() {
		if(gun == null) {
			System.out.println("보유 권총 없음");
		}
		else {
			gun.shutGun();
		}
	}
	
}

public class E05HasAComposite {

	public static void main(String[] args) {

		
		System.out.println("===경찰1===");
		Police police1 = new Police(5,3);
		police1.shut();
		police1.putHandcuff();
		
		System.out.println("===경찰2===");
		Police police2 = new Police(0,3);
		police2.shut();
		police2.putHandcuff();
		
		
	}

}
