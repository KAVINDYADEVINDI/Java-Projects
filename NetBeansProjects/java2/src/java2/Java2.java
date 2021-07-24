
package java2;

import java.util.Scanner;

public class Java2 {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number1");
        int num1=sc.nextInt();
        
        System.out.println("Enter a number2");
        int num2=sc.nextInt();
        
        System.out.println("Enter an operator");
        char ope=sc.next().charAt(0);
        
        switch (ope) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                if(num2!=0)
                    System.out.println(num1/num2);
                else
                    System.out.println("div by zero error");
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("wrong ope");
                break;
        }
    }
    
}
