package ex20io;

/*
 1byte씩 읽어서 정리하는 것보다
1kb(1024b)씩 읽을 수 있는 버퍼를 이용하므로 복사 속도가 훨씬 빠르다
스트림 혹은 네트워크를 통해 파일을 전송할 때
버퍼를 사용하는 이유는 바로 속도떄문
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("src/ex20io/media.zip");
			OutputStream out = new FileOutputStream("src/ex20io/media2.zip");
			
			int copyByte = 0;
			int readLen;
			
			// 1kb씩 읽어서 저장하기 위한 버퍼 생성
			byte buffer[] = new byte[1024];
			
			while(true) {
				readLen = in.read(buffer);
				if(readLen == -1) {
					break;
				}
				out.write(buffer, 0, readLen);
				copyByte += readLen;
			}
			if(in != null) in.close();
			if(out != null) out.close();
			
			System.out.println("복사된 파일크기: " + copyByte + "byte");
			System.out.println("복사된 파일크기: " + (copyByte/1024) + "kByte");
			System.out.println("복사된 파일크기: " + (copyByte/(1024*1024)) + "Mbyte");
			
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		catch(IOException e) {
			System.out.println("IO작업 중 예외 발생");
		}
		catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
		
		
	}

}
