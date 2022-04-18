/**
  * Java level 1. Homework - 7 (2)
  *
  *@author Svetlana Budzinskaia
  *@version 18.04.2022
  */
  
public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = false;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
        this.satiety = true;}
        System.out.println("cat name: " + this.name + "; cats satiety: " + this.satiety);
    }
}


