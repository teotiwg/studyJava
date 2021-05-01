package part5;

public class lesson4 {
    public static void main(String[] args){
        //String chicken = "치킨은 살 안 쪄요.";
        //String me = "살은 내가 쪄요";
        //String chickenme = chicken + me;
        //String suffix = " 살 안 쪄요. ";
        //String chicken = "치킨은" + suffix;
        //String me = "나도" + suffix;
        //System.out.println(chicken);
        //System.out.println(me);
        //System.out.println(chickenme);

        /*String charName = "해치지마요";
        int length = charName.length();
        System.out.println("글자 수 : " + length);*/

        /*String fat = "치킨은 살 안 쪄요. 살은 내가 쪄요.";
        String replaced = fat.replaceAll("내가","네가");
        System.out.println(replaced);*/

        String bday = "1991/06/11";
        String byear = bday.substring(0, 4);
        String day = bday.substring(5);
        System.out.println("출생연도: " + byear);
        System.out.println("출생일: " + day);
    }
}
