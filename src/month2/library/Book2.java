package month2.library;

public class Book2 {
    private String author;
    private String title;
    private int pageCount;
    private int ageData;
    private String pressmark;
    private boolean needsRepair;

    public Book2(String author, String title, int pageCount, int ageData, String pressmark, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.ageData = ageData;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getAgeData() {
        return ageData;
    }

    public void setAgeData(int ageData) {
        this.ageData = ageData;
    }

    public String getPressmark() {
        return pressmark;
    }

    public void setPressmark(String pressmark) {
        this.pressmark = pressmark;
    }

    protected boolean isNeedsRepair() {
        return needsRepair;
    }

    protected void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    @Override
    public String toString() {
        return "Book2 {" +
                "author = '" + author + '\'' +
                ", title = '" + title + '\'' +
                ", pageCount = " + pageCount +
                ", ageData = " + ageData +
                ", pressmark = '" + pressmark + '\'' +
                ", needsRepair = " + needsRepair +
                '}';
    }
}
