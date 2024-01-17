package module4;

import java.util.Scanner;

public class Choice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Not valid. Please enter a valid grade.");
                scanner.next();
            }
            double grade = scanner.nextDouble();

            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        double average = sum / 10;

        System.out.println("\nStats:");
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}
