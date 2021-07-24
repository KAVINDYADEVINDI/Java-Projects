
package error.type.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorType4 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double ans;
       System.out.println("Enter a number");
       try{
       int n1=sc.nextInt();
       System.out.println("Enter another number");
       try{
       int n2=sc.nextInt();
       try{
       ans=(double)n1/n2;
       System.out.println("Answer is "+ans);
       }
       catch(ArithmeticException er)
       {
           System.out.println("cannot devide by zero");
           System.out.println(er);
       }
       }
       catch(InputMismatchException e)
       {
           System.out.println("you have entered a letter");
           System.out.println(e);
       }
       }
       finally{
           System.out.println("no errors");
    }
}
  
}
