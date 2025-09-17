class Device {
    String name;
    public Device(String name) { this.name = name; }
}

class Thermostat extends Device {
    int temperature;
    public Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }
    public void show() {
        System.out.println(name + " set to " + temperature + "°C");
    }
}

public class Q5_DeviceThermostat {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("Smart Thermostat", 24);
        t.show();
    }
}
