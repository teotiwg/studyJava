package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 Java에서 제공하는기본함수형 인터페이스는 아래 4가지가 있다
 차이점이라면 매개변수의 유무,리턴값의유무정도다
 Predicate : 매개변수 0, 리턴값 Boolean
 Supplier : 매개변수 X, 리턴값 O
 Consumer : 매개변수 O, 리턴값X
 Function : 매개변수, 리턴 값 둘 다 있음
 */
public class Ex06Define1Predicate {

	public static void main(String[] args) {
		/*
		 Predicate 
		 - 사전적 의미: ~에 근거를 두다
		 - 매개변수와 boolean 리턴값이 있는 textXXX()계열의 메소드가 있음
		 - 파라미터를 조사해 true or false 리턴
		 
		 Interface Predicate<T>{
		 	boolean test(T t);
		 }
		 */
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		/*
		 전달된 Human객체를 대상으로 성별이 "남"인 경우에 
		 true를 반환하는 람다식 정의 
		*/
		Predicate<Human> pre = (Human h) -> {
			return h.getGender().equals("남");
		};
		System.out.println("p.test(p1) => " + pre.test(p1)); // 남자이므로 true
		System.out.println("p.test(p2) => " + pre.test(p2)); // false 반환
		
		System.out.println("==============================");
		
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		// 인자로 주어진 객체를 List컬렉션으로 반환해줌
		List<Human> list1 = Arrays.asList(p1, p2, p3, p4);
		
		// 남/여를 판단하는 람다식을 매개변수로 전달
		double maleAvg = avg(a -> a.getGender().equals("남"), list1);
		System.out.println("남자 평균: " + maleAvg);
		
		double femaleAvg = avg((Human b) -> b.getGender().equals("여"), list1);
		System.out.println("여자 평균: " + femaleAvg);
		
		System.out.println("==============================");
	}
	/*
	매개변수로 성별을 판단하는 람다식과 List 컬렉션을 전달받아 평균값을 반환하는 메소드 
	 */
	public static double avg(Predicate<Human> ph, List<Human> li) {
		int pCount = 0;
		int tCount = 0;
		for(Human h : li) { // 컬렉션의 크기만큼 반복
			if(ph.test(h) == true) { // 성별 판단
				pCount++; // 지정된 성별에 맞는 인원수 증가
				tCount += h.getScore(); // 점수 합산
			}
		}
		// 평균값 계산 후 반환
		return (double)tCount/pCount;
	}
}
