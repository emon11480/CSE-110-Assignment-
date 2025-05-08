/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ASUS
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy", 5, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 3, "White");

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Pet) {
                ((Pet) animal).play();
            }
        }
    }
}
    
    

