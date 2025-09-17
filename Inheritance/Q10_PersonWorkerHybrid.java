interface Worker {
    void work();
}

class PersonBase {
    String name;
    public PersonBase(String name) { this.name = name; }
}

class Chef extends PersonBase implements Worker {
    public Chef(String name) { super(name); }

    @Override
    public void work() { System.out.println(name + " cooks"); }
}

class Waiter extends PersonBase implements Worker {
    public Waiter(String name) { super(name); }

    @Override
    public void work() { System.out.println(name + " serves"); }
}

public class Q10_PersonWorkerHybrid {
    public static void main(String[] args) {
        Worker c = new Chef("Alice");
        Worker w = new Waiter("Bob");
        c.work();
        w.work();
    }
}
