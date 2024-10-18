
public class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    
    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: " + basePrice);
    }

   
    public void setPrice(double basePrice) {
        this.basePrice = basePrice;
    }

   
    public double getNetPrice() {
        return basePrice; 
    }
}


class ImportedProducts extends Product {
    private double importDuty; 

    
    public ImportedProducts(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    
    @Override
    public double getNetPrice() {
        return basePrice + (basePrice * importDuty / 100);
    }

    
    @Override
    public void print() {
        super.print();
        System.out.println("Import Duty: " + importDuty + "%");
        System.out.println("Net Price: " + getNetPrice());
    }
}


class DiscountedProducts extends Product {
    private double discountRate; 

    
    public DiscountedProducts(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    
    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    /
    @Override
    public void print() {
        super.print();
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price: " + getNetPrice());
    }
}


public class Main {
    public static void main(String[] args) {
        
        Product importedProduct = new ImportedProducts("Luxury Watch", 5000.0, 15.0);
        Product discountedProduct = new DiscountedProducts("Smartphone", 3000.0, 10.0);

        
        importedProduct.print();
        System.out.println();
        discountedProduct.print();
        System.out.println();

        
        if (importedProduct instanceof ImportedProducts) {
            ImportedProducts impProduct = (ImportedProducts) importedProduct;
            impProduct.setImportDuty(20.0); 
            System.out.println("Updated Imported Product Net Price after changing import duty:");
            impProduct.print();
        }

        if (discountedProduct instanceof DiscountedProducts) {
            DiscountedProducts discProduct = (DiscountedProducts) discountedProduct;
            discProduct.setDiscountRate(15.0);
            System.out.println("Updated Discounted Product Net Price after changing discount rate:");
            discProduct.print();
        }
    }
}
