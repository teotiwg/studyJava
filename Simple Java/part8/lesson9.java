package part8;

import java.util.Random;

public class lesson9 {
    public static void main(String[] args){
        System.out.println("지금 무슨 생각?");

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep 실패");
        }
        System.out.println("치킨!");

        //Random random = new Random();
        //int randomNumber = random.nextInt(256);
        //System.out.println(randomNumber);
    }
}
