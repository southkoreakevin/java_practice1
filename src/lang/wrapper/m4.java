package lang.wrapper;

import java.util.Random;

public class m4 {

    public static void main(String[] args) {
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        int randomRange1 = random.nextInt(10);
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10" + randomRange2);

    }

}
