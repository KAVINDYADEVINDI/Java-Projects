
package subclasses;

public class students {
    String name;
    int age;
    int marks;
    void checkPass()
    {
        if(marks>50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
