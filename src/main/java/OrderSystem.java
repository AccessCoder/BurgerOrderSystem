import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {

    private Map<Integer, Menu> orderSystem = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private int amountOfMenus = 0;

    public OrderSystem() {
    }

    public String addNewMenuToTheMap(Menu menu) {
        amountOfMenus++;
        orderSystem.put(amountOfMenus, menu);
        return menu.getMenuName();
    }

    public String placeOrder() {
        System.out.println("Please choose a menu between 1 and " + orderSystem.size());
        int chosenMenu = scanner.nextInt();
        try {
            Menu order = orderSystem.get(chosenMenu);
            System.out.println(order.toString());
            return order.getMenuName();
        } catch (NullPointerException | InputMismatchException e) {
            placeOrder();
        }
        return "";
    }
}
