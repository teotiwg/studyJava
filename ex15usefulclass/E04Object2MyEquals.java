package ex15usefulclass;

/*
 equals()메소드
- 자바에서 인스턴스의 내용 비교를 위해 비교연산자(==)를 사용하는 건
  단순 참조값에 대한 비교이므로 실제 내용에 대한 비교는 이뤄지지 않음
- 인스턴스 간의 내용 비교를 위해선 equals()메소드를 각 클래스에 맞게 오버라이딩하여 사용해야 함
- String과 같은 기본클래스는 별도의 오버라이딩 없이도 내용 비교 가능

 */

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	
	// equals()메소드가 어떻게 인스턴스 간의 내용을 비교하는지 설명하기 위한 코드로 구성됌
	public boolean myEquals(IntNumber numObj) {
		if(this.num == numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class E04Object2MyEquals {

	public static void main(String[] args) {
		
		String str1 = new String("우린 KOSMO");
		String str2 = "우린 KOSMO";
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		}
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.myEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3은 동일한 정수");
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
	}

}
