public class Student {
    private String adminNo;
    private String stuName;
    private String courseJoined;
    private double feesPaid;

    
    private static final double JAVA_FEE = 10000.0;
    private static final double PYTHON_FEE = 7500.0;

   
    public Student(String adminNo, String stuName) {
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = "JAVA"; 
        this.feesPaid = 0.0;
    }

    
    public Student(String adminNo, String stuName, String courseJoined) {
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = courseJoined.equals("PYTHON") ? "PYTHON" : "JAVA"; // Validate course
        this.feesPaid = 0.0;
    }

   
    public double getTotalFee() {
        return courseJoined.equals("PYTHON") ? PYTHON_FEE : JAVA_FEE;
    }

    
    public double getDue() {
        return getTotalFee() - feesPaid;
    }

    
    public double getFeePaid() {
        return feesPaid;
    }

    
    public void payment(double amount) {
        if (amount > 0) {
            feesPaid += amount;
            if (feesPaid > getTotalFee()) {
                feesPaid = getTotalFee(); 
            }
        } else {
            System.out.println("Invalid payment amount. Payment should be greater than 0.");
        }
    }

    
    public String getAdminNo() {
        return adminNo;
    }

    public String getStuName() {
        return stuName;
    }

    public String getCourseJoined() {
        return courseJoined;
    }

    
    public static void main(String[] args) {
        Student student1 = new Student("123", "John Doe");
        System.out.println("Total Fee: " + student1.getTotalFee());
        student1.payment(5000);
        System.out.println("Fees Paid: " + student1.getFeePaid());
        System.out.println("Due Amount: " + student1.getDue());
    }
}
