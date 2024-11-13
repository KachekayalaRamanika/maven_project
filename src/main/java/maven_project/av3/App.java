package maven_project.av3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, choice;
        float result;
        char cont;
        do {
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            System.out.println("Choose operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.print("Enter choice (1/2/3/4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.printf("Result = %.2f\n", result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.printf("Result = %.2f\n", result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.printf("Result = %.2f\n", result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                    } else {
                        result = (float) num1 / num2;
                        System.out.printf("Result = %.2f\n", result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.print("Do you want to perform another calculation? (y/n): ");
            cont = scanner.next().charAt(0);
        } while (cont == 'y' || cont == 'Y');
        scanner.close();
    }
}

