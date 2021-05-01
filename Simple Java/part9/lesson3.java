package part9;

import java.io.FileWriter;
import java.io.IOException;

public class lesson3 {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("src/part9/output02.txt", true);
            writer.write("치킨은 살 안 쪄요.\n");
            writer.write("살은 내가 쪄요.\n");
            writer.close();
        } catch (IOException e){
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }
    }
}
