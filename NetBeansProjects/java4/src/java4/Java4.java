
package java4;

import java.util.Random;
import java.util.Scanner;

public class Java4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        int number=rnd.nextInt(10)+1;
        System.out.println("guess the number 1-10");
        int guess=sc.nextInt();
        if(guess==number)
        {
            System.out.println("win");
        }
        else
        {
            System.out.println("loss");
        }
        System.out.println("computer number "+number);
    }
    
}
