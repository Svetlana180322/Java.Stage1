/**
  * Fruit Homework - 3
  *
  *@author Svetlana Budzinskaia
  *@version 22.05.2022
  */

public class LessonJavaFruitHomework {
    public static void main(String[] args) {
        Box Box1 = new Box(new Apple(), 10);
        Box Box2 = new Box(new Orange(), 10);
        Box Box3 = new Box(new Orange(), 0);
        Box1.Compare(Box1);
        Box1.Compare(Box2);
        Box1.Compare(Box3);
        Box1.AddBoxToBox(Box3);
        Box3.AddBoxToBox(Box2);
        Box1.AddFruitToBox(new Orange());
        Box1.AddFruitToBox(new Apple());
    }
}
class Box {
    public Object Type;
    public Integer Quantity;
    
    public Box(Object Fruit, Integer Quantity) {
        this.Type = Fruit;
        this.Quantity = Quantity;
    }
    public void Compare(Box Box) {
        Double Weight1 = getWeight(this);
        Double Weight2 = getWeight(Box);
        if (Weight1 > Weight2) {
            System.out.println("Box 1 (" + Weight1+") is heavier than Box 2 (" + Weight2+")");
            }
        else if (Weight2 > Weight1) {
            System.out.println("Box 2 (" + Weight2+") is heavier than Box 1 (" + Weight1+")");
            }
        else {
            System.out.println("The boxes have the same weight (" + Weight1+")");
            }
    }
    public Double getWeight(Box Box) {
        Double OneWeight = 0.0;
        if (Box.Type.getClass() == Apple.class) {
            OneWeight = 1.0;
            }
        if (Box.Type.getClass() == Orange.class) {
            OneWeight = 1.5;
            }
        return Box.Quantity * OneWeight;
    }
    public void AddBoxToBox(Box Box) {
        if (Box.Type.getClass() == this.Type.getClass()) {
            this.Quantity = this.Quantity + Box.Quantity;
            Box.Quantity = 0;
            System.out.println("Box has "+this.Quantity+" pcs of "+this.Type.getClass()+" now!");
        }
        else {
            System.out.println("You cannot mix different fruit in one box!");
            }
    }
    public void AddFruitToBox(Fruit Fruit) {
        if (Fruit.getClass() == this.Type.getClass()) {
            this.Quantity = this.Quantity + 1;
            System.out.println("Box has "+this.Quantity+" pcs of "+this.Type.getClass()+" now!");
        }
        else {
            System.out.println("You cannot mix different fruit in one box!");
            }
    }
}

class Fruit {
    
}

class Apple extends Fruit {
    
}

class Orange extends Fruit {
    
}


