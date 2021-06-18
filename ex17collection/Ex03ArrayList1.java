package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 ArrayList<E> : List계열의 컬렉션
 - 데이터의 중복저장이 허용됌
 - 데이터의 저장 순서 보장
 - 데이터 접근 시 get() 혹은 iterator() 이용
 - Array라는 이름처럼 '배열'의 특성을 가져서 index를 통한 저장 및 접근 가능
 */

public class Ex03ArrayList1 {
	
	public static void main(String[] args) {
		
		//ArrayList<Object> list = new ArrayList<Object>();
		//ArrayList list = new ArrayList();
		/*
		 만약 위와 같이 타입매개변수 부분을 생략하거나 Object로 설정하면
		 모든 객체를 저장할 수 있는 컬렉션으로 정의 가능
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		/*
		 객체 저장: add() 메소드
		 	add(객체) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여
		 	add(인덱스, 객체): 인덱스를 직접 부여하여 객체 저장
		 	 				단, 인덱스를 건너뛰면 예외 발생
		 	size(): 컬렉션에 저장된 객체의 갯수 반환. 배열의 크기와 동일한 개념
		 */
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3, "워너원");
		//list.add(5, "소방차"); // 에러 발생 (인덱스를 건너뛸 수 없기 때문)
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "BTS");
		System.out.println("중복저장 전 객체 수: " + list.size());
		
		/*
		 중복저장:
		 	List는 배열의 속성을 가지므로 데이터 중복 허용
		 	add()메소드는 추가에 성공한 경우 true 반환
		 */
		
		System.out.println(list.add("트와이스")? "중복저장됨":"중복저장 안됌");
		System.out.println("중복저장 후 객체 수: " + list.size());
		
		/*
		 리스트 컬렉션 출력하기(일반 for문, 확장 for문):
		 	컬렉션 다룰 때는 주로 확장 for문 사용
		 	
		 	get(인덱스): 인덱스에 해당하는 객체 반환
		 */
		System.out.println("\n[일반 for문 사용]");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		System.out.println("\n[확장 for문 사용]");
		for(String obj : list) {
			System.out.println(obj + " ");
		}
		
		/*
		 Iterator 사용법:
		 	1. 컬렉션에 저장된 내용을 Iterator에 알려주기 위해 객체 생성
		 	2. hasNext()로 반환할 객체가 있는지 검사하고, next()로 해당 객체 반환
		 	3. 모든 객체가 반환됐다면 false 반환
		 	
		 */
		
		System.out.println("\n[반복자(Iterator) 사용]");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println("\n========================\n");
		
		/*
		 덮어쓰기:
		 	기존 내용을 변경, 기존 내용은 삭제됌
		 	set(인덱스, 객체)
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println("\n========================\n");
		
		/*
		 끼워넣기(삽입):
		 	add(삽입할 인덱스, 객체)
		 	-> 해당 인덱스에 삽입하고, 기존 데이터는 자동으로 뒤로 밀리게 됌
		 */
		list.add(4, "블랙핑크>끼워넣기");
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println("\n========================\n");
		
		/*
		 포함여부 확인
		 	contains(객체): 찾고자 하는 객체가 있는 경우 true 반환
		 	위치한 인덱스까진 확인 불가. 있는지만 앎
		 */
		System.out.println(list.contains("빅뱅")? "빅뱅 있음" : "빅뱅 없음");
		System.out.println(list.contains("블랙핑크")? "블랙핑크 있음" : "블랙핑크 없음");
		
		/*
		 삭제:
		 방법1. 인덱스로 삭제하기
		 	remove(인덱스): 인덱스 통해서 삭제를 진행한 후 완료되면 해당 객체 반환
		 	삭제 후에는 인덱스가 자동으로 재부여.
		 	삭제 성공 시 해당 객체를 반환하므로 어떤 객체가 삭제됐는지 확인 가능
		 */
		Object obj = list.remove(2);
		System.out.println("삭제된 객체: " + obj);
		
		// 방법2. indexOf()를 통해 인덱스를 찾은 후 삭제
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index = " + index);
		list.remove(index);
		
		// 방법3. 인스턴스의 참조값을 통해 삭제
		System.out.println(list.remove("방탄소년단")? "삭제성공":"삭제실패");
		list.remove("오마이걸");
		System.out.println("삭제 후 출력");
		for(Object ob : list) {
			System.out.println(ob + " ");
		}
		System.out.println();
		
		// 전체 삭제
		list.removeAll(list); // 방법1
		list.clear(); // 방법2
		System.out.println("전체 삭제 후 객체 수: " + list.size());
		
	}
	
}
