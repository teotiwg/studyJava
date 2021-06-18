package ex12Inheritance;

/*
 가변인자(Variable Argument):
 	메소드 오버로딩을 대체할 수 있는 문법으로 하나의 메소드로 여러가지 호출 형식을 대체 가능
 	
 	형식)
 		메소드명(자료형 ... 매개변수명){
 			실행문;
 		}
 	
 	- 필요에 따라 매개변수를 가변적으로 조정가능한 문법으로 JDK1.5에서부터 지원
 	- 매개변수는 여러 개를 한꺼번에 받아야 하므로 배열로 반환
 */

public class E08VariableArgument {
	/*
	static int getTotal(int param) {
		int total = 0;
		total += param;
		return total;
	}
	
	static int getTotal(int param1, int param2) {
		int total = 0;
		total += (param1 + param2);
		return total;
	}*/
	
	/*
	 가변인자를 통한 메소드 정의 시 매개변수가
	 */
	
	/*static int getTotal(int param1, int param2, int param3) {
		int total = 0;
		total += (param1 + param2 + param3);
		return total;
	}*/
	
	static int getTotal(int ... param) {
		int total = 0;
		for(int i = 0; i <param.length; i++) {
			total += param[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println("getTotal(args1) 호출: " + getTotal(10));
		System.out.println("getTotal(args1, args2) 호출"+ getTotal(10, 20));
		System.out.println("getTotal(args1, args2, args3) 호출"+ getTotal(10, 20, 30));
		System.out.println("getTotal(매개변수 6개) 호출:" + getTotal(10, 20, 30, 40, 50, 60));
		
		// 매개변수의 타입이 double이므로 포함되어 호출 불가능
		//System.out.println("getTotal(args1, args2)호출: "+ getTotal(10, 20.3));
	}

}
