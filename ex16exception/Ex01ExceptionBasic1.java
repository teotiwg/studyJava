package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args) throws IOException {
		
		/* 구문 에러(syntax error)
		 * 실행 자체가 안되는 코드로 오류를 수정해야만 정상 실행 됌
			즉 코드에 문법적 오류가 발생됐음을 의미
		Int number = 10;
		if(true);{}
		else {}
		*/
		
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다.");
		}
		
		System.out.println("문자 하나를 입력하세요: ");
		int iChar = System.in.read();
		
		/*
		 방법1) 메인함수 밖으로 예외를 던짐 이를 "예외던지기"라 함
				내부에서 예외를 처리 않고 무시하겠단 의미
				이런 경우 main() throws IOException 형태로 작성
				
		방법2)
			예외가 발생한 지점을 try~catch문으로 직접 예외 처리
		 */
		
		try{
			iChar = System.in.read();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}
