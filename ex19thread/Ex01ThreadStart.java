package ex19thread;

/*
 Thread(쓰레드):
 	- 쓰레드의 생성은 Thread클래스를 상속받는것에서 시작
 	- 해당 방법은 쓰레드로 생성할 클래스가 다른 클래스르 상속받지 않아도 되는 경우 사용
 	- 만약 해당클래스가 다른 클래스를 상속받아야 한다면 Runnable인터페이스를 구현하여 사용
 */

class ShowThread extends Thread{
	String threadName;
	
	public ShowThread(String name) {
		threadName = name;
	}
	/*
	 run()메소드는 쓰레드의 main()메소드에 해당
	 Thread클래스의 run()메소드를 오버라아딩한 것으로 해당 메소드는 직접 호출하면 안되고,
	 start()를 통해 간접적으로 호출해야 함
	 만약 직접 호출하면 단순히 실행만 될 뿐, 쓰레드가 생성되지 않으므로 주의 필요
	 */
	@Override
	public void run() {
		for( int i = 1; i <= 100; i++) {
			System.out.println("안녕하세요. ["+ threadName + "]입니다,");
			try {
				/*
				 Thread클래스의 static메소드로 실행의 흐름을 주어진 시간만큼
				 block상태로 전환시켜줌
				 1000분의 1초단위로 기술하므로 아래는 0.01초만큼 Block시키는 것
				 */
				sleep(10); // sleep(1000) => 1초
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart {

	public static void main(String[] args) {
		
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
		
		// 쓰레드 객체를 통한 쓰레드 생성(실행)
		st1.start();
		st2.start();
		
//		st1.run();
//		st2.run();
	}

}
