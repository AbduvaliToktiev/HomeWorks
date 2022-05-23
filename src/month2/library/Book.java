package month2.library;

public class Book {
   private String author;
   private String title;
   private int pageCount;
   private String giftedBy;
   private String pressmark;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        this.pressmark = "67654fghj567";
        this.giftedBy = "Dad";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.pressmark = "987890oksj";
        this.giftedBy = "Dad";
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        this.pressmark = "3456ygfd56";
        this.giftedBy = "Dad";
    }

    public String getGiftedBy() {
        return giftedBy;
    }

    public void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public String getPressmark() {
        return pressmark;
    }

    public void setPressmark(String pressmark) {
        this.pressmark = pressmark;
    }

    public boolean isNeedsRepair() {
        return needsRepair;
    }

    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    private boolean needsRepair;

     public Book() {

     }

    public Book(String author, String title, int pageCount, String giftedBy, String pressmark, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;

    }

    @Override
    public String toString() {
        return "author: " + author + "\ntitle: " + title + "\npageCount: " + pageCount + "\npressMark: " + pressmark + "\ngiftedBy: " + giftedBy;
    }
}
