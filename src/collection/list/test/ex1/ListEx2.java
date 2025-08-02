package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        ArrayList<Integer> integerArray = new ArrayList<>();
        int count = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integerArray.add(input);
        }
        System.out.println(integerArray);
    }
}
