import java.util.Scanner;

public class Test {
    final static String constant = "aaa";

    public static void main(String[] args) {
        // testSwitchCase(15);
        // calculator();

        for (int i = 1; i <= 10; i++) {
            String s = "";
            for (int j = 1; j <= 10; j++) {
                s += i*j + " ";
            }
            System.out.println(s);
        }
    }

    public static void greet() {
        System.out.println("update greet");
        System.out.println(constant);
    }

    public static void testSwitchCase(int n) {
        switch(n) {
            case 10:
                System.out.println("= 10");
            case 15:
                System.out.println("= 15");
            case 20:
                System.out.println("= 20");
            default:
                System.out.println("none");
        }
    }

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("type the math: ");
        int num1 = input.nextInt();
        String ope = input.next();
        int num2 = input.nextInt();

        switch (ope) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println((float) num1 / num2);
                break;
            default:
                System.out.println("non valid operator");
        }
    }
}
