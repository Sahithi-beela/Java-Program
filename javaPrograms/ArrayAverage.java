import java.util.Random;

public class ArrayAverage {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; 
        }

        
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

       
        System.out.println("Array Elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        
        System.out.printf("\nAverage: %.2f\n", average);

       
        System.out.println("Elements greater than the average: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }
}
