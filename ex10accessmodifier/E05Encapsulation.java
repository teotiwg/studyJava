package ex10accessmodifier;

/*
 캡슐화(Encapsulation):
 	여러가지 비즈니스 로직을 하나로 묶음
 	업무의 순서까지 고려한 형태의 로직을 구성
 	즉, 관련있는 메소드를 하나의 클래스로 묶는 것
 */

// 아래 4가지 업무는 번호 순서대로 진행됌을 가정
class MemberRegist{
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}

class CongratulationPoint{
	void doCongratulationPoint() {
		System.out.println("3. 가입축하 10 포인트 지급합니다.");
	}
}

class AutoLogin{
	void doAutoLogin() {
		System.out.println("2. 자동로그인");
	}
}

class FirstLoginEvent{
	void doFirstLoginEvent() {
		System.out.println("4. 첫 로그인 이벤트 페이지로 이동합니다.");
	}
}

/*
 업무의 순서를 고려하여 관련된 메소드를 하나의 클래스로 정의
 차후에는 별도의 분석 없이 해당 클래스의 메소드만 호출하면 업무는 오류없이 진행됌
 */

class EncapsulLogic{
	
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent FirstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		FirstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation {

	public static void main(String[] args) {
		/*
		 업무의 진행순서가 중요하다고 가정했을 때 
		 캡슐화 이전의 코드에서는 개발자가 순서를 지키지 않은 상태에서도 실행이 가능한 코드가 됌
		 */
		
		System.out.println("캡슐화 전 코드");
		
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		firstLoginEvent.doFirstLoginEvent();
		congratulationPoint.doCongratulationPoint();
		autoLogin.doAutoLogin();
		
		System.out.println("===================================");
		
		// 메소드만 호출하면 모든 업무가 순서대로 진행돼 편리
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
		
	}

}
