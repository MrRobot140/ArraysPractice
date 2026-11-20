import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Original: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nReversed: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}