package part6;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args){
        System.out.println("숫자 2개를 차례대로 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String inputNum1 = scanner.next();
        String inputNum2 = scanner.next();
        try{
        int a = Integer.parseInt(inputNum1);
        int b = Integer.parseInt(inputNum2);
        System.out.println(a + b);
        } catch (Exception e){
            System.out.println("숫자들을 제대로 입력하세요.ㅡㅡ");
        }

    }
}
