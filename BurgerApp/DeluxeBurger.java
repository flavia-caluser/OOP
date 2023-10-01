package Company.BurgerApp;

public class DeluxeBurger extends BaseBurger {
    public DeluxeBurger(String breadType, String meatType) {
        super(breadType, meatType);
        setAdditions(new Addition[2]);
    }
}
