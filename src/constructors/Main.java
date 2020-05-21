package constructors;

public class Main {

    public static void main(String[] args) {
        Account momuAccount = new Account();
        momuAccount.withdrawal(100.0);

        momuAccount.deposit(50.0);
        momuAccount.withdrawal(100.0);

        momuAccount.deposit(50.0);
        momuAccount.withdrawal(100.0);
    }
}
