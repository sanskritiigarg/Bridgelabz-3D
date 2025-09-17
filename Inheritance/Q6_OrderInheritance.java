class Order {
    String id;
    public Order(String id) { this.id = id; }
}

class ShippedOrder extends Order {
    public ShippedOrder(String id) { super(id); }
    public void status() { System.out.println("Order " + id + " shipped"); }
}

class DeliveredOrder extends ShippedOrder {
    public DeliveredOrder(String id) { super(id); }

    @Override
    public void status() { System.out.println("Order " + id + " delivered"); }
}

public class Q6_OrderInheritance {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("101");
        d.status();
    }
}
