package loop;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 1;
        int cnt = 0;
        while (cnt < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }
}
