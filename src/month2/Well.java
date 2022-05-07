package month2;

public class Well {
    private String nameWell;
    private String date;
    private int id;
    private String fullName;

    public Well(String nameWell, String date, int id, String fullName){
        this.nameWell = nameWell;
        this.date = date;
        this.id = id;
        this.fullName = fullName;
    }

    public Well() {

    }

    public String getNameWell() {
        return nameWell;
    }

    public void setNameWell(String nameWell) {
        this.nameWell = nameWell;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
