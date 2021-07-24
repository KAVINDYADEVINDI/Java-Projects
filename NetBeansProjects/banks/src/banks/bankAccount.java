
package banks;

public class bankAccount {
    double balance =0;
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited");
    }
    void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("No sufficient your amount");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Withdrawal sucessfull");
        }
    }
    void checkbalance()
    {
        System.out.println("your balance is "+balance);
    }
}
