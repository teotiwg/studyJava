package part6;

import java.util.Scanner;

public class dogFoods {
    public static void main(String[] args){
        System.out.println("강아지의 몸무게(kg)를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String inputWeight = scanner.next();
        int theWeight = Integer.parseInt(inputWeight);
        System.out.println("사료의 적정급여량은 " + (theWeight * 10) + "g입니다.");

    }
}
