package ex13interface;

/*
 추상클래스를 인터페이스로 변경
abstract class -> interface
메소드인 경우 public abstract 제거
멤버상수인 경우 public static final 제거
 */

interface PersonalNumberStorageAbsImpl{
	
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}

class PersonalInfoVO{
	private String name;
	private String juminNum;
	
	public PersonalInfoVO(String name, String juminNum) {
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
 클래스가 클래스를 상속할 때 => extends
클래스가 인터페이스를 상속할 떄 implements
인터페이스가 인터페이스를 상속할 때  => extends
extends는 상속, implements 는 구현

 */
class PersonalNumberStorageExt2 implements PersonalNumberStorageAbs{
	PersonalInfoDTO[] personalArr; // 정보저장용 객체배열
	int numOfPerInfo;
	
	public PersonalNumberStorageExt2(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo2(String juminNum, String name) {
		personalArr[numOfPerInfo] = 
				new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;
	}
	
	@Override
	public String searchPersonalInfo2(String juminNum) {
		for(int i = 0; i < numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum()) == 0)
			{
				return personalArr[i].getName();
			}
		}
		return null; // 검색결과 없을 때 null 반환
	}
}


public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
		
		
	}

}
