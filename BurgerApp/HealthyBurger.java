package Company.BurgerApp;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger(String meat) {
        super("secara", meat);
        Addition[] additions = new Addition[6];
        setAdditions(additions);
    }

    public boolean handleAddition(Addition addition) throws Exception{
        if (getNumberOfAdditionsAdded() == 6){
            throw new Exception("Numarul maxim de adaugiri a fost atins");
        }
        addAddition(addition);
        return true;
    }






}
