package DSA.ScenerioBasedProblems.OnlineShoppingSystem;

public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;
    private Seller seller;

    // Constructor
    public Product(int productId, String productName, String category,
                   double price, double rating,
                   boolean inStock, Seller seller) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
        this.seller = seller;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Seller getSeller() {
        return seller;
    }

    // Overloaded Method
    public void display() {
        System.out.println(this);
    }

    public void display(String message) {
        System.out.println(message);
        display();
    }

    @Override
    public String toString() {
        return "\nProduct ID : " + productId +
                "\nProduct Name : " + productName +
                "\nCategory : " + category +
                "\nPrice : ₹" + price +
                "\nRating : " + rating +
                "\nIn Stock : " + inStock +
                "\nSeller : " + seller.getName();
    }
}