
package my1;

import java.util.Scanner;

public class My1 {

    
    public static void main(String[] args) {
         int x,y,z;
          String input;
          
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter the number ");
        int no=sc.nextInt();
        for(x=1;x<=no;x++)
        {
            for(z=1;z<=no-x;z++)
            {
                System.out.print("  ");
            }   
            for(y=1;y<=x;y++)
            {
                System.out.print(" *  ");
            }
                System.out.print("\n");
            
        }
        System.out.println("would you like run again this program?(y/n) ");
        input=sc.next();
        }while(!"n".equals(input));
        System.out.println("Thank you");
    }
    
                
    }
    

