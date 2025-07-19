package nested.test.ex1;

import extends1.ex1.Book;

public class Library {

    int number;
    Book[] books;
    int count = 0;

    Library(int number) {
        this.number = number;
        books = new Book[number];
    }

    public void addBook(String bookname, String author) {
        if (number <= count) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[count] = new Book(bookname, author);
        count++;
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println("도서 제목: " + b.author + ", 저자: " + b.bookname);
        }
    }

    private class Book {

        String bookname;
        String author;

        private Book(String bookname, String author) {
            this.bookname = bookname;
            this.author = author;
        }
    }

}
