package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMsg("Hello, world", 3);
        printMsg("Hello, world", 5);
        printMsg("Hello, world", 7);
    }

    public static void printMsg(String msg, int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.println(msg);
        }
    }
}
