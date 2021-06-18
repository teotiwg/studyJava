package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		try {
			/*
			JDBC프로그래밍 절차
			
			 1. 오라클용 JDBC드라이버를 메모리에 로드:
			 new를 사용 않고 클래스명으로 직접 찾아서객체를 생성한 후 메모리에 로드하는 forName()메소드 사용
			 메모리에 로드된 드라이버가 DriverManager라는 클래스에 등록됌
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			
			/*
			 2. 오라클 연결을 위한 커넥션URL, 계정아이디, 패스워드 준비
			 커넥션URL =>  jdbc:oracle:thin:@IP주소:포트번호:SID명
			 * 서버환경에 따라 ip주소, 포트번호, sid는변경될 수 있음
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
			/*
			 3. DiverManager 클래스의 메소드를 통해 오라클에 연결 시도
			 연결에 성공할 경우 연결된 주소 반환
			 */
			Connection con = DriverManager.getConnection(url, id, pass);
			if(con != null) {
				System.out.println("Oracle 연결 성공");
			}
			else {
				System.out.println("Oracle 연결 실패");
			}
		}
		catch(Exception e) {
			System.out.println("Oracle 연결 예외발생");
			e.printStackTrace();
		}
	}

}

