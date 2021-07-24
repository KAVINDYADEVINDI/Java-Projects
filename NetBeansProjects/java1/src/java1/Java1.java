
package java1;
import java.util.Scanner;

public class Java1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%2==1)
        {
            System.out.println(num+" is an odd");
        }
        else
        {
            System.out.println(num+" is an even");
        }
    }
    
}
