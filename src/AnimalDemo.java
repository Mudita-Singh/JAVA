abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow ");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();

        Animal c = new Cat();
        c.makeSound();
    }
}
