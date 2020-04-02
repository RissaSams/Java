public class BankAccount {

    private String clientName;
    private String accountNumber;
    private float amount;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }

    public BankAccount(String clientName, String accountNumber, float amount) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public float Deposit(float amt) {
        if (amt > 0) {
            this.amount += amt;
        }
        return this.amount;
    }

    public boolean Transfer(float amt, BankAccount toTransTo) {
        if (amt > 0) {
            this.amount -= amt;
            toTransTo.Deposit(amt);
            return true;
        }
        return false;
    }
}
