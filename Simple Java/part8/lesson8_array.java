package part8;

import java.util.Arrays;

public class lesson8_array {
    public static void main(String[] args){
        String[][] days = {
                {"월", "화", "수", "목", "금", "토", "일"},
                {"월", "화", "수", "목", "금", "토", "일"},
                {"월", "화", "수", "목", "금", "토", "일"},
        };
        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));
        System.out.println(days[2][6]);
        //String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        //System.out.println(days);
        //System.out.println(Arrays.toString(days));
        /*String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "일";
        for(String s : days2){
            System.out.println(s);
        }*/
        /*int lengthDays = days.length;
        System.out.println(days[0]);
        System.out.println(days[6]);
        System.out.println(lengthDays);
        days[5] = "금";
        days[6] = "금";*/

        /*for( int i = 0; i < lengthDays; i = i + 1){
            System.out.println(days[i] + "요일");
        }*/
        /*for(String day: days){
            System.out.println(day + "요일");
        }*/
    }
}
