package constructors;

public class Account {

    private double balance;


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(withdrawalAmount > this.balance) {
            System.out.println("not enough missing " + (withdrawalAmount - this.balance));
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawl of " + withdrawalAmount + " processed. Remaining = " + this.balance);
        }
    }
}



