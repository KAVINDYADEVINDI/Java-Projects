
package pkgclass;

public class Class {
    
    public static void main(String[] args) {
       rectangle re= new rectangle();
       rombus ro=new rombus();
       parallelogram p=new parallelogram();
       re.length=15;
       re.width=12;
       ro.length=13;
       ro.width=20;
       ro.height=6;
       p.length=23;
       p.width=20;
       p.height=5;
       re.findArea();
       re.findPerimeter();
       re.getName();
       ro.findArea();
       ro.findPerimeter();
       ro.getName();
       p.findArea();
       p.findPerimeter();
       p.getName();
    }
    
}
