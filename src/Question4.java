import java.util.concurrent.ThreadLocalRandom;

public class Question4 {
    public static void main(String[] args) {
        int rand = 4;
/**        do {
            rand = ThreadLocalRandom.current().nextInt(-3,3);
            System.out.println(rand);
        }while (rand != 0);
  */

        while (rand !=0){
            rand = ThreadLocalRandom.current().nextInt(-3,3);
            System.out.println(rand);
        }
    }
}
