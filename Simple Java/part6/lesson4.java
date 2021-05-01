package part6;

import java.util.Scanner;

public class lesson4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        String numberIn = scanner.nextLine();
        try{
            int number = Integer.parseInt(numberIn);
            number = number + 1;
            System.out.println("다음 숫자는 " + number + "입니다.");
        } catch(Exception e){
            System.out.println("순순히 숫자를 입력하면");
            System.out.println("유혈사태는 일어나지 않을 것");
            System.out.println("입력값 = " + numberIn);
        }
    }
}
