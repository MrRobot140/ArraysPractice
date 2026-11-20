import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Largest: " + max + " at index " + maxIndex);
        System.out.println("Smallest: " + min + " at index " + minIndex);
    }
}