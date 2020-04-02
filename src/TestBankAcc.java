public class TestBankAcc {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Marissa Sams", "00000001", 0.00f);
        BankAccount ecAccount = new BankAccount("Eric Couch", "00000002", 0.00f);
        BankAccount jjAccount = new BankAccount("Jarvis Jackson", "00000003", 0.00f);
        System.out.println(myAccount.toString());
        myAccount.Deposit(1000.00f);
        System.out.printf("Bank Account: " + myAccount.getAccountNumber() +
                " has a balance of $%,.2f. \n", myAccount.getAmount());

        myAccount.Transfer(100.00f, ecAccount);
        System.out.println(myAccount.toString());
        System.out.println(ecAccount.toString());
        ecAccount.Deposit(5000.00f);
        if (myAccount.getAmount() > ecAccount.getAmount()) {
            System.out.println("My acount has more $$");
        } else {
            System.out.println("Eric's account has more $$");
        }
        System.out.println(ecAccount.toString());
    }
}
