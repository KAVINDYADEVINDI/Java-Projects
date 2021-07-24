
package javaapplication12;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication12 {

    
    public static void main(String[] args) {
         ArrayList<String>names=new ArrayList();
         ArrayList<Integer>marks=new ArrayList();
         Scanner sc=new Scanner(System.in);
         int x;
         for(x=0;x<=2;x++)
         {
         System.out.println("Enter student name ");
         String name=sc.next();
         names.add(name);
         System.out.println("Enter student marks ");
         int mark=sc.nextInt();
         marks.add(mark);
         }
         int y,max;
         max=marks.get(0);
         for(y=0;y<=2;y++)
         {
             if(max<marks.get(y))
              max=marks.get(x);
         }
         int position=marks.indexOf(max);
         System.out.println(names.get(position));
         
         
         
    }
    
}
