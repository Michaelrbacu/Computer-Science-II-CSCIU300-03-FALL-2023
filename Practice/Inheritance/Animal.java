package Practice.Inheritance;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    @Override
    public void speak() {
        super.speak(); // Call the speak method of the superclass
        System.out.println(name + " barks!");
    }


    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        Animal myDog = new Dog("Buddy");

        myAnimal.speak(); // Output: Generic Animal makes a sound.
        myDog.speak();    // Output: Buddy makes a sound. Buddy barks!
    }
}
