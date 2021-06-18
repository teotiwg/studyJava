package ex07;

/*
 String Buffer 클래스
 	: String 클래스는 기존 문자열에 새로운 문자열을 추가하면 새롭게 생성된 메모리에 문자열을 저장
 	기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기 위해,
 	문자열의 변경이 많은 경우라면 StringBuffer클래스를 주로 사용
 	해당 클래스는 기존 메모리의 문자열을 변경하는 방식으로 문자열을 추가
 */

public class E03StringBuilderBuffer {

	public static void main(String[] args) {
		
		// append() : 문자열의 끝에 새로운 문자열을 연결
		// insert(): 지정한 인덱스 위치에 문자열을 삽입
		
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf = " + strBuf);
		
		System.out.println("String과 StringBuffer의 " + "참조값 비교");
		String str1 = "코스모";
		String str2 = "코스모";
		if(str1 == str2) {
			System.out.println("연결 전: 주소값 동일");
		}
		else
			System.out.println("연결 전: 주소값 다름");
		
		str1 = str1+ " 영원하라";
		if(str1 == str2)
			System.out.println("연결 후: 주소값 동일");
		else
			System.out.println("연결 후: 주소값 다름");
		
		// 기존의 메모리를 유지하면서 버퍼의 크기를 조절
		StringBuffer buf = new StringBuffer();
		System.out.println("buf = " + buf);
		System.out.println("저장된 문자열 크기" + buf.length());
		System.out.println("기본 버퍼 크기" + buf.capacity());
		
		buf.append("금일은 StringBuffer 공부중임").append("오늘은 월욜^^");
		System.out.println("buf = " + buf);
		System.out.println("저장된 문자열 크기: " + buf.length());
		System.out.println("기본버퍼크기" + buf.capacity());
	}

}
