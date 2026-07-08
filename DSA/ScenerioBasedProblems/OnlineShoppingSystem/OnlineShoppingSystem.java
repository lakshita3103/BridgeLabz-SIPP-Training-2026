package DSA.ScenerioBasedProblems.OnlineShoppingSystem;

import java.util.*;
import java.util.stream.Collectors;

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        // -------------------- Sellers --------------------

        Seller s1 = new Seller(1, "Rahul", "rahul@gmail.com",
                "TechWorld", 4.8);

        Seller s2 = new Seller(2, "Aman", "aman@gmail.com",
                "FashionHub", 4.4);

        Seller s3 = new Seller(3, "Priya", "priya@gmail.com",
                "HomeStore", 4.9);

        ArrayList<Seller> sellers = new ArrayList<>();

        sellers.add(s1);
        sellers.add(s2);
        sellers.add(s3);

        // -------------------- Customers --------------------

        Customer c1 = new Customer(101, "Amit",
                "amit@gmail.com", "Delhi", true);

        Customer c2 = new Customer(102, "Neha",
                "neha@gmail.com", "Noida", false);

        Customer c3 = new Customer(103, "Rohan",
                "rohan@gmail.com", "Delhi", true);

        Customer c4 = new Customer(104, "Sneha",
                "sneha@gmail.com", "Lucknow", false);

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        // -------------------- Products --------------------

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(
                1,
                "Laptop",
                "Electronics",
                65000,
                4.8,
                true,
                s1));

        products.add(new Product(
                2,
                "Mouse",
                "Electronics",
                700,
                4.2,
                true,
                s1));

        products.add(new Product(
                3,
                "Shirt",
                "Clothing",
                1200,
                4.5,
                true,
                s2));

        products.add(new Product(
                4,
                "Shoes",
                "Clothing",
                2500,
                4.7,
                false,
                s2));

        products.add(new Product(
                5,
                "Chair",
                "Furniture",
                3500,
                4.6,
                true,
                s3));

        products.add(new Product(
                6,
                "Table",
                "Furniture",
                5000,
                4.4,
                true,
                s3));

        products.add(new Product(
                7,
                "Mobile",
                "Electronics",
                25000,
                4.9,
                true,
                s1));

        products.add(new Product(
                8,
                "Fan",
                "Home Appliances",
                1800,
                4.1,
                false,
                s3));

        // Stream API Operations start below
        // 1. Display all product names
        System.out.println("\n1. Product Names");
        products.stream()
                .map(product -> product.getProductName())
                .forEach(name -> System.out.println(name));

        // 2. Display products in stock
        System.out.println("\n2. Products In Stock");
        products.stream()
                .filter(product -> product.isInStock())
                .forEach(product -> System.out.println(product));

        // 3. Products costing more than 1000
        System.out.println("\n3. Products Costing More Than ₹1000");
        products.stream()
                .filter(product -> product.getPrice() > 1000)
                .forEach(product -> System.out.println(product));

        // 4. Prime Customers
        System.out.println("\n4. Prime Customers");
        customers.stream()
                .filter(customer -> customer.isPrimeMember())
                .forEach(customer -> System.out.println(customer));

        // 5. Sellers with rating above 4.5
        System.out.println("\n5. Sellers with Rating > 4.5");
        sellers.stream()
                .filter(seller -> seller.getSellerRating() > 4.5)
                .forEach(seller -> System.out.println(seller));

        // 6. Sort products by price
        System.out.println("\n6. Products Sorted by Price");
        products.stream()
                .sorted(Comparator.comparing(product -> product.getPrice()))
                .forEach(product -> System.out.println(product));

        // 7. Sort sellers by rating (descending)
        System.out.println("\n7. Sellers Sorted by Rating");
        sellers.stream()
                .sorted(Comparator.comparing((Seller seller) -> seller.getSellerRating()).reversed())
                .forEach(seller -> System.out.println(seller));

        // 8. Display unique categories
        System.out.println("\n8. Unique Categories");
        products.stream()
                .map(product -> product.getCategory())
                .distinct()
                .forEach(category -> System.out.println(category));

        // 9. Count products in stock
        long count = products.stream()
                .filter(product -> product.isInStock())
                .count();

        System.out.println("\n9. Products In Stock = " + count);

        // 10. Costliest Product
        Product maxProduct = products.stream()
                .max(Comparator.comparing(product -> product.getPrice()))
                .get();

        System.out.println("\n10. Costliest Product");
        System.out.println(maxProduct);

        // Cheapest Product
        Product minProduct = products.stream()
                .min(Comparator.comparing(product -> product.getPrice()))
                .get();

        System.out.println("\nCheapest Product");
        System.out.println(minProduct);

        // 11. Average Product Price
        double average = products.stream()
                .mapToDouble(product -> product.getPrice())
                .average()
                .orElse(0);

        System.out.println("\n11. Average Price = " + average);

        // 12. Total Product Value using reduce()
        double total = products.stream()
                .map(product -> product.getPrice())
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("\n12. Total Product Value = " + total);

        // 13. Check if all products are in stock
        boolean allStock = products.stream()
                .allMatch(product -> product.isInStock());

        System.out.println("\n13. All Products In Stock : " + allStock);

        // 14. Check if any customer belongs to Delhi
        boolean anyDelhi = customers.stream()
                .anyMatch(customer -> customer.getCity().equalsIgnoreCase("Delhi"));

        System.out.println("\n14. Any Customer From Delhi : " + anyDelhi);

        // 15. Find first Prime customer
        System.out.println("\n15. First Prime Customer");

        customers.stream()
                .filter(customer -> customer.isPrimeMember())
                .findFirst()
                .ifPresent(customer -> System.out.println(customer));

        // 16. Top 3 highest-rated products
        System.out.println("\n16. Top 3 Highest Rated Products");

        products.stream()
                .sorted(Comparator.comparing((Product product) -> product.getRating()).reversed())
                .limit(3)
                .forEach(product -> System.out.println(product));

        // 17. Group products by category
        System.out.println("\n17. Products Grouped By Category");

        Map<String, List<Product>> categoryMap =
                products.stream()
                        .collect(Collectors.groupingBy(product -> product.getCategory()));

        categoryMap.forEach((category, list) -> {
            System.out.println("\nCategory : " + category);
            list.forEach(product -> System.out.println(product));
        });

        // 18. Group products by seller
        System.out.println("\n18. Products Grouped By Seller");

        Map<String, List<Product>> sellerMap =
                products.stream()
                        .collect(Collectors.groupingBy(product -> product.getSeller().getName()));

        sellerMap.forEach((sellerName, list) -> {
            System.out.println("\nSeller : " + sellerName);
            list.forEach(product -> System.out.println(product));
        });

        // 19. Partition products into In Stock and Out Of Stock
        System.out.println("\n19. Partition Products");

        Map<Boolean, List<Product>> partitionMap =
                products.stream()
                        .collect(Collectors.partitioningBy(product -> product.isInStock()));

        partitionMap.forEach((status, list) -> {

            if (status)
                System.out.println("\nIn Stock");
            else
                System.out.println("\nOut Of Stock");

            list.forEach(product -> System.out.println(product));
        });

        // 20. Create Map<ProductId, Product>
        System.out.println("\n20. Product Map");

        Map<Integer, Product> productMap =
                products.stream()
                        .collect(Collectors.toMap(product -> product.getProductId(),
                                product -> product));

        productMap.forEach((id, product) -> {
            System.out.println(id + " -> " + product.getProductName());
        });

        // 21. Customer names separated by commas
        System.out.println("\n21. Customer Names");

        String names = customers.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}