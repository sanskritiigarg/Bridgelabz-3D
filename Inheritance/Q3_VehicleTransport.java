class Vehicle {
    public void move() { System.out.println("Vehicle moves"); }
}

class Car extends Vehicle {
  @Override
  public void move() { System.out.println("Car drives"); }
}

class Truck extends Vehicle {
  @Override  
  public void move() { System.out.println("Truck hauls cargo"); }
}

class Motorcycle extends Vehicle {
      @Override
      public void move() { System.out.println("Motorcycle zooms"); }
}

public class Q3_VehicleTransport {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();
        Vehicle v3 = new Motorcycle();
        v1.move();
        v2.move();
        v3.move();
    }
}
