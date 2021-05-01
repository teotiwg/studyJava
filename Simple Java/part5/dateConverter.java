package part5;

public class dateConverter {
    public static void main(String[] args){
        String bday = "1991/06/11";
        String byear = bday.substring(0, 4);
        String bmonth = bday.substring(5, 7);
        String date = bday.substring(8);
        System.out.println(byear + "년 " + bmonth + "월 " + date + "일");
    }
}
