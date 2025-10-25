// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding method from parent class
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding method from parent class
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();   // upcasting - Animal reference, Dog object
        Animal a2 = new Cat();   // upcasting - Animal reference, Cat object
        Animal a3 = new Animal();

        a1.makeSound();  // Output: Dog barks
        a2.makeSound();  // Output: Cat meows
        a3.makeSound();  // Output: Some generic animal sound
    }
}

    

