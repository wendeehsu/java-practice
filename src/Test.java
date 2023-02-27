import java.util.Scanner;

public class Test {
    final static String constant = "aaa";

    public static void main(String[] args) {
        // final String constant = "aaa";
        String a = "a";
        String b = a;
        b = "b";
        Scanner i = new Scanner(System.in);
        System.out.println(a + " " + b + i.next());
        greet();
    }

    public static void greet() {
        System.out.println("update greet");
        System.out.println(constant);
    }
}
