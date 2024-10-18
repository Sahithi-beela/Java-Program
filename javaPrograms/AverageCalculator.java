import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0; 
        int count = 5;

        
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble(); 
            sum += number; 
        }
        
        
        double average = sum / count;
        
        
        System.out.printf("The average of the entered numbers is: %.2f%n", average);
        
        scanner.close();
    }
}
