package month2.Lesson19.caller;

import month2.library.Book;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book("Lev Tolstoi", "War and Peace", 400, "Frends" , "65.291.2 Б81", true);

        System.out.println(book);
        System.out.println();

        book.setAuthor("Aibek");
        book.setPageCount(878);
        book.setNeedsRepair(false);
        System.out.println(book);

    }
}
