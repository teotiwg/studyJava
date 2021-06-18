package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
 HashSet컬렉션:
 	Set계열의 인터페이스를 구현한 컬렉션
 	- 객체가 순서 없이 저자됌
 	- 객체의 중복저장 미허용
 	단, 기본클래스가 아닌 새롭게 정의한 클래스라면
 	hashCode(), equals()를 적절히 오버라이딩하여 정의 필요
 	- List가 배열의 성격이라면, Set은 집합의 성격
 */

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		// Set컬렉션 생성.
		HashSet<Object> set = new HashSet<Object>();
		
		String strObject1 ="JAVA";
		String strObject2 = new String("KOSMO 61기");
		Date dateObject = new Date();
		int number = 100;
		Teacher teacher = new Teacher("김봉두", 55, "체육");
		
		/*
		 객체 저장:
		 	add()메소드를 통해 저장되고, 문제가 없다면 true 반환
		 */
		System.out.println(set.add(strObject1));
		set.add(strObject2);
		set.add(dateObject);
		set.add(number); // <- Integer객체로 Boxing 처리 후 저장
		set.add(teacher);
		
		// 저장된 객체 수 출력: 5개
		System.out.println("[중복저장 전 객체 수]: " + set.size());
		
		/*
		 기본클래스형의 객체 중복 저장:
		 	기본클래스인 경으 별도의 오버라이딩 처리 없이도 중복이 제거
		 	따라서 아래의 경우 false 반환
		 */
		System.out.println(set.add(strObject2)? "저장 성공" : "저장 실패");
		System.out.println("[중복 String 저장 후 객체 수]: " + set.size());
		
		/*
		 개발자가 직접 정의한 객체의 중복저장:
		 	사용자 정의 클래스인 경우, hashCode, equals메소드를 오버라이딩하지 않으면 중복저장 허용됌
		 	아래의 경우 저장에 성공하여 true 반환
		 */
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)? "성공":"실패");
		System.out.println("[중복 teacher2 저장 후 객체 수: " + set.size()); // 6개 출력
		
		/*
		 저장된 객체 출력하기:
		 	순서 없이 저장되므로 출력의 순서도 지정불가
		 */
		Iterator itr = set.iterator(); // 이터레이터 객체 생성 및 준비
		while(itr.hasNext()) { // 추출할 객체가 있는지 확인 후
			Object object = itr.next(); // 추출
			
			if(object instanceof String) {
				System.out.println("String타입: " + object);
			}
			else if(object instanceof Date) {
				System.out.println("Date타입: " + object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer타입: " + object);
			}
			else if(object instanceof Teacher) {
				System.out.println("Teacher타입: " + ((Teacher)object).getInfo());
			}
			else {
				System.out.println("넌 뭐임?");
			}
		}
		
		// 객체의 존재여부 확인
		System.out.println(set.contains(strObject1)? "strObject1 있다":"strObject1 없다");
		System.out.println(set.contains("JAVA")? "JAVA 있다":"JAVA 없다");
		
		// 객체 삭제
		System.out.println(set.remove(strObject2)? "strObject2삭제 성공":"strObject2삭제 실패");
		System.out.println(set.remove("ANDROID")? "ANDROID삭제 성공":"ANDROID삭제 실패");
		
		// 전체 삭제
		set.clear();
		System.out.println("[삭제 후 객체 수] " + set.size());
		System.out.println("전체삭제: " + set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수] " + set.size());
		
	}

}
