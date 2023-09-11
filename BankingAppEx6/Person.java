package Company.BankingAppEx6;

public class Person {

    String firstName;
    String lastName;

    BankAccount[] accountList;
    int numberOfAccounts;

    public Person(String firstName, String lastName, BankAccount[] accountList, int numberOfAccounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
        this.numberOfAccounts = numberOfAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList() {
        this.accountList = new BankAccount[20];
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts() {
        this.numberOfAccounts = 0;
    }

    public void addAccount(BankAccount contNou) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].getAccountNumber().equals(contNou.getAccountNumber())){
                System.out.println("Contul exista deja in lista.");
            }else  if (numberOfAccounts == accountList.length) {
                System.out.println("Contul nu a fost adaugat, numarul maxim de conturi a fost atins.");
            } else {
                numberOfAccounts++;
                accountList[numberOfAccounts-1] = contNou;
                System.out.println("Contul a fost adaugat.");
            }
        }

    }

    public String findAccount(BankAccount cont){
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].equals(cont)){
                return cont.getAccountNumber();
            }
        }
        return null;
    }

    public void listAccounts(){
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Numarul contului " + (i+1) + " este "+ accountList[i].getAccountNumber() + " si soldul e  " + accountList[i].getBalance());
        }
    }

    public void deposit(String accountNumber, int amount){
        boolean contGasit = false;
        int a=0;
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].getAccountNumber().equals(accountNumber)){
                accountList[i].deposit(amount);
                a =  accountList[i].deposit(amount);
                if(accountList[i].deposit(amount) == -1){
                    System.out.println("Depunere nereusita. Suma depaseste suma maxima de depunere.");
                }else {
                    contGasit = true;
                }
            }
        }
        if (contGasit == false && a != -1){
            System.out.println("Depunere nereusita. Contul nu exista in lista.");
        }else{
            System.out.println("Depunere reusita in contul cu numarul " + accountNumber);
        }
    }
    public void withdraw(String accountNumber, int amount){
        boolean contGasit = false;
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].getAccountNumber().equals(accountNumber)){
                accountList[i].withdraw(amount);
                contGasit = true;
            }
        }
        if (contGasit == false){
            System.out.println("Retragere nereusita. Contul nu exista in lista.");
        }
    }

    public void checkAccountDetails( String accountNumber) {
        boolean contGasit = false;
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Numar de cont: " + accountList[i].getAccountNumber() + " sold disponibil: "+ accountList[i].getBalance());
                contGasit = true;
            }
        }
        if (contGasit == false){
            System.out.println("Contul nu a fost gasit in lista.");
        }
    }
}
