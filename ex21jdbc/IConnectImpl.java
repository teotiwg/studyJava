package ex21jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnect;

/*
인터페이스를 구현한 클래스로, extends대신 implements를 사용
용어도 상속이 아닌 '구현'이라 표현
*/
public class IConnectImpl implements IConnect {
	
	public Connection con;
	public PreparedStatement psmt; // 동적쿼리 실행을 위한 객체
	public CallableStatement csmt; // 
	public ResultSet rs;
	
	public IConnectImpl() {
		System.out.println("IConnectImpl 기본생성자 호출");
	}
	public IConnectImpl(String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	@Override
	public void connect(String user, String pass) {
		try {
			con = DriverManager.getConnection(ORACLE_URL, user, pass);
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	//오버라이딩의 목적으로 정의한 메소드
	// 쿼리실행은 각각의 클래스엣 진행하게 됌
	@Override
	public void execute() {
		
	}
	@Override
	public void close() {
		try {
			if(con !=null) con.close();
			if(psmt != null) psmt.close();
			if(csmt != null) csmt.close();
			if(rs != null) rs.close();
			System.out.println("자원반납 완료");
		}
		catch(Exception e) {
			System.out.println("자원 반납시 오류 발생");
			e.printStackTrace();
		}
		
	}
	@Override
	public String scanValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title + "을(를) 입력(exit -> 종료): ");
		String inputStr = scan.nextLine();
		
		/*
		equalsIgnoreCare()
		equals()와 동일하게 문자열이 같은지 비교하는 메소드로
		다른 점이라면 대소문자를 구분 않음.
		*/
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램 종료합니다.");
			close();
			
			System.exit(0);
		}
		
		return inputStr;
	}
	
}
