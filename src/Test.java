import java.util.Scanner;

public class Test {
    final static String constant = "aaa";

    public static void main(String[] args) {
        // testSwitchCase(15);
        // calculator();

        printStars(5);
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

    public static boolean isPalin() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int i = 0;
        int j = s.length() -1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void printStars(int num) {
        for(int i = 1; i <= num; i++){
            String s = "";
            
            for (int j = 1; j <= num-i; j++)
                s += " ";
            for (int j = 1; j <= i; j++)
                s += "*";

            System.out.println(s);
        }
    }
}
