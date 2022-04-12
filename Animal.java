/**
  * Java level 1. Homework - 6
  *
  *@author Svetlana Budzinskaia
  *@version 12.04.2022
  */

public class Animal {
    
    public Animal() {
    }
    public void Run(int dist) {
        if (this.getClass() == Cat.class) {
            if (dist <= 200) {
                System.out.println("Cat  run: " + dist + " meters");
                }
                else {System.out.println("Cat  cannot run so much");}
        }
        if (this.getClass() == Dog.class) {
            if (dist <= 500) {
                System.out.println("Dog  run: " + dist + " meters");
                }
                else {System.out.println("Dog  cannot run so much");}
        }
    }
    public void Swim(int dist) {
        if (this.getClass() == Cat.class) {
                System.out.println("Cat  cannot swim");
        }
        if (this.getClass() == Dog.class) {
            if (dist <= 10) {
                System.out.println("Dog  swam: " + dist + " meters");
                }
                else {System.out.println("Dog  cannot swim so much");}
        }
    }
    
    public static void main(String[] args) {
        Dog Dog = new Dog();
        Dog.Run(600);
        Dog.Swim(9);
        Cat Cat = new Cat();
        Cat.Run(199);
        Cat.Swim(333);
    }    
}
class Cat extends Animal {
    
}
class Dog extends Animal {
    
}