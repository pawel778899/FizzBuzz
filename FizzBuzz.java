import java.util.Random;

public class FizzBuzz {

    public static void main(String[] args) {

        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println(rand);

        if (rand % 3 == 0 && rand % 5 == 0) System.out.println("FizzBuzz");
        else if (rand % 3 == 0) System.out.println("Fizz");
        else if (rand % 5 == 0) System.out.println("Buzz");
        else System.out.println(rand);

        System.out.println("*******************************************************************************************");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }
}
