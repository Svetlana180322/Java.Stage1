/**
  * Java level 1. Homework - 7(1)
  *
  *@author Svetlana Budzinskaia
  *@version 18.04.2022
  */
  
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n>food) {System.out.println("negative value"); return false;}
        else {
        food -= n; return true;}
    }
    public void increaseFood(int n) {
        food += n; 
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
