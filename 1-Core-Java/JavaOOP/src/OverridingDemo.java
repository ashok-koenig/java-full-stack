class Animal{
    //Parent class method
    void sound(){
        System.out.println("Default sound");
    }
}

class Cat extends Animal{
    // Parent class method sound() is overriding in the cat class.
    void sound(){
        System.out.println("Cat meows");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal animalObject = new Animal();
        animalObject.sound();
        Cat catObject = new Cat();
        catObject.sound();
    }
}
