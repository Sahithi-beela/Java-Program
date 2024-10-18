import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesFromTwoFiles {
    public static void main(String[] args) {
        String file1 = "names1.txt"; 
        String file2 = "names2.txt"; 

        Set<String> uniqueNames = new LinkedHashSet<>();

        
        readNamesFromFile(file1, uniqueNames);
        
        readNamesFromFile(file2, uniqueNames);

        
        System.out.println("Unique names in the order they appear:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }

   
    private static void readNamesFromFile(String filename, Set<String> uniqueNames) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String name;
            while ((name = reader.readLine()) != null) {
                uniqueNames.add(name.trim()); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file " + filename + ": " + e.getMessage());
        }
    }
}