class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class overloading {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();

        genericAnimal.eat(); 
        dog.eat(); 
        ((Dog) dog).bark(); 
        genericAnimal.sleep(); 
        dog.sleep(); 
    }
}
