
package arrays2;

public class Arrays2 {

    
    public static void main(String[] args) {
        int value[]={12,78,90,24,56,68};
        int x,total=0;
        for(x=0;x<=5;x++)
        {
           System.out.println( value[x]);
           total=total+value[x];
        }
        double avg=(double)total/value.length;
        System.out.println("the total is "+total);
        System.out.println("the average is "+avg);
    }
    
}
