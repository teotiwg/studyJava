package part8;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args){
        String [] subjects = {"국어", "영어", "수학", "과탐"};
        int [] scores = {90, 100, 100, 100};

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 알고 싶은 과목을 입력하세요.");
        String inputSubject = scanner.nextLine();

        for(int i = 0; i < subjects.length; i = i + 1){
            String subject = subjects[i];

            if(subject.equals(inputSubject)){
                System.out.println(
                        inputSubject + " 점수는 " + scores[i] + "점입니다."
                );
            }
        }
    }
}
