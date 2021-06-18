package ex04ControlStatement;

import java.io.IOException;
import java.util.Scanner;

/*
 하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여 
 숫자라면 2의배수인지를 다시 판단하여서 2의배수인 경우에만 "2의 배수 입니다"라고 출력. 
그 외에는 "2의 배수가 아닙니다" 라고 출력한다.
힌트] '0'의 아스키코드값은 48 입니다. 
(System.in.read()를 사용하세요)

 */

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자 하나를 입력하세요.");
		int check = System.in.read();
		
		//boolean isNumber \(ascii>\ '0'&& ascii <= '9');
		//if(isNumber == true)
		if(check >= 48 && check <= 57) {
			System.out.println("입력한 문자는 숫자입니다.");
			if(check % 2 == 0) {
				System.out.println("입력한 숫자는 2의 배수입니다.");
			}
			else {
				System.out.println("입력한 숫자는 2의 배수는 아닙니다.");
			}
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
	}
	
// 숫자형 문자가 갖는 아스키코드값에서 48(0의 아스키코드 값)을 빼면
	// 해당 문자의 정수가 되다.
	// 즉, '4' - '0' = 4(정수)
	
}
