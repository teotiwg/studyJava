package ex19thread;

class Sum{
	int num;
	
	public Sum() {
		num = 0;
	}
	// 매개변수 n을 멤버변수 num에 누적해서 더함
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}
/*
 Thread클래스를 생성하는 두번째 방법:
 	Java는 다중상속이 지원되지 않으므로, 
 	다른 클래스를 상속받아야 한다면 Runnable인터페이스를 구현해서 쓰레드 클래스를 정의해야 함
 */
class AdderThread extends Sum implements Runnable{
	int start,end;
	
	public AdderThread(int s, int e) {
		start = s;
		end= e;
	}
	/*
	 멤버변수 start와 end만큼 반복하면서 부모클래스의 addNum() 메소드를 호출하여 누적합을 구한다.
	 */
	public void run() {
		for(int i = start; i <= end; i++) {
			System.out.println("i = " + i);
			addNum(i);
		}
	}
}

public class Ex04Runnable {

	public static void main(String[] args) {
		/*
		 Runnable 인터페이스를 구현한 클래스의 인스턴스를 대상으로 쓰레드 생성
		 해당 방법도 결국은 Thread클래스를 통해서 쓰레드를 생성하게 됌
		 */
		AdderThread at1 = new AdderThread(1,500);
		AdderThread at2 = new AdderThread(501,1000);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try {
			/*
			 생성된 쓰레드가 작업을 완료하길 기다리는 기능 수행
			 즉 해당 쓰레드가 하나의 작업이 종료되길 기다렸다가 다음 쓰레드를 실행하게 됌
			 쓰레드의 동시접근을 제한하는 기능 보유
			 */
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~1000까지의 합:" + (at1.getNum() + at2.getNum()));
	}

}
