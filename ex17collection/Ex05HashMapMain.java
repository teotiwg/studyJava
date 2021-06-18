package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 HashMap<K,V>:
 	Map<T>인터페이스를 구현한 컬렉션 클래스로
 	- Key, Value 한 쌍으로 객체 저장
 	- 키 값은 중복 불가. 중복될 경우 덮어쓰기로 처리
 	- 키 값으로 검색하므로 다른 컬렉션보다 속도가 빠름
 */

public class Ex05HashMapMain {

	public static void main(String[] args) {
		
		// Map컬렉션 생성. Key와 Value는 둘다 String형으로 선언
		HashMap<String, String> map = new HashMap<String,String>();
		
		/*
		 객체저장:
		 	객체저장 시 기존에 저장된 동일한 Key값이 존재하면 이저네 저장된 객체가  반환됌
		 	만약 처름 입력이라면 null값 반환
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값: " + map.put("name", "홍길동"));
		
		int number = 20;
		//map.put("age", number); -> value타입이 맞지 않음
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("adddress", "가산디지털단지");
		
		// Map에 저장된 객체 수 반환
		System.out.println("저장된 객체 수: " + map.size());
		
		/*
		 중복저장:
		 	기존에 입력된 name키값이 있으므로 "홍길동" 출력됌
		 	그리고 기존의 값이 "최길동"으로 갱신
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값: " + map.put("name","최길동"));
		System.out.println("키값으로 중복저장후 객체 수: " + map.size());
		
		/*
		 출력하기
		 	1. 키값을 알고 있을 때: get(키값)으로 출력
		 */
		System.out.println("키값을 알 때: " + map.get("name"));
		
		/*
			2. 키값을 모를 때: keySet()메소드를 호출하여 키값을 Set컬렉션으로 얻어온다
				해당 반환값을 확장for문을 통해 추출하고, 이로 값을 출력 가능
				* Map계열의 컬렉션은 처음보터 확장for문을 사용하는 것이 불가능
				  아래처럼 key값을 먼저 얻어온 후 사용해야 함
		 */
		Set<String> keys = map.keySet();
		System.out.println("[확장 for문 적용]");
		for(String key : keys) { 
			String value = map.get(key); 
			System.out.println(String.format("%s : %s", key, value));
		}
		
		/*
			3.이터레이터를 통한 출력:
				이터레이터를 통해 출력할 때도 keySet()을 통해 먼저 key값을 얻어온 후 반복
		 */
		System.out.println("[반복자 사용하기]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next(); // 키값 얻기
			String value = map.get(key); // 밸류값 얻기
			System.out.println(String.format("%s : %s", key, value));
		}
		// Value만 얻어와야 할 때: values()메소드 사용
		System.out.println("[value값들만 출력]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		/*
		 존재유무확인:
		 	Key 혹은 value가 존재할 경우, true 반환
		 */
		System.out.println(map.containsKey("name")? "name키값 있다":"name키값 없다");
		System.out.println(map.containsKey("account")? "account키값 있다":"account키값 없다");
		System.out.println(map.containsKey("남자")? "남자 있다":"남자 없다");
		System.out.println(map.containsKey("여자")? "여자 있다":"여자 없다");
		
		// 삭제: key를 통해 삭제하고, 삭제되면 해당 value가 반환
		System.out.println("삭제된 객체: " + map.remove("age"));
		System.out.println("[age키값을 삭제 후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s : %s", key, map.get(key)));
		}
		
		// 전체삭제: removeAll()은 없음. clear()만 사용가능
		map.clear();
		System.out.println("전체 삭제 후 객체 수: " + map.size());
		
	}

}
