package Objects_Classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.testng.annotations.Test
    void setPrice() {
        Trade t2 = new Trade("T2","IBM",50);
        t2.setPrice(-8.00);
        t2.getPrice();


    }

    @org.testng.annotations.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}