package ex19thread;

// 공유객체로 사용할 클래스
class SumMulti{
	int num;
	
	public SumMulti() {
		num = 0;
	}
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}

class MultiAdderThread extends Thread{
	SumMulti sumInst;
	int start, end;
	
	public MultiAdderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	
	/*
	 쓰레드를 통해 반복해서 공유객체인 sumInst의 addNum()을 호출
	따라서 동시에 접근되는 경우 발생
	동기화가 처리되지 않아 잘못된 결과 출력
	 */
	public void run() {
		for( int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync1Error {

	public static void main(String[] args) {
		
		SumMulti s = new SumMulti();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		
		try {
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~10000까지의 합: " + s.getNum());
	}

}
