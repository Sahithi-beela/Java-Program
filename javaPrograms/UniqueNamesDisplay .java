import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesDisplay {
    public static void main(String[] args) {
        String filename = "names.txt"; 

        Set<String> uniqueNames = new HashSet<>();

       
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String name;
            while ((name = reader.readLine()) != null) {
                uniqueNames.add(name.trim()); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return; 

        
        TreeSet<String> sortedUniqueNames = new TreeSet<>(uniqueNames);

       
        System.out.println("Unique names in sorted order:");
        for (String uniqueName : sortedUniqueNames) {
            System.out.println(uniqueName);
        }
    }
}