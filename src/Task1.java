import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nPositive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}