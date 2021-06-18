package ex16exception;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 런타임에러
-컴파일 시에는 체크되지 않고 실행시에만 발생하는 에러
-메인 메소드에서 무시하기 위해 throw하더라도 오류가 발생하므로 반드시 예외처리를 해줘야 함
-예외발생 시 jvm은 해당 예외클래스를 인스턴스화해서 프로그램쪽으로 전달하게 되고 try~catch에서 받은 후 예외 처리

 */

public class Ex01ExceptionBasic2 {

	static Date toDay;
	
	public static void main(String[] args) {
		
		//배열의 크기를 벗어난 인덱스를 사용했을 때 발생하는 예외
		System.out.println("### ArrayIndexOutOfBoundsException ###");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은: " + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은: " + intArr[1]);
			intArr[2] = 300;
			System.out.println("앗 이방은?" + intArr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			System.out.println("예외메세지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("0번방 재출력: " + intArr[0]);
		System.out.println("==ArrayIndexOutOfBoundsException발생 후==");
		System.out.println("### NumberFormatException ###");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("나이를 입력하세요: ");
			String strAge = sc.nextLine();
			int ageAfter10 = Integer.parseInt(strAge) + 10;
			System.out.println("당신의 10년 후 나이는: " + ageAfter10);
		}
		catch(NumberFormatException e) {
			System.out.println("나이는 숫자로만 입력하세요");
			System.out.println("예외 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("### InputMismatchException");
		
		try {
			System.out.println("나이를 입력하세요: ");
			int intAge = sc.nextInt();
			int ageAfter10 = intAge + 10;
			System.out.println("당신의 10년 후 나이는: " + ageAfter10);
		}
		catch(InputMismatchException e) {
			System.out.println("나이를 문자형태로 입력하면 앙대여");
			System.out.println("예외메시지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("### NullPointerException ###");
		System.out.println("toDay = " + toDay);
		try {
			System.out.println(toDay.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메시지: " + e.getMessage());
		}
		
		/*
		 ArithmeticException: 수학적 계산이 불가능할 때 발생
		 */
		System.out.println("### ArithmeticException ###");
		int result = 10;
		try {
			result = result / 0;
			System.out.println("결과는: " + result);
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("예외메시지: " + e.getMessage());
		}
		
		/*
		 ClassCastException: 형변환이 불가능할 때 발생
		 */
		Object object = new Object();
		try {
			// 순수한 Object객체이므로 형변환 불가
			String strObject = (String)object;
		}
		catch(ClassCastException e) {
			System.out.println("형변환할 수 없습니다.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==ClassCastException 발생 후==");
		
		
		System.out.println("끝");
		
		String str = "형변환되나요?";
		boolean castFlag = myClassCasting(str);
		if(castFlag == true)
			System.out.println("됍니다");
		else
			System.out.println("ㄴㄴ");
		
	}//end of main
	
	/*
	 String 객체가 인자로 전달되면서 매개변수를 통해 Object로 형변환되기 때문에
	 여기서 상속관계가 확인돼 매개변수 o는 String으로의 형변환이 가능해짐
	 */
	public static boolean myClassCasting(Object o) {
		if(o instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
