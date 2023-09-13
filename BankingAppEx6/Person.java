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
            if (findAccountByAccountNumber(contNou.getAccountNumber()) != null){
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

    public BankAccount findAccountByAccountNumber(String accountNumber){
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountList[i].equals(accountNumber)){
                return accountList[i];
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
        if (findAccountByAccountNumber(accountNumber) == null){
            System.out.println("Depunere nereusita. Contul nu a fost gasit");
        } else  {
            int a = findAccountByAccountNumber(accountNumber).deposit(amount);
            if (a == -1){
                System.out.println("Depunere nereusita. Suma depaseste suma maxima de depunere.");
            }else {
                System.out.println("Depunere reusita. Soldul acum este de " + findAccountByAccountNumber(accountNumber).getBalance());
            }
        }
    }
    public void withdraw(String accountNumber, int amount){
        if (findAccountByAccountNumber(accountNumber) == null){
            System.out.println("Retragere nereusita. Contul nu a fost gasit");
        } else  {
            int a = findAccountByAccountNumber(accountNumber).deposit(amount);
            if (a == -1){
                System.out.println("Retragere nereusita. Fonduri insuficiente.");
            }else {
                System.out.println("Retragere reusita. Soldul ramas este de " + findAccountByAccountNumber(accountNumber).getBalance());
            }
        }
    }

    public void checkAccountDetails( String accountNumber) {
        if (findAccountByAccountNumber(accountNumber) == null){
            System.out.println("Contul nu a fost gasit in lista.");
        }else {
            System.out.println("Soldul contului este: " + findAccountByAccountNumber(accountNumber).getBalance());
        }
    }
}
