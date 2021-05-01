package part9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){
        FileInputStream inputStream = null;
        try{
            //inputStream = new FileInputStream("src/part9/acronym.txt");
            inputStream = new FileInputStream("src/part9/acronym5.txt");
        } catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
            System.exit(10);
        }
        Scanner scanner = new Scanner(inputStream);
        while ( scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        /*String line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);*/
    }
}
