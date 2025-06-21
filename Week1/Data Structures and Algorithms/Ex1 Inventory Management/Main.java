import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}

class Inventory {
    // Using HashMap for fast lookup by productId
    Map<Integer, Product> products = new HashMap<>();

    // Add new product
    void addProduct(Product product) {
        if (products.containsKey(product.productId)) {
            System.out.println("Product already exists!");
        } else {
            products.put(product.productId, product);
            System.out.println("Product added.");
        }
    }

    // Update existing product
    void updateProduct(int productId, String name, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    void deleteProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        inventory.addProduct(new Product(101, "Keyboard", 50, 699.0));
        inventory.addProduct(new Product(102, "Mouse", 70, 399.0));
        inventory.addProduct(new Product(103, "Monitor", 20, 7499.0));

        // Displaying inventory
        System.out.println("\n--- Inventory ---");
        inventory.displayInventory();

        // Updating a product
        inventory.updateProduct(102, "Wireless Mouse", 65, 499.0);

        // Deleting a product
        inventory.deleteProduct(101);

        // Display after update/delete
        System.out.println("\n--- Updated Inventory ---");
        inventory.displayInventory();
    }
}
