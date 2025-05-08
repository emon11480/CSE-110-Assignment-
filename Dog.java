/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ASUS
 */
public class Dog extends Animal implements Pet{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    @Override
    public void play() {
        System.out.println(name + " the dog is playing fetch!");
    }
}
    

