package construct.ex;

public class Book_p1 {
    String title;
    String author;
    int page;

    Book_p1() {
        this("", "", 0);
    }
    Book_p1(String title, String author) {
        this(title, author, 0);
    }

    Book_p1(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
