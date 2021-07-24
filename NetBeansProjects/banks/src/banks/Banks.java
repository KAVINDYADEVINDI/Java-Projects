
package banks;

import java.util.Scanner;

public class Banks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bankAccount acc=new bankAccount();
        char option;
        double amount;
        do{
            System.out.println("What do you want to do? (deposit='d' withdraw='w' checkbalance='c' end='e')");
            option=sc.next().charAt(0);
            if("d".equals(option))
            {
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                acc.deposit(amount);
            }
            else if("w".equals(option))
            {
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                acc.withdraw(amount);
            }
            else if("c".equals(option))
            {
                acc.checkbalance();
            }
            else if("e".equals(option))
            {
                System.out.println("Thankyou for banking with us");
            }
            else
            {
                System.out.println("Not selection try again");
            }
        }while(!"e".equals(option));
    }
    
}
