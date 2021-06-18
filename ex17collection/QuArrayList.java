package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 사용자로부터 이름을 입력받아 
 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 알아내서 
 해당 인덱스로 그 객체를 삭제하고 
 삭제된 객체의 정보(이름,나이,학번)를 출력
 
 실행결과]
검색할 이름을 입력하세요:가길동
오버라이딩 한 equals() 호출됨:가길동
[검색되었습니다]
[삭제후 정보출력]
이름:나길동, 나이:20, 학번:2017
이름:다길동, 나이:30, 학번:2016
이름:마길동, 나이:40, 학번:2015

 */

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		//LinkedList<Student> list = new LinkedList<Student>();
		
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		System.out.print("검색할 이름을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		String find = scan.nextLine();
		int index = 0;

		for(Student student : list) {
			if(student.getName().equals(find)) {
				index = list.indexOf(student);
				System.out.println("검색됐습니다.");
				break;
			}
			else
				System.out.println("검색 결과가 없습니다.");
		}
		list.remove(index);
		
		System.out.println("[삭제 후 정보 출력]");
		for(Student obj : list) {
			obj.showInfo();
		}
	}

}
