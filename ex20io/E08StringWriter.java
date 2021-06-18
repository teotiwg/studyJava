package ex20io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E08StringWriter {

	public static void main(String[] args) {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("src/ex20io/string.txt"));
			out.write("나 KOSMO에서 공부중");
			out.newLine();
			out.write("수료 후 취업계획");
			out.newLine();
			
			out.close();
			System.out.println("입력완료");
		}
		catch(FileNotFoundException e) {
			System.out.println("파일 없음");
		}
		catch(IOException e) {
			System.out.println("IO오류");
		}
		
	}

}
