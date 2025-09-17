class Animal {
    public void makeSound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
  @Override
  public void makeSound() { System.out.println("Dog barks"); }
}

class Cat extends Animal {
  @Override
  public void makeSound() { System.out.println("Cat meows"); }
}

class Bird extends Animal {
  @Override
  public void makeSound() { System.out.println("Bird chirps"); }
}

public class Q1_AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
