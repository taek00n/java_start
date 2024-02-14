package loop;

public class ForEx2 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; count < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}
