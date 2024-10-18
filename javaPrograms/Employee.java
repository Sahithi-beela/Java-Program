
class Employee {
    private String name;
    private int id;
    private double salary;

    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}


class FactoryEmployee extends Employee {
    private int busNo;
    private int empBoards;

   
    public FactoryEmployee(String name, int id, double salary, int busNo, int empBoards) {
        super(name, id, salary); 
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    
    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getEmpBoards() {
        return empBoards;
    }

    public void setEmpBoards(int empBoards) {
        this.empBoards = empBoards;
    }

   
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); 
        System.out.println("Bus Number: " + busNo);
        System.out.println("Employees Boarded: " + empBoards);
    }
}


public class Main {
    public static void main(String[] args) {
       
        FactoryEmployee factoryEmployee = new FactoryEmployee("John Doe", 101, 50000, 42, 30);

        
        factoryEmployee.displayEmployeeDetails();
    }
}