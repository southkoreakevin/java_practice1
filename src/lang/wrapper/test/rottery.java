package lang.wrapper.test;

import java.util.Random;

public class rottery {

    public static void main(String[] args) {
        Random random = new Random();

        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            int random1 = random.nextInt(45) + 1;

            result[i] = random1;
        }
        for (int a : result) {
            System.out.println(a);
        }

    }
}
