import java.util.Scanner;

public class LargestIntegerFinder {
    
    
    public static int findLargest(int[] numbers) {
        int largest = numbers[0]; 
        
        for (int number : numbers) {
            if (number > largest) {
                largest = number; 
            }
        }
        
        return largest; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of integers: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size]; 
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); 
        }
        
        
        int largest = findLargest(numbers);
        System.out.println("The largest integer is: " + largest);
        
        scanner.close(); 
    }
}
