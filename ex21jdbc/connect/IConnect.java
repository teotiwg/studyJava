package ex21jdbc.connect;

public interface IConnect {
	/*
	멤버변수:
	인터페이스에 선언된 변수는 
	무조건 public static final이붙어 정적상수로 선언됌
	*/
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin://@localhost:1521:xe";
	
	/*
	멤버추상메소드 :
	public abstract가 붙어 추상메소드로 선언됌
	*/
	void connect(String user, String pass); // DB연결
	void execute(); // 각 쿼리 실행
	void close(); // 자원반납
	
	// 사용자 입력을 위한 추상메소드 선언
	String scanValue(String title);
}
