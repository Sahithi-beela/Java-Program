import java.util.Scanner;

public class LargestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        
        int largestFactor = 1; 
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                largestFactor = i;
            }
        }
        
        
        if (number > 1) {
            System.out.println("The largest factor of " + number + " other than itself is: " + largestFactor);
        } else {
            System.out.println("No factors other than the number itself.");
        }
        
        scanner.close(); 
    }
}
