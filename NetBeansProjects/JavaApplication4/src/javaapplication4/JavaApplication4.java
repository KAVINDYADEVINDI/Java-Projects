
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no=sc.nextInt();
        String answer=" ";
        do
        {
            int rem=no%2;
            answer=Integer.toString(rem)+answer;
            no=no/2;
           
        }while(no!=0);
        System.out.println(answer);
        
    }
    
}
