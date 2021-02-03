import java.util.Random;

public class Question2 {
    public Question2() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int nextRandom = rand.nextInt(101);
        if (nextRandom == 0) {
            System.out.println("This random number is frozen " + nextRandom);
        } else if (nextRandom <= 14) {
            System.out.println("This random number is cold " + nextRandom);
        } else if (nextRandom <= 24) {
            System.out.println("This random number is cool " + nextRandom);
        } else if (nextRandom <= 40) {
            System.out.println("This random number is warm " + nextRandom);
        } else if (nextRandom <= 60) {
            System.out.println("This random number is hot " + nextRandom);
        } else if (nextRandom <= 80) {
            System.out.println("This random number is very hot " + nextRandom);
        } else if (nextRandom <= 99) {
            System.out.println("This random number is extremely hot " + nextRandom);
        } else {
            System.out.println("This random number is boiling " + nextRandom);
        }

    }
}
