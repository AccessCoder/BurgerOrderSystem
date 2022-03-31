import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderSystem {

    private Map<String, Menu> orderSystem = new HashMap<>();

    public OrderSystem() {
    }

    public String addNewMenuToTheMap(Menu menu) {
        orderSystem.put(String.valueOf(orderSystem.size() + 1), menu);
        return menu.getMenuName();
    }

    public String placeOrder() {
        System.out.println("Please choose a menu between 1 and " + orderSystem.size());
        Scanner scanner = new Scanner(System.in);
        try {
            String chosenMenu = scanner.nextLine();
            return getOrderById(chosenMenu).getMenuName();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return placeOrder();
        }
    }

    private Menu getOrderById(String id) {
        if (orderSystem.containsKey(id)) {
            Menu order = orderSystem.get(id);
            System.out.println(order.toString());
            return order;
        } else {
            throw new NoSuchElementException("Menü existiert nicht");
        }
    }
}
