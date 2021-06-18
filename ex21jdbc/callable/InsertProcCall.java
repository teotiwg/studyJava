package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.IConnectImpl;

public class InsertProcCall extends IConnectImpl {
	
	public InsertProcCall() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			/*
			프로시저는 리턴값이 없으므로 함수처럼 ?= 로 시작하지 않음
			out파라미터를 통해 값을 반환받게 됌
			*/
			csmt = con.prepareCall("{call KosmoMemberInsert(?,?,?,?)}");
			// in파라미터 설정
			csmt.setString(1,  scanValue("아이디"));
			csmt.setString(2,  scanValue("패스워드"));
			csmt.setString(3,  scanValue("이름"));
			// out파라미터 설정, 반환값의 자료형 설정
			csmt.registerOutParameter(4,  Types.NUMERIC);
			csmt.execute();
			int affected = csmt.getInt(4);
			
			if(affected == 0)
				System.out.println("오류발생 : 입력실패");
			else
				System.out.println(affected + "행 입력성공");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertProcCall().execute();
	}

}
