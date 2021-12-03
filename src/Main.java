import enums.Drink;
import enums.HamburgerType;

public class Main {
    public static void main(String[] args) {

        FastFood fastFood = new FastFood.Builder()
                .setHamburgerType(HamburgerType.BACON_BURGER)
                .setDrink(Drink.COCA)
                .build();
        System.out.println(fastFood.toString());
    }
}
