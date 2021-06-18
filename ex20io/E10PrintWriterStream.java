package ex20io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class E10PrintWriterStream {

	public static void main(String[] args) {
		
		PrintWriter out = new PrintWriter(new FileWriter("src/ex20io/print.txt")));
		
		out.printf("제 나이는 %d살입니다.", 9);
		out.println(" ");
		
		out.println("저는 기타 치는 걸 좋아해요.");
		out.print("노래부를떄 행복한 거 같아요.");
		out.close();
		
		System.out.println("printf.txt가 생성됐습니다.");
	}

}
