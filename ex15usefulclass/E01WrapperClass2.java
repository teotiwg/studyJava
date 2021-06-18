package ex15usefulclass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		// parseInt(): 숫자형식의 문자열을 숫자로 변경
		String strNumber = "1000";
		System.out.println("10 + strNumber = " + (10 + strNumber));
		System.out.println("10 + strNumber를 숫자로 변경: " + (10 + Integer.parseInt(strNumber)));
		System.out.println("10 + strNumber를 숫자로 변경: " + (10 + Integer.valueOf(strNumber)));
		
		// 문자열을 숫자로 변경할 땐 반드시 숫자형식만 와야 함
		// "원"은 숫자가 아니므로 예외 발생
		String money = "120원";
		//System.out.println("120원: " + Integer.parseInt(money));
		
		String floatString = "3.14";
		//System.out.println(Integer.parseInt(floatString));
		System.out.println("실수형(float)형으로 변경: "+ Float.parseFloat(floatString));
		System.out.println("실수형(double)형으로 변경: "+ Double.parseDouble(floatString));
		
		/*
		 Character클래스의 주요메소드:
		- codePointAt(): 문자열에서 index에 해당하는 한 문자의 아스키코드 값 반환

		 */
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		// isDigit(): 인자로 전달된 문자가 숫자인지 판단. 숫자일 때 true 반환
		System.out.println("isDigit()을 통한 숫자판단");
		System.out.println(Character.isDigit('A')? "숫자임":"숫자 아님");
		System.out.println(Character.isDigit(50)? "숫자임":"숫자 아님");
		System.out.println(Character.isDigit('7')? "숫자임":"숫자 아님");
		
		//isLetter(): 문자인지 여부 판단. 숫자나 특수기호는 False 반환
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		// 
		System.out.println("isWhitespace()메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가'));
	}

}
