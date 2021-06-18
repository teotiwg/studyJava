package ex05method;

public class E03MethodType02_1 {
	
	static int noParamYesReturn() {
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
		}
		return sum;
	}
	
	// static으로 호출된 메소드는 static으로 선언된 메소드만 호출 가능
	public static void main(String[] args) {
		
		//반환값이 있는 메소드는 주로 프린트문 안에서나,
		//변수의 할당을 위해 코드의 우측에서 호출

		System.out.println("1~10까자의 합: " + noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.printf("1에서 10까지의 합은 %d입니다.", sum10);
	}

}
