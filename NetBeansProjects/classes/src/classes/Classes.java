
package classes;

public class Classes {

    public static void main(String[] args) {
       circle c=new circle();
       rectangle r=new rectangle();
       c.radius=10;
       r.height=12;
       r.width=10;
       c.findArea();
       c.findPerimeter();
       r.findArea();
       r.findPerimeter();
       
    }
    
}
