package ex04ControlStatement;

public class E01If03 {

	public static void main(String[] args) {
		int kor = 99, eng = 70, math = 64;
		double avg = (kor + eng + math) / 3.0;
		System.out.println("평균 점수는(그대로) : " + avg);
		System.out.printf("평균점수는(소수2자리) : %.2f\n", avg);
		
		
		if(avg >= 90) {
			System.out.println("A학점");
		}
		else if(avg >= 80) {
			System.out.println("B학점");
		}
		else if(avg >= 70) {
			System.out.println("C학점");
		}
		else if(avg >= 60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고");
		}
		//
		// 조건의 구간 설정에 따라 결과가 완전 다르게 나올 수 있으므로 주의 필요
		System.out.println("잘못된 조건의 if문");
		if(avg >= 60) {
			System.out.println("D학점");
		}
		else if(avg >= 70) {
			System.out.println("C학점");
		}
		else if(avg >= 80) {
			System.out.println("B학점");
		}
		else if(avg >= 90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고");
		}
	}

}
