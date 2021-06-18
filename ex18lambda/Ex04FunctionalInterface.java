package ex18lambda;
/*
	함수형 인터페이스:
	람다식을 구현하기 위해선 먼저 인터페이스를 만들고
	람다식으로 구현할 추상메소드 선언
	이를 람다식으로 만들기 위한 함수형 인터페이스라 함
	* 함수형 인터페이스에는 오직 하나의 추상메소드만 선언 가능 

 	@FunctionalInterface :
 	함수형 인터페이스의 조건을 갖추었는지에 대한 검사를
 	컴파일러에 요청하는 역할을 하는 어노테이션

*/
@FunctionalInterface
interface IKosmo4{
	void studyLambda(String str);
}

public class Ex04FunctionalInterface {
	/*
	매개변수의 타입이 IKosmo4를 구현한 람다식 자체를 전달하여
	해당 함수에서 studyLambda()를 호출할 수 있게 됌 
	*/
	static void execute(IKosmo4 ko, String s) {
		ko.studyLambda(s);
	}

	public static void main(String[] args) {
		// IKosmo4를 이용한 람다식 정의
		IKosmo4 kosmo = (str) ->
			System.out.println("IKosmo4를 구현받아 정의한 람다" + str);
		
		// 앞에서 정의한 람다식을 인수로 전달
			execute(kosmo, "\n람다를 매개변수로 전달");
	}

}
