package ex21jdbc.shopping;
// 상품명, 상품가격, 상품코드를 scanValue() 메소드로 입력받아 사용한다. 
// 입력이 완료되면 입력된 행의 갯수를 반환하여 출력

import java.sql.SQLException;

import ex21jdbc.IConnectImpl;

public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super("kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?, ?, ?)}");
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("상품가격"));
			csmt.setString(3, scanValue("상품코드"));
			
			int affected = csmt.getInt(3);
			
			if(affected == 0)
				System.out.println("오류발생");
			else
				System.out.println("입력성공");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {
		new InsertShop().execute();
		
	}

}
