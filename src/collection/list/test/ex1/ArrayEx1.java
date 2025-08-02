package collection.list.test.ex1;

public class ArrayEx1 {

    public static void main(String[] args) {
//        int[] students = {90, 80, 70, 60, 50};
//
//        int total = 0;
//        for (int i = 0; i < students.length; i++) {
//            total += students[i];
//        }
//        double average = (double) total / students.length;
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        ListEx1 intList = new ListEx1(5);

        int total = 0;
        intList.add(90);
        intList.add(80);
        intList.add(70);
        intList.add(60);
        intList.add(50);

        for (int i = 0; i < intList.getsize(); i++) {
            total += intList.get(i);
        }
        double average = (double) total / intList.getsize();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }

}
