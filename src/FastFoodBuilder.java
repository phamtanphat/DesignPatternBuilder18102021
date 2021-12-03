import enums.Combo;
import enums.Drink;
import enums.HamburgerType;
import enums.Snack;

public interface FastFoodBuilder {

    FastFoodBuilder setHamburgerType(HamburgerType hamburgerType);

    FastFoodBuilder setSnack(Snack snack);

    FastFoodBuilder setDrink(Drink drink);

    FastFoodBuilder setCombo(Combo combo);

    FastFood build();
}

