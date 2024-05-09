package construct.ex;

public class BookMain_p1 {
    public static void main(String[] args) {
        Book_p1 book1 = new Book_p1();
        book1.displayInfo();

        Book_p1 book2 = new Book_p1("Hello JAVA", "Seo");
        book2.displayInfo();

        Book_p1 book3 = new Book_p1("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
