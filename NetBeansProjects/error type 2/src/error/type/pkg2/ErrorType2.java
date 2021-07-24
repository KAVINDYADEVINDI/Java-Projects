
package error.type.pkg2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ErrorType2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        try{
        int x=sc.nextInt();
        System.out.println("Squre is "+x*x);
        }
        catch(InputMismatchException e){
            System.out.println("you have entered a letter");
            System.out.println(e.getMessage());
            System.out.println(e.hashCode());
            System.out.println(e.toString());
        }
       
        
        
         
    }
    
}
