package Company.BankingAppEx6;

public class StudentAccount extends BankAccount{

    final int maxDepositAmount;

    public StudentAccount(int balance, String accountNumber) {
        super(balance, accountNumber);
        this.maxDepositAmount = 25000;
    }

    public int getMaxDepositAmount() {
        return maxDepositAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > this.getBalance())
           return -1;
        else{
            return this.getBalance()-amount;
        }
    }

    @Override
    public int deposit(int amount) {
        if (amount > maxDepositAmount)
            return -1;
        else{
            return this.getBalance()+amount;
        }
    }
}
