abstract class Vehicle{
    abstract void start();

    void fuel(){
        System.out.println("------Fuel Usage------");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("20% of Fuel is used in car !");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("45% of Fuel is used in Bike !");
    }
}
public class VehicleAbstract {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.fuel();
        v.start();

        v = new Bike();
        v.start();
    }
    
}
