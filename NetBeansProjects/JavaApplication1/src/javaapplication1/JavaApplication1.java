
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student count: ");
        int st=sc.nextInt();
        System.out.println("Enter subject count: ");
        int sub=sc.nextInt();
        int x=1;
        float avg=0;
        while(x<=st)
        {
            int y=1,total=0;
            while(y<=sub)
            {
                System.out.println("student "+x+" subject "+y+" marks ");
                int marks=sc.nextInt();
                total=+marks;
                y++;
            }
            avg=(float)total/sub;
            System.out.println("student "+x+" total is "+total);
            System.out.println("student "+x+" Average is "+avg);
            x++;
        }
        
        
    }
    
}
