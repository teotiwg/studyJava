package ex04ControlStatement;

import java.io.IOException;

//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
//(System.in.read()를 사용하세요)


public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자를 하나 입력하시오. ");
		int num = System.in.read();
		
		// String resultStr = (num >= '0' && num <= '9')? "숫자" : "숫자 아님";
		// System.out.print(resultStr);
		
		String yesNum = "숫자입니다.";
		String noNum = "숫자가 아닙니다.";
		
		String check = (num >= 48 && num <= 57)? yesNum : noNum;
		System.out.print(check);
		
	}

}
