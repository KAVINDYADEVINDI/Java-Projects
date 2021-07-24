
package subclasses;

public class Subclasses {

    public static void main(String[] args) {
        students s=new students();
        s.name="nimal";
        s.marks=78;
        s.age=18;
        mathsStudents ms=new mathsStudents ();
        ms.name="bimal";
        ms.age=20;
        ms.marks=55;
        ms.attendence=90;
        artStudents as=new artStudents ();
        as.name="kamal";
        as.age=23;
        as.marks=53;
        as.projectmarks=56;
        s.checkPass();
        ms.checkPass();
        as.checkPass();
        
    }
    
}
