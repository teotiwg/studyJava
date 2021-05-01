package part7;

import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args){
        /*String a = "치킨";
        String b = "치킨";
        System.out.println(a == b);*/

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String chicken = "치킨";
        //System.out.println(input == chicken);
        System.out.println(input.equals(chicken));
    }
}
