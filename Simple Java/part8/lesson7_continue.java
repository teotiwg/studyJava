package part8;

public class lesson7_continue {
    public static void main(String[] args){
        /*for( int i = 0; i < 10; i = i + 1) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
        int i = 0;
        while(i < 10){
            if(i % 2 == 0){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}
