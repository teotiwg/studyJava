package part7;

import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args){
        System.out.println("키와 몸무게를 입력하세요. (예)160 50");
        Scanner scanner = new Scanner(System.in);
        String height = scanner.next();
        String weight = scanner.next();
        double bmiH = (Double.parseDouble(height))/100;
        double bmiW = Double.parseDouble(weight);
        double BMI = bmiW / (bmiH * bmiH);
            if(BMI >= 23){
                System.out.println("BMI가 " + BMI + "로 23이상이므로 과체중입니다.");
            } else if(BMI < 18.5){
                System.out.println("BMI가 " + BMI + "로 18.5 미만이므로 저체중입니다.");
            } else{
                System.out.println("정상체중입니다.");
            }
    }
}
