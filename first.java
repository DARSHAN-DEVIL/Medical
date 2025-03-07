import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Arithematic Operations:");
        Arithematic(a, b);

        System.out.println("\nIncrement and Decrement Operations:");
        Increment_decrement(a, b);

        sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static void Increment_decrement(int a, int b) {
        System.out.println("Pre-Increment of first number: " + ++a);
        System.out.println("Pre-Decrement of second number: " + --b);
        System.out.println("Post-Increment of first number: " + a++);
        System.out.println("Post-Decrement of second number: " + b--);
    }

    public static void Arithematic(int a, int b) {
        System.out.println("Sum of two numbers: " + add(a, b));
        System.out.println("Difference of two numbers: " + sub(a, b));
        System.out.println("Product of two numbers: " + mul(a, b));
        System.out.println("Division of two numbers: " + div(a, b));
        System.out.println("Remainder of two numbers: " + mod(a, b));
    }
}
