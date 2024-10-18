import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int[] numbers = new int[5];
        
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); 
        }
        
        
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]); 
        }
        
        scanner.close();
    }
}
