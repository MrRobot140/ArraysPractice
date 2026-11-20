import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}