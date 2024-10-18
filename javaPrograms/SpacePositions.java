import java.util.Scanner;

public class SpacePositions {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        StringBuilder positions = new StringBuilder();

        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
             
                positions.append(i).append(" ");
            }
        }

        
        if (positions.length() > 0) {
            System.out.println("Positions of spaces: " + positions.toString().trim());
        } else {
            System.out.println("No spaces found in the string.");
        }

        
        scanner.close();
    }
}
