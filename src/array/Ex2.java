package array;

public class Ex2 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        System.out.println("score sum " + total);
        System.out.println("score avg " + total / students.length);
    }

}
