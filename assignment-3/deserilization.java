import java.io.*;
class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}
public class deserilization {
    public static void main(String[] args) {
        Product product = new Product(1, "Product A", "Category A", 100.0);
        try {
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(product);
            objectOut.close();
            fileOut.close();
            System.out.println("Product object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Product restoredProduct = null;
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            restoredProduct = (Product) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("\nProduct object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (restoredProduct != null) {
            System.out.println("\nRestored Product Details:");
            restoredProduct.printDetails();
        }
    }
}
