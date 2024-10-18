import java.util.Scanner;

public class StringSeparator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        System.out.print("Enter the separator (space, comma, etc.): ");
        String separator = scanner.nextLine();

        
        String[] words = input.split(separator);

        System.out.println("\nWords displayed on separate lines:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}