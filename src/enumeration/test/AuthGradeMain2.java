package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        try {
            AuthGrade grade = AuthGrade.valueOf(str);
            System.out.println(grade);
            if (grade == AuthGrade.GUEST) {
                System.out.println("당신의 등급은 손님입니다.");
                System.out.println("==메뉴 목록==");
                System.out.println("- 메인 화면");
            } else if (grade == AuthGrade.LOGIN) {
                System.out.println("당신의 등급은 손님입니다.");
                System.out.println("==메뉴 목록==");
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");

            } else if (grade == AuthGrade.ADMIN) {
                System.out.println("당신의 등급은 손님입니다.");
                System.out.println("==메뉴 목록==");
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 등급 입력: " + str);
        }
    }

}
