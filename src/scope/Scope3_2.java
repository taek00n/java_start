package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 10) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
