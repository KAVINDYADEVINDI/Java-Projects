
package classes;

public class rectangle extends shape{
    double height,width;
    void findArea()
    {
        area=height*width;
        System.out.println("Rectangle area is "+area);
    }
    void findPerimeter()
    {
        perimeter=(height+width)*2;
        System.out.println("Rectangle perimeter is "+perimeter);
    }
    
}
