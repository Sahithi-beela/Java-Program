import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Customer implements Comparable<Customer> {
    private String name;
    private String mobile;

    
    public Customer(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    
    
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    
    public String toString() {
        return name + ", " + mobile;
    }
}

public class CustomerSorter {

    public static List<Customer> extractCustomersFromFile(File file) throws IOException {
        List<Customer> customers = new ArrayList<>();
        
       
        List<String> lines = Files.readAllLines(file.toPath());

        
        String regex = "^([a-zA-Z ]+),\\s*(\\d{10})$";
        Pattern pattern = Pattern.compile(regex);

        
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);

            
            if (matcher.matches()) {
                String name = matcher.group(1);
                String mobile = matcher.group(2);
                customers.add(new Customer(name, mobile));
            }
        }

        return customers;
    }

    public static void main(String[] args) {
       
        File file = new File("customers.txt");

        
        try {
           
            List<Customer> customers = extractCustomersFromFile(file);

            
            Collections.sort(customers);

            
            System.out.println("Customers in sorted order:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}