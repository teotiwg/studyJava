package part7;

import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args){
        /*System.out.println("월을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month;

        try{
            String input = scanner.nextLine();
            month = Integer.parseInt(input);
        } catch (Exception e){
            month = -1;
        }

        if(month == 1){
            System.out.println("January");
        } else if(month == 2){
            System.out.println("Feburary");
        } else if(month == 3){
            System.out.println("March");
        } else if(month == 4){
            System.out.println("April");
        } else{
            System.out.println("1부터 4까지만 입력할 수 있습니다.");
        }*/
        System.out.println("메뉴 번호를 입력하세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 한우 스테이크");
        Scanner scanner = new Scanner(System.in);
        int menuNum;
        //String name = scanner.nextLine();

        try{
            menuNum = scanner.nextInt();
        } catch (Exception e){
            menuNum = -1;
        }

        switch(menuNum){
            case 1:
                System.out.println("치킨은 2만원입니다.");
                break;
            case 2:
                System.out.println("순대국은 7천원입니다.");
                break;
            case 3:
                System.out.println("한우 스테이크는 3만원입니다.");
                break;
            default:
                System.out.println("그런 거 없습니다.");
                break;
        }
    }
}
