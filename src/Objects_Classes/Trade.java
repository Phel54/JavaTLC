package Objects_Classes;

import static java.lang.Math.abs;

public class Trade {
    protected String id;
    protected  String symbol;
    protected int quantity;
    protected double price;


    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price> 0){
            this.price = price;
        }else{
           this.price = abs(price);
        }

    }

    public double getPrice() {
        return price;
    }

    public String toString(){

        return (id +" :" +symbol+" :" +quantity+" :" +price);
    }

    public static void main(String[] args) {

        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        Trade t2 = new Trade("T2","IBM",50);
        t2.setPrice(-56.90);


        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
