package ex21jdbc.shopping;
/*
 Statement객체를 사용하여 작성한다.
검색할 상품명을 입력하여 해당조건에 맞는 레코드만 출력한다. 
like 를 사용해야 한다.
출력항목 : 일련번호, 상품명, 가격, 등록일, 제품코드
단, 등록일은 0000-00-00 00:00 형태로 출력해야 한다.	
상품가격은 세자리마다 컴마를 찍어준다. 
 */

import ex21jdbc.ConnectDB;

public class SelectShop extends ConnectDB{
	
	public SelectShop() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
