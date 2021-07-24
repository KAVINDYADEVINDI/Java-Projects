
package subclasses;

public class mathsStudents extends students {
    int attendence;
    @Override
    void checkPass()
    {
        if(marks>70)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
