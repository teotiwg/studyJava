package ex21jdbc.prepared;

import java.util.Scanner;

import ex21jdbc.IConnectImpl;

public class InsertSQL extends IConnectImpl {
	
	public InsertSQL() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			String query = "INSERT INTO member VALUES (?, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디: ");
			String id = scan.nextLine();
			System.out.println("패스워드: "); 
			String pw = scan.nextLine();
			System.out.println("이름: ");
			String name = scan.nextLine();
		
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			//psmt.setString(4, "2018-11-20");
			
			//java.util.Date utilDaate = new java.util.Date();
			//java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			//psmt.setDate(4, sqlDate);
			
			int affected = psmt.executeUpdate();
			System.out.println(affected + "행이 입력됐습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertSQL().execute();
	}

}
