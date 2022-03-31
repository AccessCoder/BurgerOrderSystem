public class Menu {

    private String MenuName;
    private String MainDish;
    private String SideDish;
    private String beverage;
    private String Bonus;
    private double price;

    public Menu(String menuName, String mainDish, String sideDish, String beverage, String bonus, double price) {
        this.MenuName = menuName;
        this.MainDish = mainDish;
        this.SideDish = sideDish;
        this.beverage = beverage;
        this.Bonus = bonus;
        this.price = price;
    }

    @Override
    public String toString() {
        return    "You ordered the: " + MenuName + '\n' +
                "it contains:\n"+
                MainDish + '\n' +
                SideDish + '\n' +
                beverage + '\n' +
                Bonus + '\n' +
                "That´s "+ price +"€, please!";
    }

    public String getMenuName() {
        return MenuName;
    }

    public String getMainDish() {
        return MainDish;
    }

    public String getSideDish() {
        return SideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public String getBonus() {
        return Bonus;
    }

    public double getPrice() {
        return price;
    }
}
