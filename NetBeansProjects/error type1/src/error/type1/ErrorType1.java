
package error.type1;

import java.util.Scanner;

public class ErrorType1 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        System.out.println("enter another number");
        int y=sc.nextInt();
        try{
             System.out.println(x/y);
        }
        catch(ArithmeticException err){
            System.out.println("cannot devide by zero");
            
            System.out.println(err.getMessage());
             System.out.println(err.hashCode());
              System.out.println(err.toString());
        }
       
        
         
    }
    
}
