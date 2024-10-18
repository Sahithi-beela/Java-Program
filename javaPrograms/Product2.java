
class Product {
    private String name;
    protected double basePrice; 

    
    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    
    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: $" + basePrice);
    }

   
    public void setPrice(double price) {
        this.basePrice = price;
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
        return basePrice + (basePrice * importDuty / 100); // basePrice + import duty percentage
    }

    
    @Override
    public void print() {
        super.print(); 
        System.out.println("Import Duty: " + importDuty + "%");
        System.out.println("Net Price (with Import Duty): $" + getNetPrice());
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

    
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100); 
    }

    
    
    public void print() {
        super.print(); 
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price (with Discount): $" + getNetPrice());
    }
}


public class Main {
    public static void main(String[] args) {
       
        ImportedProducts importedProduct = new ImportedProducts("Laptop", 1000, 10); 
        importedProduct.print(); 

        
        Product product1 = importedProduct;
        System.out.println("Net Price from Product reference (Upcasting): $" + product1.getNetPrice());

        
        if (product1 instanceof ImportedProducts) {
            ImportedProducts downcastedImportedProduct = (ImportedProducts) product1;
            downcastedImportedProduct.setImportDuty(15);
            downcastedImportedProduct.print(); 
        }

        System.out.println("\n-------------------------------\n");

        
        DiscountedProducts discountedProduct = new DiscountedProducts("Smartphone", 800, 20); 
        discountedProduct.print(); 

       
        Product product2 = discountedProduct;
        System.out.println("Net Price from Product reference (Upcasting): $" + product2.getNetPrice());

        
        if (product2 instanceof DiscountedProducts) {
            DiscountedProducts downcastedDiscountedProduct = (DiscountedProducts) product2;
            downcastedDiscountedProduct.setDiscountRate(25); 
            downcastedDiscountedProduct.print(); 
        }
    }
}