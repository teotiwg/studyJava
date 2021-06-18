package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex06Define4Function {
/*
 Function<T, E> :
 	매개변수와 리턴값을 둘 다 보유한 apply() 메소드 보유
 	개발자가 가장 많이 사용하는 함수형 인터페이스
 	
 */
	public static void main(String[] args) {
		
		Function<String, Integer> func = (String s) -> {
			return s.length();
		};
		
		System.out.println("Lambda 문자열 길이= " + func.apply("Lambda"));
		System.out.println("LambdaExpression 문자열 길이= " + func.apply("LambdaExpression"));
		
		System.out.println("====================");
		
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		List<Human> list = Arrays.asList(p1, p2, p3, p4);
		
		 //Human 객체를 매개변수로 받아 해당 객체의 점수를 반환하는 람다식 
		Function<Human, Integer> getFunction = (Human h) ->{
			return h.getScore(); // Human 객체의 score값 반환
		};
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수: " + score);
		
		System.out.println("### list에 저장된 객체의 점수 출력");
		for(Human h : list) {
			System.out.println(h.getName() + "의 점수: " + getFunction.apply(h));
		}
	}

}
