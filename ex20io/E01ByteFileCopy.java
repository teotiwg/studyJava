package ex20io;

/*
 스트림(Stream):
	IO모델의 핵심개념이라 할 수 있는 스트림은 
	'데이터의 흐름' 혹은 '데이터의 흐름을 형성해주는 통로' 정도로 정의 가능
	입력 스트림(input), 출력스트림(output)으로 나눌 수 있다.

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E01ByteFileCopy {

	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0 ;
		
		/*
		 IO관련 작업에서는 많은 부분에서 예외처리가 필요
		이떄 예외를 throws하는 것보다 try~catch로 처리하는 걸 권장
		예외를 무시하면 문제가 생겼을 때 적절한 대처가 힘들기 때문

		 */
		try {
			in = new FileInputStream("src/ex20io/media.zip");
			out = new FileOutputStream("src/ex20io/media.zip");
			int bData;
			
			while(true) {
				bData = in.read();
				
				if(bData ==1) {
					break;
				}
				out.write(bData);
				copyByte++;
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e) {
			System.out.println("파일스트림 생성 시 오류 발생");
		}
		finally {
			//try구문으로 진입하여 스트림을 생성했다면 finally구문에선 스트림을 닫아줌(자원반납)
			try {
				in.close();
				out.close();
				
				System.out.println("복사돈 kByte 크기: " + (copyByte/1024));
			}
			catch(IOException e) {
				System.out.println("파일스트림 닫기 오류");
			}
		}
		
		
		
		
	}

}
