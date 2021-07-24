
package pkgclass;

public class rombus extends shape {
    double height;
    @Override
    void findArea()
    {
        area=length*height;
        System.out.println("area is "+area);
    }
    String name1="Rombus";
    void getName()
    {
        System.out.println("This shape is "+name1);
        System.out.println("This is "+super.name);
    }
}
