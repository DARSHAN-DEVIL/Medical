import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Aritheatic Operations (interactive user input)");
        System.out.println("````````````````````MENU````````````````````````");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n Enter your choice: (!-- 0 for e1xit the loop   --!)");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            }

            int a, b;
            System.out.println("\n Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case 4:
                    System.out.println("Division: " + (a / b));
                    break;
                case 5:
                    System.out.println("Modulus: " + (a % b));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        }

    }

}
