package nested.test.ex1;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4); // 최대 4권의 도서를 저장할 수 있는 도서관 생

        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("책4", "저자4");
        library.addBook("책5", "저자5");

        library.showBooks(); // 도서관의 모든 도서 정보 출력
    }
}
