
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int no=sc.nextInt();
       int x=2;
       while(x<no)
       {
           if(no%x==0)
           {
               System.out.println("this is composite number");
               break;
           }
           x++;
           
       }
       if(x==no)
       {
            System.out.println("this is prime number");
       }
        if(no<=1)
       {
            System.out.println("neither prime nor composite number");
       }
    }
    
}
