package month2.library;

public class ApiUser {
    public static void main(String[] args) {
        Book2 book2 = new Book2("Lev Tolstoi", "War and Peace", 400, 1999, "65.291.2 Б81", true);

        System.out.println(book2);
        System.out.println();

        book2.setAuthor("Dad");
        book2.setPageCount(878);
        book2.setNeedsRepair(false);
        System.out.println(book2);
    }
}

