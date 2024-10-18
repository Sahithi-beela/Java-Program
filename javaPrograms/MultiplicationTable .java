class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        int length = 10;

        System.out.printf("Multiplication Table for %d:\n", number);
        System.out.printf("%-10s %-10s\n", "Number", "Result");
        System.out.println("-----------------------");

        for (int i = 1; i <= length; i++) {
            System.out.printf("%-10d %-10d\n", i, number * i);
        }
    }
}
