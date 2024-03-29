package assignment1;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers:");

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the second natural number" + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }


        System.out.println("Sum of odd natural numbers: " + sumOdd);
        System.out.print("The sum of even natural numbers: " + sumEven);

        scanner.close();
    }
}
