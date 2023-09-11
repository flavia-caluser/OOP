package Company.BankingAppEx6;

public class Main {
    public static void main(String[] args) {

        BankAccount cont1 = new SpendingAccount(5000,"nr1", 30000);
        BankAccount cont2 = new StudentAccount(3000, "nr2");
        BankAccount cont3 = new StudentAccount(3000, "nr3");

        BankAccount[] listaConturi = {cont1, cont2, cont3};

        Person person1 = new Person("Georgel", "Georgescu", listaConturi, 2);


        person1.addAccount(cont3);
//        person1.listAccounts();
//        person1.checkAccountDetails("nr2");
//        person1.deposit("nr1", 2500);
//        person1.deposit("nr3", 25001);
//        person1.listAccounts();
    }
}
