package ex12Inheritance;

class Car2{
       	int gasoline;
       	
       	public Car2 (int gas) {
       		this.gasoline = gas;
       	}
}
class HybridCar2 extends Car{
       	int electric;
       	
       	public HybridCar2(int gas, int ele) {
       		super(gas);
       		this.electric = ele;
       	}
}
class HybridWaterCar2 extends HybridCar{
	int water;
	/*
	 하위클래스의 생성자에서는 부모클래스의 객체를 항상 먼저 생성해야하므로
	 super()를 통해 부모의 생성자를 먼저 호출한 후 자신의 멤버변수를 초기화해야 한다.
	 */

	// 생성자는 무조건 퍼블릭/ 메소드이름은 클래스 이름과 같게	
	public HybridWaterCar2(int gas, int ele, int wat) {
		// 부모객체를 초기화하기 위해 super()를 항상 먼저 기술해야함
		super(gas, ele);
		this.water = wat;
	}
	
	public void showNowGauge(){
        System.out.println("남은가솔린:"+gasoline);
        System.out.println("남은전기량:"+electric);
        System.out.println("남은워터량:"+water);
        }
}

public class QuConstructorAndSuperA {

	public static void main(String[] args) {
		/*
		 하위클래스를 통해 객체를 생성할 땐 
		 항상 부모쪽 멤버변수까지 초기화할 수 있도록 인자를 전달받아야 한다.
		 */
		
		HybridWaterCar2 hcar = new HybridWaterCar2(10,20,30);
		hcar.showNowGauge();
		
	}

}
