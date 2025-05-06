import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        // HashMap to store productId n quantity
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add 3 products
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 70);

        // Update quantity of productId 102
        inventory.put(102, 45);

        // Remove productId 101
        inventory.remove(101);

        // Display final inventory
        System.out.println("Final Inventory:");
        for (Integer productId : inventory.keySet()) {
            int quantity = inventory.get(productId);
            System.out.println("Product ID: " + productId + ", Quantity: " + quantity);
        }
    }
}
