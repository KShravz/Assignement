package java2;

import java.util.Scanner;

public class Java22 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Sum: " + sum(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));

            try {
                System.out.println("Division: " + divide(num1, num2));
            } catch (IllegalArgumentException e) {
                System.out.println("Division Error: " + e.getMessage());
            }

            while (true) {
                System.out.print("Do you want to perform more calculations? (yes/no): ");
                String moreCalculations = scanner.next().toLowerCase();

                if (moreCalculations.equals("yes")) {
                    break;
                } else if (moreCalculations.equals("no")) {
                    scanner.close();
                    return;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
        }
    }
}
