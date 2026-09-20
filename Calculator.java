
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Calculate");
            System.out.println("2. Clear");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Enter operator (+, -, *, /, %): ");
                    char operator = sc.next().charAt(0);

                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();

                    double result;

                    switch (operator) {

                        case '+':
                            result = num1 + num2;
                            System.out.println("Result: " + result);
                            break;

                        case '-':
                            result = num1 - num2;
                            System.out.println("Result: " + result);
                            break;

                        case '*':
                            result = num1 * num2;
                            System.out.println("Result: " + result);
                            break;

                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                                System.out.println("Result: " + result);
                            } else {
                                System.out.println("Cannot divide by zero.");
                            }
                            break;

                        case '%':
                            if (num2 != 0) {
                                result = num1 % num2;
                                System.out.println("Result: " + result);
                            } else {
                                System.out.println("Cannot calculate modulus with zero.");
                            }
                            break;

                        default:
                            System.out.println("Invalid operator.");
                    }

                    break;

                case 2:

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;

                case 3:

                    running = false;
                    System.out.println("Calculator closed.");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
	}
}
