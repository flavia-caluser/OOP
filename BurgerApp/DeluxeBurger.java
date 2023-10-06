package Company.BurgerApp;

public class DeluxeBurger extends BaseBurger {
    public DeluxeBurger(String breadType, String meatType) {
        super(breadType, meatType);
        setAdditions(new Addition[2]);
    }

    public boolean handleAddition(Addition addition) throws Exception{
        if (getNumberOfAdditionsAdded() == 2 || (!addition.getName().equals("cartofi prajiti") && !addition.getName().equals("bautura"))){
            throw new Exception("Numarul maxim de adaugiri a fost atins");
        }
        addAddition(addition);
        return true;
    }
}
