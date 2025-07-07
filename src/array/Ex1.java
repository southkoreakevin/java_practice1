package array;

public class Ex1 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += students[i];
        }
        double average = (double) total / 5;

        System.out.println("score total " + total);
        System.out.println("score average " + total / 5);
    }

}
