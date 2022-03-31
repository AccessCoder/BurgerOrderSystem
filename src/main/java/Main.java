public class Main {

    public static void main(String[] args) {


        Menu menu1 = new Menu("Small Burger Menu", "Burger", "Fries", "Softdrink", "", 4.50);
        Menu menu2 = new Menu("Medium Burger Menu", "Burger", "Fries", "Softdrink", "Dip", 5.50);
        Menu menu3 = new Menu("Big Burger Menu", "Burger", "Fries", "Softdrink", "Dip & extra Fries", 6.99);
        Menu menu4 = new Menu("Supersize Menu", "2 Burgers", "2 Fries", "2 Softdrinks", "Cake", 15.50);
        Menu menu5 = new Menu("Fitness Burger Menu", "Veggie Burger", "Salad", "Mineral Water", "Apple", 5.99);
        Menu menu6 = new Menu("Kids Burger Menu", "Small Burger", "Small Fries", "Milk", "Apple", 3.75);

        OrderSystem burgerStore = new OrderSystem();

        burgerStore.addNewMenuToTheMap(menu1);
        burgerStore.addNewMenuToTheMap(menu2);
        burgerStore.addNewMenuToTheMap(menu3);
        burgerStore.addNewMenuToTheMap(menu4);
        burgerStore.addNewMenuToTheMap(menu5);
        burgerStore.addNewMenuToTheMap(menu6);

        burgerStore.placeOrder();
    }

}
