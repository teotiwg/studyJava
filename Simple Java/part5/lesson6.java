package part5;

public class lesson6 {
    public static void main(String[] args){
        Integer intNum = 3;
        Long longNum = 3L;
        //Float floatNum = 3.0f;
        //Double doubleNum = 3.0d;
        //Boolean booleanVal = true;

        float floatNum = intNum.floatValue();
        double doubleNum = intNum.doubleValue();
        String stringNum = intNum.toString();
    }
}
