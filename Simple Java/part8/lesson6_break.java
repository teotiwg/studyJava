package part8;

import java.util.Scanner;

public class lesson6_break {
    public static void main(String[] args){
        /*int i = 0;
        while(true){
            System.out.println("반복문 진입");
            if(i == 2 ){
                break;
            }
            i = i + 1;
            System.out.println("반복문 끝");*/
        /*for ( int i = 0; i < 10; i = i + 1){
            System.out.println("반복 " + i + " 시작");
            if (i == 3) {
                break;
            }
            System.out.println("반복 " + i + " 끝");*/

        String password = "chicken1004";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("비밀번호를 입력하세요.");
            String input = scanner.nextLine();

            if(input.equals(password)){
                System.out.println("비밀번호가 일치합니다.");
                break;
            }

            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}
