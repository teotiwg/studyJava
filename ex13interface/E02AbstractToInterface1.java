package ex13interface;

/*
 추상클래스
- 상속을 목적으로 제작되므로 객체생성을 미허용
- 추상클래스는 대부분 추상메소드를 포함하고 있으므로 
이를 상속받는 클래스는 반드시 추상메소드를 오버라이딩해야 함
- 클래스의 상속관계에서의 설계도 역할
- 객체생성은 할 수 없으나 그 외 참조변수, 상속 등의 모든 기능을 보유

추상메소드
- 오버라이딩의 목적으로 제작
- 함수의 실행부가 없기에 {}를 쓰지 않고 함수의 원형에 ;을 붙여줌

 */

//프로젝트 전체에서 기준이 될 수 있는 추상클래스 정의
abstract class PersonalNumberStorageAbs{
	
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonalInfo(String juminNum);
}

/*
 DTO(Data Transfer Object):
데이터를 저장하고 전송하기 위한 객체
VO(Value Object)라고도 표현
해당 프로그램에서는 한 사람의 정보를 저장하기 위한 용도로 정의

 */
class PersonalInfoDTO{
	private String name;
	private String juminNum;
	
	public PersonalInfoDTO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	
	// private멤버를 반환하기 위한 getter메소드 정의
	public String getName() {
		return name;
	}
	public String getJuminNum() {
		return juminNum;
	}
}

/*
 제공된 추상클래스를 상속하여 사람의 정보를 저장하는 기능과 검색의 기능을 구현
 */
class PersonalNumberStorageExt extends PersonalNumberStorageAbs{
	PersonalInfoDTO[] personalArr; // 정보저장용 객체배열
	int numOfPerInfo;
	
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	/*
	 상속을 통해 추상메소드를 포함하게 됐으므로 반드시 아래와 같은 오버라이팅 필수
	 필수사항이며 하지 않을 경우 에러 발생
	 */
	
	// 전달받은 인자 통해 DTO객체 생성 후 객체배열에 추가
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = 
				new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;
	}
	
	// 주민번호를 인자로 객체배열을 검색한 후 정보 반환
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i = 0; i < numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum()) == 0)
			{
				return personalArr[i].getName();
			}
		}
		return null; // 검색결과 없을 때 null 반환
	}
}


public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		
PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
		
		
	}

}
