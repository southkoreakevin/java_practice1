package variable;

public class Var1 {

    public static void main(String[] args) {

        //row = 2
        int rows = 5;
        int i = 0;
        for (; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }


    }
}
