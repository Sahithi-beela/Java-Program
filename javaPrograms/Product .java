public class Product {
    private String prodId, prodName;
    private double price;
    private int quantityOnHand;

    
    public Product(String prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0; 
    }

    
    public Product(String prodId, String prodName) {
        this(prodId, prodName, 0.0); 
    }

    
    public Product(String prodId) {
        this(prodId, "Unknown Product", 0.0); 
    }

    public double getNetPrice() {
        return price * 1.12; 
    }

    public void purchase(int quantity) {
        if (quantity > 0) quantityOnHand += quantity;
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= quantityOnHand) quantityOnHand -= quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 1000.00);
        Product product2 = new Product("P002", "Smartphone");
        Product product3 = new Product("P003");

        System.out.println("Product 1 Net Price: " + product1.getNetPrice());
        System.out.println("Product 2 Net Price: " + product2.getNetPrice());
        System.out.println("Product 3 Net Price: " + product3.getNetPrice());

        product1.purchase(10);
        product2.purchase(5);
        product3.purchase(2);

        product1.sell(3);
        product2.sell(1);
        product3.sell(2);
    }
}
