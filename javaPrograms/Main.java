// Superclass for general employees
class Employee {
    // Attributes common to all employees
    private int emp_id;
    private String emp_name;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }

    // Getter methods for the employee details
    public int getEmpId() {
        return emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Salary: Rs." + salary);
    }
}

// Subclass for factory employees
class FactoryEmployee extends Employee {
    // Additional attributes for factory employees
    private int bus_no;
    private boolean emp_boards;

    // Constructor to initialize both Employee and FactoryEmployee details
    public FactoryEmployee(int emp_id, String emp_name, double salary, int bus_no, boolean emp_boards) {
        // Call the superclass constructor to initialize common attributes
        super(emp_id, emp_name, salary);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

    // Getter methods for factory employee specific details
    public int getBusNo() {
        return bus_no;
    }

    public boolean doesEmpBoard() {
        return emp_boards;
    }

    // Method to display factory employee details
    @Override
    public void displayEmployeeDetails() {
        // Call the superclass method to display common employee details
        super.displayEmployeeDetails();
        // Display additional factory employee-specific details
        System.out.println("Bus Number: " + bus_no);
        System.out.println("Boards the Bus: " + (emp_boards ? "Yes" : "No"));
    }

    // Method to change the bus boarding status
    public void updateBoardingStatus(boolean boards) {
        this.emp_boards = boards;
        System.out.println("Boarding status updated to: " + (emp_boards ? "Yes" : "No"));
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a factory employee object
        FactoryEmployee emp1 = new FactoryEmployee(101, "John Doe", 30000, 12, true);

        // Display details of the factory employee
        emp1.displayEmployeeDetails();

        // Update the boarding status
        emp1.updateBoardingStatus(false);

        // Display updated details of the factory employee
        emp1.displayEmployeeDetails();
    }
}