package ex12Inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo2{
	
	private String name;
	int age;
	
	public MyFriendInfo2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo2 extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	public MyFriendDetailInfo2(String name, int age, String addr, String phone) {
  		super(name, age);
  		this.addr = addr;
  		//this.phone;
  	}
  	
	public void showMyFriendDetailInfo()
	{
		//showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}

public class QuMyFriendDetailInfoA {

	public static void main(String[] args) {
		
		MyFriendDetailInfo myfrienddetailinfo = new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		
		//MyFriendDetailInfo.showMyFriendDetailInfo();
		
	}

}
