
package classes;

public class circle extends shape {
    double radius;
    void findArea()
    {
        area=Math.PI*radius*radius;
        System.out.println("Circle area is "+area);
    }
    void findPerimeter()
    {
        perimeter=2*Math.PI*radius;
        System.out.println("Circle perimeter is "+perimeter);
    }
    
    
}
