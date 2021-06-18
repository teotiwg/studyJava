package ex07;

public class E02StringMethod {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "Welcome to Java";
		String str2 = "자바야 놀자!";
		
		/* length()
			: 문자열의 길이 를 반환
		 */
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		/* charAt(인덱스)
		 	: 문자열에서 특정 인덱스에 해당하는 문자 하나를 반환
		 */
		System.out.println("str1의 두번째 문자: " + str1.charAt(1));
		System.out.println("str2의 두번째 문자: " + str2.charAt(1));
		
		String juminNum = "190419-5000000";
		// 문자열에서 문자를 뽑아 비교하므로 싱글쿼테이션을 사용
		if(juminNum.charAt(7) == '1' || juminNum.charAt(7) == '3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7) == '2' || juminNum.charAt(7) == '4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7) == '5' || juminNum.charAt(7) == '6') {
			System.out.println("외국인입니다.");
		}
		else
			System.out.println("주민번호가 잘못됐습니다.");
		
		// compareTo() : 
		// 두 문자열의 첫 문자부터 순차적으로 비교하면서 
		// 앞 문자열의 아스키코드가 크면 양수를 반환
		// 뒷쪽 문자열의 아스키코드가 크면 음수 반환
		// 같으면 0 반환
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		System.out.println("ABC".compareTo("ABC") == 0 ? "문자열이 같다" : "문자열이 다르다");
		
		// concat()
		//	: 두 개의 문자열을 연셜할 때 사용. + 기호와 동일한 역할 (많이 안 씀)
		System.out.println("Java".concat(" World").concat(" Go"));
		System.out.println("Java" + " World " + "Go");
		
		// contains()
		//	: 문자열에 특정 문자열이 포함되어 있는지를 판단하여 포함됐으면 true 반환
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		
		String email1 = "hong@kosmo.co.kr";
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else {
			System.out.println("이메일 형식 아님");
		}
		
		// endWith()
		// 	: 문자열이 특정 문자열로 끝나면 true, 아니면 false 반환
		// startWith()
		// 	: 특정 문자열로 시작하며 true 반환
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		// fotmat()
		//	: 출력형식을 지정하여 문자열로 반환하고 싶을 때 사용
		//	  printf()와 사용법은 동일, 주로 웹어플리케이션(JSP)를 제작할 떄 많이 사용
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", 81, 92, 100);
		String formatStr = String.format("국어: %d, 영어: %d, 수학: %d\n", 81, 92, 100);
		System.out.println(formatStr);
		
		// indexOf()
		//	: 문자열에서 특정 문자열의 시작 인덱스를 반환
		//	  만약 찾는 문자열이 없다면 -1 반환
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println(email1.indexOf("@") != -1? "이메일 형식 맞음" : "이메일 형식 아님");
		
		// -(하이픈)의 위치를 찾아 +1하면 성별에 해당하는 문자를 가져올 수 있음
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-") + 1;
		if(juminNum.charAt(index) == 3) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		// lastIndexOf()
		//	: 사용법은 indexOf()와 동일하나 문자열의 뒤에서부터 문자열을 찾아서 인덱스 반환
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf: " + str1.indexOf("a"));
		System.out.println("lastIndexOf: " + str1.lastIndexOf("a"));
		
		// replace
		// 	: 특정 문자열을 찾아서 지정된 문자열로 변경
		//	 만약 찾는 문자열이 없다면 변경되지 않을 뿐 에러가 발생하지는 않음
		System.out.println("J를 G로 변경하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("Java를 Kosmo로 변경하기");
		System.out.println(str1.replace("Java", "Kosmo"));
		
		// split()
		//	: 문자열을 구분자로 통해 분리해서 String타입의 배열로 반환
		//	 해당 구분자가 없는 경우엔 크기가 1인 배열로 반환
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i = 0; i < phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
		}
		
		phoneArr = phoneNumber.split("%");
		for(int i = 0; i < phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
			
		// substring()
		// : 시작인덱스와 끝인덱스 사이의 문자열을 잘라서 반환. 문자열 자를 때 쓰는 메소드
		//	사용1) substring(index) : 이 경우 index부터 문자열의 끝까지 잘라서 반환
		//	사용2) substring(index1, index2) : 인덱스에 해당하는 부분만 잘라서 반환 
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		
		String filename = "my.file.images.jpg";
		int beginIndex = filename.lastIndexOf(".") + 1;
		System.out.println("파일의 확장자는: " + filename.substring(beginIndex));
			
		}
		
	}

}
