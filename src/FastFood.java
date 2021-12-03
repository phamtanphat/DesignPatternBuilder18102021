import enums.Combo;
import enums.Drink;
import enums.HamburgerType;
import enums.Snack;

public class FastFood {
    private HamburgerType hamburgerType;
    private Snack snack;
    private Drink drink;
    private Combo combo;

    public FastFood(HamburgerType hamburgerType, Snack snack, Drink drink, Combo combo) {
        this.hamburgerType = hamburgerType;
        this.snack = snack;
        this.drink = drink;
        this.combo = combo;
    }

    public HamburgerType getHamburgerType() {
        return hamburgerType;
    }

    public void setHamburgerType(HamburgerType hamburgerType) {
        this.hamburgerType = hamburgerType;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public class Builder implements FastFoodBuilder{
        private HamburgerType hamburgerType;
        private Snack snack;
        private Drink drink;
        private Combo combo;
        @Override
        public FastFoodBuilder setHamburgerType(HamburgerType hamburgerType) {
            this.hamburgerType = hamburgerType;
            return this;
        }

        @Override
        public FastFoodBuilder setSnack(Snack snack) {
            this.snack = snack;
            return this;
        }

        @Override
        public FastFoodBuilder setDrink(Drink drink) {
            this.drink = drink;
            return this;
        }

        @Override
        public FastFoodBuilder setCombo(Combo combo) {
            this.combo = combo;
            return this;
        }

        @Override
        public FastFood build() {
            return new FastFood(hamburgerType,snack,drink,combo);
        }
    }
}
