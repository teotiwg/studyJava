package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	// 멤버변수
	Connection con; // DB연결을 위한 객체
	Statement stmt; // 정적쿼리문 전송 및 실행에 사용하는 객체
	
	// 생성자
	public InsertQuery() {
		try {
			// 1. 오라클 드라이버를 메모리에 로드(객체 생성한다는 거)
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. 커넥션 객체를 통해 DB 연결
			con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe","kosmo","1234");
			System.out.println("오라클 DB 연결 성공");		
		}
		catch(ClassNotFoundException e) {
			// ojebc6.jar파일이 없거나 연동되지 않았을 때 예외 발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch(SQLException e) {
			// 커넥션 URL이나 계정명, 혹은 쿼리문이 잘못됐을 때 예외발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
	}
	
	// 쿼리작성 및 전송, 실행
	private void execute() {
		try {
			// 3. Statement 객체 생성을 위한 메소드 호출
			stmt = con.createStatement();
			
			// 4. SQL문(쿼리문) 작성
			String sql = "INSERT INTO member VALUES " + " ('ko1', 'ko1', 'kousr1', SYSDATE) ";
			
			// 5. 쿼리문 실행 및 결과값 반환
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 입력됐습니다.");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행에 문제가 발생했습니다.");
			e.printStackTrace();
		}
		finally {
			/*
			 try구문으로 진입했다면 예외가 발생하더라도 무조건 시행되는 구문으로 
			 자원 해제를 위한 close()메소드 호출
			 */
			close();
		}
		
	}
	
	private void close() {
		try {
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			System.out.println("DB자원 반납 완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납 시 오류가 발생했습니다.");
		}
	}
	
	public static void main(String[] args) {
		// 객체 생성 및 실행
		InsertQuery iSQL = new InsertQuery();
		iSQL.execute();
		
	}

}
