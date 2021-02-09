package inheritance;

import java.awt.*;

public class Lion extends Animal{
    private Color maneColour;

    public Lion(Color colour, int size) {
        super(colour, size);
      //  this.maneColour = maneColour;
    }
    @Override
    public void eat(){
        System.out.println("Lion eat method");
        super.eat();
    }
    public void roar(){
        System.out.println("Lion can ROOAAARRRR");

    }
    public void hunt(){
        System.out.println("Lion can HUNT method");

    }

    public Lion(Color colour, int size, Color maneColour) {
        super(colour, size);
        this.maneColour = maneColour;
    }

    public static void main(String[] args) {
        Lion lion = new Lion(Color.BLACK,45);
        lion.move(5,4);
        Animal animal = new Lion(Color.BLACK,34);

    if (lion instanceof Animal){
        Animal theAnimal = (Animal) lion;
        theAnimal.eat();
        System.out.println(theAnimal+"  enjoyed its dinner");
    }else {
        System.out.println("unable to feed" + lion);
        System.out.println(lion.getClass().getName() + "IS NOT AN ANIMAL");
    }
    }
    }

