import java.util.Scanner;

public class InvertCase {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        StringBuilder invertedCase = new StringBuilder();

        
        for (char ch : input.toCharArray()) {
           
            if (Character.isUpperCase(ch)) {
                invertedCase.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                invertedCase.append(Character.toUpperCase(ch));
            } else {
                invertedCase.append(ch); 
            }
        }

        
        System.out.println("Inverted case: " + invertedCase.toString());

       
        scanner.close();
    }
}