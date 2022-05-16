package month2.University;

public class Group extends Student {
    String startDate;
    String duration;

    public Group(String startDate, String duration){
        this.startDate = startDate;
        this.duration = duration;
    }

    public Group() {

    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
