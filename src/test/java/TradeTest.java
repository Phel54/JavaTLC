import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void getPrice() {
    }


    @Test
    void setPrice() {

        Trade t1 = new Trade("T1","QP",4,-23.00);
        t1.setPrice(-60.00);
        assertEquals(t1.price,60.00 );
        System.out.println(t1);
    }
}