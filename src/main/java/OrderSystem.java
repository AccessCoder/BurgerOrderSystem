import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderSystem {

    private final Map<String, Menu> menus = new HashMap<>();


    public void addMenu(String menuKey, Menu menu) {
        menus.put(menuKey, menu);
    }

    public Menu getOrderById(String id) {
        if (menus.containsKey(id)) {
            return menus.get(id);

        } else {
            throw new NoSuchElementException("Menu doesn't exist!");
        }
    }

    public void placeOrder() {
        System.out.println("Please choose a menu from: " + this);
        Scanner scanner = new Scanner(System.in);

        try {
            String chosenKey = scanner.nextLine();
            Menu chosenMenu = getOrderById(chosenKey);

            System.out.println("\nYou have ordered: \n");
            System.out.println(chosenMenu + "\n");
            System.out.println("That's " + chosenMenu.getPrice() + "€ please :)");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            placeOrder();
        }
    }

    @Override
    public String toString() {
        String menusAsString = "";
        for (String key : menus.keySet()) {
            menusAsString += "\n" + "[" + key + "] " + menus.get(key).toString();
        }
        return menusAsString;
    }
}
