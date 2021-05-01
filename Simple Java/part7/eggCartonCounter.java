package part7;

import java.util.Scanner;

public class eggCartonCounter {
    public static void main(String[] args){
        System.out.println("달걀 갯수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String eggs = scanner.nextLine();

        try {
            int totalEggs = Integer.parseInt(eggs);

            if (totalEggs < 30) {
                System.out.println("계란판이 필요하지 않습니다.");
            } else {
                System.out.println("총 " + (totalEggs / 30) + "개의 계란판이 필요합니다.");
            }
        } catch(NumberFormatException e){
            System.out.println("잘못된 입력입니다.");
        }
    }
}
