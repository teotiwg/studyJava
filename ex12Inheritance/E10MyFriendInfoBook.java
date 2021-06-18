package ex12Inheritance;

import java.util.Scanner;

import ex20io.Friend;
import ex20io.FriendInfoHandler;
import ex20io.HighFriend;
import ex20io.UnivFriend;

/*
 친구를 표현한 최상위클래스로 해당 프로그램에선 Friend클래스로 객체생성은 하지 않는다.
 상속의 목적으로만 정의된 클래스다.
 */

class Friend{
	// 멤버변수
	String name;
	String phone;
	String addr;
	// 생성자메소드
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	// 멤버메소드
	//멤버변수 전체 정보를 출력하는 메소드
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
	}
	/*
	 간략한 정보만을 출력하는 멤버메소드로 현재 실행부가 없는 상태로 정의
	 해당 프로그램에선 오버라이딩의 목적으로만 정의
	 */
	public void showBasicInfo() {	}
}

class HighFriend extends Friend{
	String nickname;
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	// 고딩친구의 전체정보를 출력하기 위해 부모에서 정의된 메소드를 super를 통해 호출하고,
	// 자식에서 확장한 변수를 별도의 print문을 톨해 출력
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명: "+ nickname);
	}
	// 자식에서 오버라이딩하여 재정의한 메소드로 고딩친구의 간략한 정보 출력
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명: " + nickname);
		System.out.println("전번: " + phone);
	}
}

class UnivFriend extends Friend{
	// 자식에서 확장한 멤버변수
	String major;
	
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: " + major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
	}
}

class FriendInfoHandler{
	
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		System.out.println("이름: "); iName = scan.nextLine();
		System.out.println("전화번호: "); iPhone = scan.nextLine();
		System.out.println("주소: "); iAddr = scan.nextLine();
		
		if(choice == 1) {
			System.out.println("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice == 2){
			System.out.println("전공: "); iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		
		System.out.println("친구정보 입력이 완료됐습니다.");
	}
	// 1. 친구정보를 추가할 때 High 혹은 Univ 객체를 배열에 저장
	// 2. 입력 시 모든 객체는 Friends로 자동 형변환되어 저장
	// 3. 정보 출력 시 배열에 입력된 객체 수만큼 반복하면서 각 요소를 통해 멤버메소드를 호출
	// 4. 이 때 오버라이딩된 메소드를 통해 항상 해당 객체의 정보를 출력할 수 있음. 
	//		참조변수의 타입에 영향을 받지 않고 항상 오버라이딩된 최하위의 메소드가 호출됌
	public void showAllData() {
		for(int i = 0; i < numOfFriends; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력됐습니다.==");
	}
	
	public void showSimpleData() {
		for(int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략정보가 출력됐습니다.==");
	}
	
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		
		// 객체배열에 저장된 친구정보의 갯수만큼 반복
		for(int i = 0; i < numOfFriends; i++) {
			/*
			 검색을 위해 입력한 이름과, 각 인덱스에 저장된 객체의 name변수의 비교를 통해 
			 문자열 검색을 진행
			 */
			if(searchName.compareTo(myFriends[i].name) == 0) {
				// 일치하는 이름이 있는 경우 정보 출력
				myFriends[i].showAllData();
				
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
			}
		}
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		/*
		 배열의 요소 중 삭제된 요소의 인덱스값을 저장할 용도의 변수
		 요소를 삭제한 후 빈자리를 채워넣을 떄 사용
		 배열의 인덱스이므로 초기값은 -1으로 설정
		 */
		int deleteIndex = -1;
		
		for(int i = 0; i < numOfFriends; i++) {
			if(deleteName.compareTo(myFriends[i].name) == 0 ) {
				// 요소삭제를 위해 null값으로 변경
				myFriends[i] = null;
				// 삭제된 요소의 인덱스를 저장
				deleteIndex = i;
				// 전체 카운트의 1 차감
				numOfFriends--;
				// 하나의 객체를 
				break;
			}
		}
		if(deleteIndex == -1) {
			// 검색된 데이터가 없어 삭제되지 않았다면 -1 유지
			System.out.println("삭제된 데이터가 없습니다.");
		}
		else {
			/*
			 객체배열에서 검색된 요소를 삭제한 후 입력된 위치의 바로 뒤 요소를 앞으로 하나씩 이동
			 */
			for(int i = deleteIndex; i < numOfFriends; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터(" + deleteIndex + "번)가 삭제됐습니다.");
		}
	}
	
}

public class E10MyFriendInfoBook {
	
	public static void menuShow() {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1. 고딩친구 입력");
		System.out.println("2. 대딩친구 입력");
		System.out.println("3. 전체정보 출력");
		System.out.println("4. 간략정보 출력");
		System.out.println("5. 검색");
		System.out.println("6. 삭제");
		System.out.println("7. 프로그램 종료");
		System.out.println("메뉴선택>>>");
	}
	
	/*
	 프로그램 전반의 흐름에 대해서만 기술하고 관련 함수를 호출하는 정도로만 구성
	 main메소드는 단지 프로그램의 시작점 정도의 의미만 갖는 게 좋음
	 */
	public static void main(String[] args) {
		// 프로그램의 비즈니스 로직을 가진 핸들러 객체 생성
		FriendInfoHandler handler = new FriendInfoHandler(100);
		// 연락처 정보를 객체배열의 크기 100으로 초기화
		
		// 무한루프로 구성하여 사용자가 원하는 시점에 프로그램을 종료
		while(true) {
			menuShow();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				// 메인메소드의 종료는 프로그램의 종료로 이어짐
				return;
			}
		}
		
	}
	
}
