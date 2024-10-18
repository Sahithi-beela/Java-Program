import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();  

        System.out.println("Enter strings (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine();

            
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            
            strings.add(input);
        }

       
        Collections.sort(strings);

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_strings.txt"))) {
            for (String str : strings) {
                writer.write(str);
                writer.newLine(); 
            }

            System.out.println("Sorted strings have been written to sorted_strings.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        
        scanner.close();
    }
}