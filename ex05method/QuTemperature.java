package ex05method;

import java.util.Scanner;

//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 
//화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수

public class QuTemperature {
	
	static double c2f(double celcius) {
		double fahrenheit = (1.8 * celcius) + 32;
		//System.out.println("화씨: " + fahrenheit + "F");
		
		return fahrenheit;
	}
	
	static double f2c(double fahrenheit) {
		double celcius = (fahrenheit - 32)/ 1.8;
		//System.out.println("섭씨: " + celcius +"C");
		
		return celcius;
	}

	public static void main(String[] args) {
		System.out.println("섭씨와 화씨온도 변환기입니다. 기능을 선택하세요");
		System.out.println("섭씨->화씨(1)/ 화씨->섭씨(2)");
		Scanner scanner = new Scanner(System.in);
		int convert = scanner.nextInt();
		System.out.println("온도를 입력하세요");
		double temp = scanner.nextDouble();
		
		switch(convert) {
		case 1:
			System.out.println(c2f(temp)); break;
		case 2:
			System.out.println(f2c(temp)); break;
		}
	}

}
