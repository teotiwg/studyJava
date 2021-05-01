package part6;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args){
        /*System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String intString = scanner.nextLine();
        int number = Integer.parseInt(intString);
        number = number + 1;
        System.out.println("입력한 수의 다음 수는 " + number + "입니다.");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeStr = scanner.nextLine();
        System.out.println("순대국 값을 입력하세요.");
        String priceSoupStr = scanner.nextLine();
        double exchange = Double.parseDouble(exchangeStr);
        double priceSoup = Double.parseDouble(priceSoupStr);
        System.out.println("순대국은 " + priceSoup / exchange + "달러입니다.");
    }
}
