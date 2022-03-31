import java.util.Objects;

public class Menu {

    private String name;
    private String mainDish;
    private String sideDish;
    private String beverage;
    private double price;

    public Menu(String menuName, String mainDish, String sideDish, String beverage, double price) {
        this.name = menuName;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Double.compare(menu.getPrice(), getPrice()) == 0 && Objects.equals(getName(), menu.getName()) && Objects.equals(getMainDish(), menu.getMainDish()) && Objects.equals(getSideDish(), menu.getSideDish()) && Objects.equals(getBeverage(), menu.getBeverage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMainDish(), getSideDish(), getBeverage(), getPrice());
    }

    @Override
    public String toString() {
        return name + " " +
                mainDish + " " +
                sideDish + " " +
                beverage + " " +
                price + " ";
    }
}
