/**
  * Java level 1. Homework - 7 (0)
  *
  *@author Svetlana Budzinskaia
  *@version 18.04.2022
  */
  
public class MainClass {
    public static void main(String[] args) {
        Cat[] catarray = new Cat[3];
        catarray[0] = new Cat("Barsik", 5);
        catarray[1] = new Cat("Vaska", 4);
        catarray[2] = new Cat("Murka", 6);
        Plate plate = new Plate(9);
        plate.info();
        for (int x = 0; x < 3; x++) {
        catarray[x].eat(plate);}
        plate.increaseFood(3);
        plate.info();
    }
}
