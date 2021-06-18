package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t 벚꽃~~!");
		
		// 줄바꿈(line feed) 기능
		System.out.print("KOSMO에 오신걸 환영합니다.\n");
		System.out.print("열심히\n해봅시다.\n");
		
		
		// 더블 쿼테이션을 표현하고 싶을 때 사용
		//System.out.println("나는 "개발자"가 되고 싶어요");
		System.out.println("나는 \"개발자\"가 되고 싶어요.");
		
		
		// printf() : 문자열을 서식에 맞춰 출력 시 사용.
		// 정수는 %d, 실수는 %f, 
		int kor = 81,eng = 97, math = 79;
		
		System.out.printf("국어: %d, 영어 : %d, 수학 : %d%n", kor, eng, math);
		System.out.println("\n국어 :" + kor + ", 영어 : " + eng + ", 수학 : " + math);
		
		// 자릿수 지정
		// 예) %4d -> 정수 출력시 전체 자리를 4자리로 표현
		//    %6.2f -> 실수 출력 시 전체 자리를 6자리, 소수 이하 2자리로 표현
		// 양수는 우측 , 음수는 좌측 정렬
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균점수 :%f%n", avg);
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d," + " 평균 : %f%n", kor, eng, math, avg);
		System.out.printf("국어 : %6d, 영어 : %6d, 수학: %6d, " + "평균: %7.2f%n", kor, eng, math, avg);
		System.out.printf("국어 : %-6d, 영어 : %-6d, 수학: %-6d, " + "평균: %-7.2f%n", kor, eng, math, avg);
		
	}

}
