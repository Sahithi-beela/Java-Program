public class Product {
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    
    public Product(int prodId, String prodName, double price, int quantityOnHand) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    
    public double getNetPrice() {
        double taxRate = 0.12;
        return price * (1 + taxRate);
    }

    
    public String purchase(int quantity) {
        if (quantity > 0) {
            quantityOnHand += quantity;
            return "Purchased " + quantity + " units. New stock: " + quantityOnHand + ".";
        } else {
            return "Invalid quantity. Purchase must be greater than zero.";
        }
    }

   
    public String sell(int quantity) {
        if (quantity > 0) {
            if (quantity <= quantityOnHand) {
                quantityOnHand -= quantity;
                return "Sold " + quantity + " units. Remaining stock: " + quantityOnHand + ".";
            } else {
                return "Insufficient stock for this sale.";
            }
        } else {
            return "Invalid quantity. Sale must be greater than zero.";
        }
    }

    
    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 1000.00, 50);
        
        System.out.printf("Net price after tax: %.2f%n", product.getNetPrice());
        
        System.out.println(product.purchase(10));
        System.out.println(product.sell(5));
        System.out.println(product.sell(60));  
    }
}
