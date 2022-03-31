public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu("Small Burger Menu", "Burger", "Fries", "Softdrink", 4.50);
        Menu menu2 = new Menu("Medium Burger Menu", "Burger", "Fries", "Softdrink", 5.50);
        Menu menu3 = new Menu("Big Burger Menu", "Burger", "Fries", "Softdrink", 6.99);
        Menu menu4 = new Menu("Supersize Menu", "2 Burgers", "2 Fries", "2 Softdrinks", 15.50);
        Menu menu5 = new Menu("Fitness Burger Menu", "Veggie Burger", "Salad", "Mineral Water", 5.99);
        Menu menu6 = new Menu("Kids Burger Menu", "Small Burger", "Small Fries", "Milk", 3.75);

        OrderSystem burgerStore = new OrderSystem();

        burgerStore.addMenu("1", menu1);
        burgerStore.addMenu("2", menu2);
        burgerStore.addMenu("3", menu3);
        burgerStore.addMenu("4", menu4);
        burgerStore.addMenu("5", menu5);
        burgerStore.addMenu("F", menu6);

        burgerStore.placeOrder();
    }

}
