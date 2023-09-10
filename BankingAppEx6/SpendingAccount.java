package Company.BankingAppEx6;

public class SpendingAccount extends BankAccount{

    int maxWithdrawalAmount;

    public SpendingAccount(int balance, String accountNumber, int maxWithdrawalAmount) {
        super(balance, accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(int maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > this.getBalance()+maxWithdrawalAmount)
            return -1;
        else{
            return this.getBalance()-amount;
        }
    }

    @Override
    public int deposit(int amount) {
        return this.getBalance()+amount;
    }
}
