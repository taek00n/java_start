package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int cnt = scanner.nextInt();
        int[][] score = new int[cnt][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int row = 0; row < cnt; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요.");
            for (int column = 0; column < 3; column++) {
                System.out.print(subject[column] + " 점수:");
                score[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < cnt; row++) {
            int total  = 0;
            double avg;
            for (int column = 0; column < 3; column++) {
                total += score[row][column];
            }
            avg = (double) total / 3;
            System.out.println((row+1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
