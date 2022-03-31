import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderSystemTest {

    @Test
    void addMenu_whenAddMenu_thenOrderSystemContainsMenu() {
        // GIVEN
        OrderSystem orderSystem = new OrderSystem();
        Menu menu1a = new Menu("Hühnchen mit Reis", "Hühnchen", "Reis", "Wasser", 6.50);

        // WHEN
        orderSystem.addMenu("1a", menu1a);
        Menu actual = orderSystem.getOrderById("1a");

        // THEN
        Menu expected = new Menu("Hühnchen mit Reis", "Hühnchen", "Reis", "Wasser", 6.50);

        assertEquals(expected, actual);
    }

    @Test
    void getOrderById_whenValidKey_thenReturnMenu() {
        // GIVEN
        OrderSystem orderSystem = new OrderSystem();
        Menu menu1a = new Menu("Hühnchen mit Reis", "Hühnchen", "Reis", "Wasser", 6.50);
        orderSystem.addMenu("1a", menu1a);

        // WHEN
        Menu result = orderSystem.getOrderById("1a");

        // THEN
        Menu expected = new Menu("Hühnchen mit Reis", "Hühnchen", "Reis", "Wasser", 6.50);

        assertEquals(expected, result);
    }

    @Test
    void getOrderById_whenKeyDoesNotExist_ReturnException() {
        // GIVEN
        OrderSystem myLittleOrderSystem = new OrderSystem();
        Menu menu1a = new Menu("Hühnchen mit Reis", "Hühnchen", "Reis", "Wasser", 6.50);
        myLittleOrderSystem.addMenu("1a", menu1a);

        // WHEN // THEN
        assertThrows(NoSuchElementException.class, () -> myLittleOrderSystem.getOrderById("QuatschKey"));
    }

    @Test
    void toString_returnsMenusAsString() {
        // GIVEN
        OrderSystem orderSystem = new OrderSystem();
        Menu dummyMenu = new Menu("Small Burger Menu", "Burger", "Fries", "Softdrink", 4.50);
        orderSystem.addMenu("A", dummyMenu);

        String expected = "\n[A] Small Burger Menu Burger Fries Softdrink ";

        // WHEN
        String actual = orderSystem.toString();

        // THEN
        assertEquals(expected, actual);
    }
}
