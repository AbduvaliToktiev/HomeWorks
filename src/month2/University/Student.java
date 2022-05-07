package month2.University;

public class Student extends Well {
    private String dateBirth;
    private String surname;
    private String name;
    private String pol;
    private int age;

    public Student(String dateBirth, String surname, String name, String pol, int age) {
        this.dateBirth = dateBirth;
        this.surname = surname;
        this.name = name;
        this.pol = pol;
        this.age = age;
    }

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
