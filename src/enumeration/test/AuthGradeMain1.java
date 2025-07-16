package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        for (AuthGrade grade : AuthGrade.values()) {
            printAuth(grade);
        }

    }

    private static void printAuth(AuthGrade grade) {
        System.out.println("grade = " + grade.name()
            + ", level= " + grade.getLevel() + ", 설명= " + grade.getDescription());

    }

}
