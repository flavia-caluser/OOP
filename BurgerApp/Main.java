package Company.BurgerApp;

public class Main {

    public static void main(String[] args) {
        BaseBurger baseBurger = new BaseBurger("alba","porc");
        try {
            baseBurger.handleAddition(new Addition("ceapa", 1));
            baseBurger.handleAddition(new Addition("rosie", 2));
            baseBurger.handleAddition(new Addition("rosie", 2));
            baseBurger.handleAddition(new Addition("rosie", 2));
            baseBurger.handleAddition(new Addition("rosie", 2));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(baseBurger.calculatePrice());
        System.out.println(baseBurger.toString());

        BaseBurger deluxeBurger = new DeluxeBurger("neagra","pui");
        try {
            deluxeBurger.handleAddition(new Addition("cartofi prajiti", 4));
            deluxeBurger.handleAddition(new Addition("rosii", 2));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(deluxeBurger.calculatePrice());
        System.out.println(deluxeBurger);


    }
}
