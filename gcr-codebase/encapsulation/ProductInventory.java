class Product {

    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count whenever a product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println();
    }

    // Class method (static)
    static void displayTotalProducts() {
        System.out.println("Total Products Created = " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {

        // Creating products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 3000);

        // Display details of each product
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total number of products
        Product.displayTotalProducts();
    }
}