
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd number ");
        int n2=sc.nextInt();
    int max=Math.max(n1, n2);
        int min=Math.min(n1, n2);
        int x;
        for(x=min;x<=max;x++)
        {
            if(x%5==0)
            {
               System.out.print(x+" "); 
            }
            
        }
        

        
    }
    
}
