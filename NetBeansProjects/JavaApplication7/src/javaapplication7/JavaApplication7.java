
package javaapplication7;

import java.util.Scanner;


public class JavaApplication7 {

   
    public static void main(String[] args) {
         int x,y,z,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no=sc.nextInt();
        for(x=0;x<=no;x++)
        {
            for(z=0;z<=no-x;z++)
            {
                System.out.print(" ");
            } 
            n=1;
            for(y=0;y<=x;y++)
            {
                System.out.print(" "+n);
                n=n*(x-y)/(y+1);
            }
                System.out.print("\n");
            
        }
    }
    
}
