package array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {

        int[] scores = {90,80,70,60,50};
        int total = 0;

        for(int score : scores) {
            total += score;
        }

        double avg = (double) total / scores.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + avg);
    }
}
