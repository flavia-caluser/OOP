package Company.BurgerApp;

import java.util.Arrays;

public class BaseBurger {

    private String breadType;
    private String meatType;
    private final double basePrice;
    private Addition[] additions;

    private int numberOfAdditionsAdded;

    public BaseBurger(String breadType, String meatType) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = 20;
        this.additions = new Addition[4];
        this.numberOfAdditionsAdded = 0;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getBasePrice() {
        return basePrice;
    }


    public Addition[] getAdditions() {
        return additions;
    }

    public void setAdditions(Addition[] additions) {
        this.additions = additions;
    }

    public int getNumberOfAdditionsAdded() {
        return numberOfAdditionsAdded;
    }

    public void setNumberOfAdditionsAdded(int numberOfAdditionsAdded) {
        this.numberOfAdditionsAdded = numberOfAdditionsAdded;
    }


    public boolean handleAddition(Addition addition) throws Exception{
        if (numberOfAdditionsAdded == 4){
            throw new Exception("Numarul maxim de adaugiri a fost atins");
        }
        addAddition(addition);
        return true;
    }

    public boolean addAddition(Addition addition){
        additions[numberOfAdditionsAdded]= addition;
        numberOfAdditionsAdded++;
        return true;
    }

    public double calculatePrice(){
        double sum = 20.0;
        if(numberOfAdditionsAdded == 0){
            return basePrice;
        } else {
            for (int i = 0; i < numberOfAdditionsAdded; i++) {
                sum += additions[i].getPrice();
            }
            return sum;
        }
    }

    @Override
    public String toString() {
        return "BaseBurger{" +
                "breadType='" + breadType + '\'' +
                ", meatType='" + meatType + '\'' +
                ", basePrice=" + basePrice +
                ", additions=" + Arrays.toString(additions) +
                ", numberOfAdditionsAdded=" + numberOfAdditionsAdded +
                '}';
    }
}
