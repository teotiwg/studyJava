package ex21jdbc.prepared;

import ex21jdbc.IConnectImpl;

public class DeleteSQL extends IConnectImpl{
	
	public DeleteSQL() {
		super("kosmo", "1234");
	}
	
	public void execute() {
		try {
			String query = "DELETE FROM member WHERE id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, scanValue("삭제할 아이디"));
			System.out.println(psmt.executeUpdate() + "행이 삭제됐습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	
	public static void main(String[] args) {
		
		new DeleteSQL().execute();
	}

}
