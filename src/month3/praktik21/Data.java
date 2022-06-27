package month3.praktik21;

public class Data {
    private String nameOfChild;
    private String nameOfParent;

    public Data(String data) {
        String[] split = data.split("/");
        this.nameOfChild = split[0];
        this.nameOfParent = split[1];
    }

    public String getNameOfChild() {
        return nameOfChild;
    }

    public void setNameOfChild(String nameOfChild) {
        this.nameOfChild = nameOfChild;
    }

    public String getNameOfParent() {
        return nameOfParent;
    }

    public void setNameOfParent(String nameOfParent) {
        this.nameOfParent = nameOfParent;
    }

    @Override
    public String toString() {
        return "Data{" +
                "nameOfChild='" + nameOfChild + '\'' +
                ", nameOfParent='" + nameOfParent + '\'' +
                '}';
    }
}
