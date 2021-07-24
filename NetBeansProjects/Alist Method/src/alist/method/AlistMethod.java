
package alist.method;
import java.util.ArrayList;
import java.util.Scanner;

public class AlistMethod {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer>itemprice=new ArrayList();
       System.out.println("Enter the number of item: ");
       int no=sc.nextInt();
       int x,total=0;
       for(x=0;x<no;x++)
       {
            System.out.print((x+1)+".Enter item price: ");
            int price=sc.nextInt();
            itemprice.add(price);
            total=total+price;
       }
       System.out.println("Total price is "+total);
       
    }
    
}
