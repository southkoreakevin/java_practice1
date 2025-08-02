package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            List.add(input);
        }
        int result = 0;
        for (int i = 0; i < List.size(); i++) {
            result += List.get(i);
        }
        System.out.println("입력한 정수의 합계 : " + result);

        double avg = (double) result / List.size();
        System.out.println("입력한 정수의 평균: " + avg);

    }

}
