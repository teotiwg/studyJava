package ex21jdbc.prepared;

import java.sql.SQLException;

import ex21jdbc.IConnectImpl;

public class UpdateSQL extends IConnectImpl {
	
	public UpdateSQL() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		// 수정, 삭제시에는 주로 PK로 지정된 컬럼을 조건으로 사용
		String sql = "UPDATE member "
				+ " SET name=?. pass=? "
				+ " WHERE id=?";
		try {
			psmt = con.prepareStatement(sql);
			/*
			사용자 입력시 exit를 입력할 때까지 계속 실행되는 구조 
			prepared객체는 재사용이 가능한 쿼리문을 수행하는 구조이므로
			이런 형태의 프로그래밍이 가능
			*/
			while(true) {
				psmt.setString(3, scanValue("수정할 아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("패스워드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected + "행이 업데이트됐습니다.");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	
	}
	public static void main(String[] args) {
		new UpdateSQL().execute();
		
	}

}
