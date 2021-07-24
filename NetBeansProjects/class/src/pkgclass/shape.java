
package pkgclass;

public class shape {
    double length,width,area,perimeter;
    String name="Basic shape";
    void findArea()
    {
        area=length*width;
        System.out.println("area is "+area);
    }
    void findPerimeter()
    {
        perimeter=(length*2)+(width*2);
        System.out.println("perimeter is "+perimeter);
    }
}
