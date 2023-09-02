package Company.BankingAppEx5;

public class BankAccount {
    double currentAmount;
    String coinType;
    final int maxWithdrawalAmount;

    public BankAccount(double currentAmount, String coinType) {
        this.currentAmount = currentAmount;
        this.coinType = coinType;
        this.maxWithdrawalAmount = 1000;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void withdrawAmount(int amount){
        if(amount <= maxWithdrawalAmount && amount <= currentAmount){
            currentAmount -= amount;
            System.out.println("Tranzactie reusita. Sold ramas: "+ currentAmount);
        } else if (amount > maxWithdrawalAmount) {
            System.out.println("Tranzactie nereusita. Suma prea mare pentru o singura tranzactie");
        } else if (amount > currentAmount) {
            System.out.println("Tranzactie nereusita. Fonduri insuficiente.");
        }
    }

    public void depositAmount(int amount){
        currentAmount += amount;
        System.out.println("Tranzactie reusita. Soldul contului: "+ currentAmount);
    }

    public void printAccountDetails(){
        System.out.println("Soldul curent al contului este: " + currentAmount);
        System.out.println("Moneda contului este: "+ coinType);
    }

    public void printMaxWithdrawalAmount(){
        System.out.println("Suma maxima care poate fi retrasa intr-o tranzactie este: "+ maxWithdrawalAmount);
    }
}
