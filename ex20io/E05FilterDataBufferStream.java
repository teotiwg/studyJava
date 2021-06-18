package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class E05FilterDataBufferStream {

	public static void main(String[] args) {
		
		String src = "src/ex20io/dataBufferStream.bin";
		
		try {
			OutputStream out = new FileOutputStream(src);
			
			BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
			
			DataOutputStream dataFilterOut = new DataOutputStream(bufFilterOut);
			
			dataFilterOut.writeInt(555);
			dataFilterOut.writeDouble(55.555);
			dataFilterOut.writeInt(999);
			dataFilterOut.writeDouble(99.99);
			
			dataFilterOut.close();
			
			DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
			
			int intNum1 = dataFilterIn.readInt();
			double dbNum1 = dataFilterIn.readDouble();
			int intNum2 = dataFilterIn.readInt();
			double dbNum2 = dataFilterIn.readDouble();
			
			dataFilterIn.close();
			
			System.out.printf("저장된 정수는 %d, %d\n", intNum1, intNum2);
			System.out.printf("저장된 실수는%.2f, %.2f%n", dbNum1, dbNum2);
			
		}
		catch(Exception e) {
			System.out.println("IO예외 발생");
			e.printStackTrace();
		}
		
		
		
	}

}
