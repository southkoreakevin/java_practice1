package class1;

public class Classstart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

// 형식에 맞춰 출력하는 더 좋은 방법
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", student1.name, student1.age, student1.grade);
    }

}
