interface Refuelable {
    void refuel();
}

class VehicleBase {
    String model;
    public VehicleBase(String model) { this.model = model; }
}

class ElectricVehicle extends VehicleBase {
    public ElectricVehicle(String model) { super(model); }
    public void charge() { System.out.println(model + " charging"); }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    public PetrolVehicle(String model) { super(model); }

    @Override
    public void refuel() { System.out.println(model + " refueled"); }
}

public class Q11_VehicleHybrid {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle("Tesla");
        PetrolVehicle p = new PetrolVehicle("Honda");
        e.charge();
        p.refuel();
    }
}
