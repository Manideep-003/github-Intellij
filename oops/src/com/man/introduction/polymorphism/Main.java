package com.man.introduction.polymorphism;

// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass overriding the parent class method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Subclass overriding the parent class method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Animal cat = new Cat();

        genericAnimal.makeSound();  // Output: Generic animal sound
        dog.makeSound();            // Output: Woof Woof
        cat.makeSound();            // Output: Meow Meow
    }
}