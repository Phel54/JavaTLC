package inheritance;

import java.awt.*;

public class Animal {
    private Color colour;
    private int size;

    public Animal(Color colour, int size) {
        this.colour = colour;
        this.size = size;
    }
    public void move(int distance, int direction){
        System.out.println("Generic move method");
    }

    public void eat(){
        System.out.println("Generic eating");
        size++;
    }

}
