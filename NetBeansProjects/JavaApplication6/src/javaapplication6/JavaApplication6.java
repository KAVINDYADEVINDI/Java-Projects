
package javaapplication6;

import java.util.Scanner;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no=sc.nextInt();
        for(x=1;x<=no;x++)
        {
            for(z=1;z<=no-x;z++)
            {
                System.out.print(" ");
            }   
            for(y=1;y<=x;y++)
            {
                System.out.print(" *");
            }
                System.out.print("\n");
            
        }
        
    }
    
}
