package part6;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);*/

        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "님 반갑습니다.");
    }
}
