   //  Question 10  //

class Vehicle {

    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    protected void showData() {
    System.out.println("This is a vehicle class");  
    }
  }
    
    class Bus extends Vehicle {
    
    private String routeNumber;
    
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {

    this.regnNumber = regnNumber;
    this.speed = speed;
    this.color = color;
    this.ownerName = ownerName;
    this.routeNumber = routeNumber;
   }
    
    @Override
    
    protected void showData() {
    
    super.showData();
    
    System.out.println("Bus Details:");
    System.out.println("Registration Number: " + regnNumber);
    System.out.println("Speed: " + speed);
    System.out.println("Color: " + color);
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Route Number: " + routeNumber); 
    }
  }
    
    class Car extends Vehicle {
    
    private String manufacturerName;
    
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
    
    this.regnNumber = regnNumber;
    this.speed = speed;
    this.color = color;
    this.ownerName = ownerName;
    this.manufacturerName = manufacturerName;
    
    }
    
    @Override
    
    protected void showData() {
    
    super.showData();
    
    System.out.println("Car Details:");
    System.out.println("Registration Number: " + regnNumber);
    System.out.println("Speed: " + speed);
    System.out.println("Color: " + color);
    System.out.println("Owner Name: " + ownerName); 
    System.out.println("Manufacturer Name: " + manufacturerName);
    
    }
    
    }
    
    public class MainVehicle {
    
    public static void main(String[] args) {
    
    Bus bus = new Bus("BUS18", 60, "Red", "Virat", "Route 1");
    bus.showData();
    
    System.out.println();
    
    Car car = new Car("CAR07", 120, "Blue", "Dhoni", "Toyota");
    car.showData();  
    }
 }