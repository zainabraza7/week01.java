import java.util.Scanner;
import java.util.HashMap;

public class miniproject{

    static HashMap<String, Integer> inventory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Fruits available");
        System.out.println("1.Apple");
        System.out.println("2.Banana");
        System.out.println("3.Orange");

        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 40);

        while (true) {

            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. Check Stock");
            System.out.println("4. Display Stock");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStock();
                    break;

                case 2:
                    removeStock();
                    break;

                case 3:
                    checkStock();
                    break;

                case 4:
                    displayInventory();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    // add
    static void addStock() {

        System.out.println("Enter fruit name to add stock: ");
        String fruitName = scanner.next();

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (inventory.containsKey(fruitName)) {

            int currentStock = inventory.get(fruitName);
            inventory.put(fruitName, currentStock + quantity);

            System.out.println("Stock updated successfully");
            System.out.println("Current stock of " + fruitName + ": " + inventory.get(fruitName));

        } else {
            System.out.println("Fruit not found in inventory.");
        }
    }

    static void removeStock() {

        System.out.println("Enter fruit name to remove stock: ");
        String fruitName = scanner.next();

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (inventory.containsKey(fruitName)) {

            int currentStock = inventory.get(fruitName);

            if (quantity > currentStock) {
                System.out.println("Not enough stock");
            } else {

                inventory.put(fruitName, currentStock - quantity);

                System.out.println("Stock updated successfully");
                System.out.println("Current stock of " + fruitName + ": "
                        + inventory.get(fruitName));
            }

        } else {
            System.out.println("Fruit not found in inventory.");
        }
    }

    static void checkStock() {

        System.out.print("Enter fruit name to check stock: ");
        String fruitName = scanner.next();

        if (inventory.containsKey(fruitName)) {

            int currentStock = inventory.get(fruitName);

            System.out.println("Stock available for " + fruitName + ": " + currentStock);

        } else {
            System.out.println("Fruit not found in inventory.");
        }
    }

    static void displayInventory() {

        System.out.println("==== All Products ====");

        int total = 0;

        for (String fruit : inventory.keySet()) {

            int qty = inventory.get(fruit);

            System.out.println(fruit + " : " + qty);

            total = total + qty;
        }

        System.out.println("-------------------");
        System.out.println("Total Stock = " + total);
    }
}