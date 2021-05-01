package part8;

import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class lesson4_while {
    public static void main(String[] args){
        /*int i = 0;
        while(i < 10){
            System.out.println("현재 반복 횟수: " + i);
            i = i + 1;
        }*/
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("비밀번호를 입력해주세요");
        String input = scanner.nextLine();

        while (input.equals(password) != true){
            System.out.println("비밀번호를 다시 입력하세요.");
            input = scanner.nextLine();
        }
        System.out.println("올바른 비밀번호를 입력했습니다.");
    }
}
