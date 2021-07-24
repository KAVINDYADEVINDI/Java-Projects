
package error.type.pkg3;

import java.util.Scanner;

public class ErrorType3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values[]={78,90,56,34};
        System.out.println("Enter the position");
        int x=sc.nextInt();
        try{
             System.out.println("value is "+values[x]);
        }
        catch(ArrayIndexOutOfBoundsException er){
             System.out.println(" ");
              System.out.println(er.getMessage());
               System.out.println(er.hashCode());
                System.out.println(er.toString());
        }
       
        
        
        
    }
    
}
