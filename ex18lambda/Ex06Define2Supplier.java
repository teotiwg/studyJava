package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
/*
 Supplier<T> :
 공급자란 의미로,
 매개변수는 없으나 리턴값은있는 getXXX()메소드가 정의됌
 주로 실행 후 생성한 데이터 반환
 */
public class Ex06Define2Supplier {
/*
 100 이하의 난수를 생성하는 람다식과
 정수를 인수로 받아 정수만큼의 난수를 생성한 후 List컬렉션으로 반환 
 */
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt){
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 1; i <= cnt; i++) {
			// 매개변수로 전달된 람다식 s를 통해 난수 생성 후 리스트 컬렉션에 저장
			li.add(s.get());
		}
		return li;
	}
	
	public static void main(String[] args) {
		/*
		 Interface Supplier<T>{
		 	T get();
		 }
		 */
		// 100 이하의 난수 생성 람다식
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		int rNum = sup.get();
		System.out.println("생성된 난수= "+rNum);
		// 10개의 난수 생성 후 List컬렉션으로 반환받음
		List<Integer> list = makeRandomNum(sup, 10);
		System.out.println("### print문으로 출력1");
		System.out.println(list);
		
		System.out.println("### foreach문으로 출력2");
		for(Integer i : list) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		System.out.println("###이터레이터로 출력3");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

}
