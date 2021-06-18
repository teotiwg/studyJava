package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/*
직렬화된 파일 friend_info.obj을 복원하는 프로그램 작성
만약 3명의 친구가 저장돼있다면 복원 후 3명의 정보를 그대로 출력
 */


public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		
		try {
			// 저장된 파일을 역직렬화(복원)하기 위한 입력스트림 생성
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/friend_info.obj"));
		
		while(true) {
			//Friend객체 복원
			Friend friend = (Friend)in.readObject();
			// 더 이상 복원할 내용이 없으면 루프 탈출
			if(friend == null)
				break;
			friend.showAllData();
		}
		
		}
		catch(Exception e) {
			//e.printStackTrace();
		}
		System.out.println("끝");
		
		
	}

}
