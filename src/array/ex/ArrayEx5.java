package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
        int cnt = scanner.nextInt();
        int[] arr = new int[cnt];
        int total = 0;
        double avg;

        System.out.println(cnt + "개의 정수를 입력하세요");
        for (int i = 0; i < cnt; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        avg = (double) total / arr.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
