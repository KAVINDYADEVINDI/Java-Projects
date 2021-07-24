
package hospital;

import transport.ambulance;

public class Hospital {

    public static void main(String[] args) {
        doctor d=new doctor();
        d.name="mohotti";
        d.salary=45000;
        ambulance am=new ambulance();
        am.brand="nissan";
        am.vehicleId=12345;
        System.out.println(d.name+" doctor has "+d.salary+" salary per month");
        System.out.println("ambulace brand is "+am.brand+" and vehicle id no is "+am.vehicleId);
    }
    
}
