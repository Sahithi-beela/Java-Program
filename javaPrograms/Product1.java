// Superclass
public class Product1 {
    protected String name;
    protected double basePrice;

    // Constructor
    public Product1(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    // Method to print product details
    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: " + basePrice);
    }

    // Setter for base price
    public void setPrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Abstract method for net price
    public double getNetPrice() {
        return basePrice; // Default implementation
    }
}

// Subclass for Imported Products
class ImportedProducts extends Product {
    private double importDuty; // As a percentage

    // Constructor
    public ImportedProducts(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    // Method to set import duty
    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    // Override getNetPrice to include import duty
    @Override
    public double getNetPrice() {
        return basePrice + (basePrice * importDuty / 100);
    }

    // Override print method
    @Override
    public void print() {
        super.print();
        System.out.println("Import Duty: " + importDuty + "%");
        System.out.println("Net Price: " + getNetPrice());
    }
}

// Subclass for Discounted Products
class DiscountedProducts extends Product {
    private double discountRate; // As a percentage

    // Constructor
    public DiscountedProducts(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    // Method to set discount rate
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Override getNetPrice to include discount
    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    // Override print method
    @Override
    public void print() {
        super.print();
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price: " + getNetPrice());
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Upcasting
        Product importedProduct = new ImportedProducts("Luxury Watch", 5000.0, 15.0);
        Product discountedProduct = new DiscountedProducts("Smartphone", 3000.0, 10.0);

        // Print details using polymorphism
        importedProduct.print();
        System.out.println();
        discountedProduct.print();
        System.out.println();

        // Downcasting
        if (importedProduct instanceof ImportedProducts) {
            ImportedProducts impProduct = (ImportedProducts) importedProduct;
            impProduct.setImportDuty(20.0); // Changing import duty
            System.out.println("Updated Imported Product Net Price after changing import duty:");
            impProduct.print();
        }

        if (discountedProduct instanceof DiscountedProducts) {
            DiscountedProducts discProduct = (DiscountedProducts) discountedProduct;
            discProduct.setDiscountRate(15.0); // Changing discount rate
            System.out.println("Updated Discounted Product Net Price after changing discount rate:");
            discProduct.print();
        }
    }
}
