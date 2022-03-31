import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderSystem {

    private Map<String, Menu> menus = new HashMap<>();

    public OrderSystem() {
        super();
    }

    public String addMenu(String menuKey, Menu menu) {
        menus.put(menuKey, menu);
        return menu.getName();
    }

    public String placeOrder() {
        System.out.println("Please choose a menu from: " + this);
        Scanner scanner = new Scanner(System.in);

        try {
            String chosenMenu = scanner.nextLine();
            return getOrderById(chosenMenu).getName();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return placeOrder();
        }
    }

    public Menu getOrderById(String id) {
        if (menus.containsKey(id)) {
            Menu order = menus.get(id);

            System.out.println("\nYou have ordered: \n");
            System.out.println(order.toString() + "\n");
            System.out.println("That's " + order.getPrice() + "€ please :)");
            return order;
        } else {
            throw new NoSuchElementException("Menu doesn't exist!");
        }
    }

    @Override
    public String toString() {
        String menusAsString = "";
        for (String key : menus.keySet()) {
            menusAsString += "\n" + "[" + key + "] " + menus.get(key);
        }
        return menusAsString;
    }
}
