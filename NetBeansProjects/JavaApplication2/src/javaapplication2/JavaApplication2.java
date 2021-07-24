
package javaapplication2;

public class JavaApplication2 {

  
    public static void main(String[] args) {
        int x=0;
        while(x<5)
        {
            x++;
            System.out.println(x);
            if(x==3)
                continue;
         System.out.println(x);
        }
        System.out.println("End");
    }
    
}
