/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ASUS
 */
public class Cat extends Animal implements Pet{
     private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    @Override
    public void play() {
        System.out.println(name + " the cat is playing with a ball of yarn!");
    }
}

