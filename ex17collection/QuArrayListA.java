package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayListA {

	public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름 입력");
		String deleteName = scan.nextLine();
		
		int index = -1;
		// 배열/컬렉션 인덱스는 0부터 시작이므로 인덱스 초기값은 -1로
		//2.확장for문으로 컬렉션 전체를 접근
		for(Student st: list) {
			if(deleteName.equals(st.getName())) {
					index = list.indexOf(st);
					break;
			}
		}
		
		//3.검색결과 유/무에 따라 
		if(index == -1) {
			System.out.println("검색결과 없음");
		}
		else {
			list.remove(index).showInfo();
		}
		/*
		 컬렉션에 저장딘 객체를 인덱스를 통해 삭제하면
		 삭제된 객체 자체를 반환하므로 멤버메소드를 바로 호출 가능
		 */
		
		//4.전체정보 출력

		
		
		
	}

}
