package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRSelected {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
			Connection con = DriverManager.getConnection(url, id, pass);
			if(con != null) {
				System.out.println("Oracle 연결 성공");
				
				/*
				1. 쿼리문 작성 :
					쿼리문을 작성할 때 주의할 점은 줄바꿈을 할 때 앞뒤로 스페이스를 삽입하는 것이 좋음
					그렇지 않으면 문장들이 서로 이어지므로 SyntaxError 발생
				 */
				
				String sql  = "SELECT * FROM employees WHERE " + " department_id = 50 " + " ORDER BY employee_id DESC";
				/*
				2. 쿼리문 전송을 위한 Statement인터페이스를 통한 객체 생성
					주로 정적 쿼리문을 실행할 때 사용
				 */
				
				Statement stmt = con.createStatement();
				/*
				3. 쿼리문을 전송한 후 실행한 결과를 ResultSet 객체를 통해 반환받음
					해당 객체는 select쿼리를 실행했을 때만 사용
				*/
				ResultSet rs = stmt.executeQuery(sql);
				/*
				4. 반환된 결과를 갯수만큼 반복. 
					next()메소드는 출력할 레코드가 있는지 확인할 때 사용.
					만약 더 이상 출력할 레코드가 없다면 false 반환
				 */
				while(rs.next()) {
					/*
					getXXX()메소드를 통해 각 컬럼에 접근.
					오라클의 자료형은 숫자, 문자, 날짜 3가지 형태이므로 각 메소드도 그와 동일
					각 컬럼에 접근 시 인덱스, 컬럼명 두가지 모두 사용 가능
					 */
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
					java.sql.Date h_date = rs.getDate("hire_date");
					int sal = rs.getInt("salary");
					System.out.printf("%s %s %s %s \n", emp_id, f_name, l_name, h_date, sal);
				}
				/*
				5. 자원 반납:
					모든 작업을 마친 후에는 메모리 절약을 위해 연결했던 자원들을 반납
				 */
				rs.close();
				stmt.close();
				con.close();
				
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

