import java.util.Scanner;

public class VerticalStringDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        System.out.println("The string displayed vertically is:");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }

        scanner.close();
    }
}
