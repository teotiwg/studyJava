package part6;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){
        System.out.println("영어 단어와 한글 단어를 하나씩 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String engWord = scanner.next();
        String korWord = scanner.next();

        System.out.println("입력된 영단어: " + engWord);
        System.out.println("입력된 한글 단어: " + korWord);
    }
}
