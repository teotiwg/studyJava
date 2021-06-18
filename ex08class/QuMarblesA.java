package ex08class;

class childProperty{
	// 멤버변수: 보유한 구슬 갯수
	int beadCnt;
	
	// 구슬 갯수를 초기화하는 생성자 메소드
	public void ChildProperty(int bCnt) {
		this.beadCnt = bCnt;
	}

	// 구슬 갯수 출력하는 메소드
	void showProperty{
		System.out.println("보유 구슬의 갯수 " + beadCnt);
	}
	
	// 구슬치기 게임 메소드
	void obtainBead(ChildProperty child, int bCnt) {
		// 매개변수로 전달되는 어린이 객체는 게임에 패배하였으므로 구슬 차감
		child.beadCnt -= bCnt;
		// 호출의 주체가 되는 어린이 객체는 게임에서 승리했으므로 구슬 증가
		// (해당 메소드를 호출한 객체)
		this.beadCnt += bCnt;
	}
	
}

public class QuMarblesA {

	public static void main(String[] args) {
		
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
		
	}

}
