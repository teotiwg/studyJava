package part8;

public class lesson3_for {
    public static void main(String[] args){
        for(int i = 2; i < 10; i = i + 1){
            for(int j = i; j < 10; j = j + 1){
                int result = i * j;
                System.out.println(i + "x" + j + " = " + result);
            }
        }
    }
}
