package ex12Inheritance;

/*
 멤버변수가 상속관계에 있어도 private으로 선언되면 클래스 내부에서만 접근 가능 
 즉 상속받은 하위클래스에서도 접근 불가
 */

class Account{
	private int money;
	public Account(int init) {
		money = init;
	}
	protected void depositMoney(int _money) {
		if(_money < 0) {
			System.out.println("마이너스 금액은 입금할 수 없습니다.");
			return;
		}
		money += _money;
	}
	//private으로 선언된 멤버변수를 외부로 반환할 떄 사용
	protected int getAccMoney() {
		return money;
	}
}

class SavingAccount extends Account{
	// 인자생성자에서 부모의 생성자메소드를 출력하기 위해서 super()사용
	// 이때 인자가 하나인 생성자 호출
	
	public SavingAccount(int initVal) {
		super(initVal);
	}
	// 부모클래스의 protected로 선언된 멤버메소드 각각 호출
	public void saveMoney(int money) {
		depositMoney(money);
	}
	public void showAccountMoney() {
		System.out.println("현 누적금액: " +getAccMoney());
	}
}

public class E02PrivateInheritanceMain {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(10000);
		
		//sa.money = 100000;
		
		sa.saveMoney(5000);
		sa.showAccountMoney();
		
		sa.saveMoney(-1000);
		sa.showAccountMoney();
		
		Account account = new Account(1000);
		//account.money = 1000;
	}

}
