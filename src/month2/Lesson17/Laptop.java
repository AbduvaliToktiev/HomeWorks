package month2.Lesson17;
import java.util.Arrays;

public class Laptop {
    private Hdd[] hdd;
    private SSD ssd;
    private Os os;
    private Proc proc;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Hdd[] getHdd() {
        return hdd;
    }
    public void setHdd(Hdd[] hdd) {
        this.hdd = hdd;
    }
    public SSD getSsd() {
        return ssd;
    }
    public void setSSD(SSD ssd) {
        this.ssd = ssd;
    }
    public Os getOs() {
        return os;
    }
    public void setOs(Os os) {
        this.os = os;
    }
    public Proc getProc() {
        return proc;
    }
    public void setProc(Proc proc) {
        this.proc = proc;
    }

    @Override
    public String toString() {
        return "Ram: " + ssd + "\n" +
                "Hdd: " + Arrays.toString(hdd) + "\n" +
                "Os: " + os + "\n" +
                "Proc: " + proc + "\n" +
                "Person: " + person;
    }
}
class Hdd {
    private int size;
    private int speed;
    public int getSize(int i) {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Size = " + size + " Speed = " + speed;
    }
}
class SSD {
    private int size;
    private String model;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Size = " + size + " \n Model = " + model;
    }
}
class Os {
    private String name;
    private int version;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Name = " + name + " \n Version = " + version;
    }
}
class Proc {
    private String model;
    private int core;
    private int frequency;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCore() {
        return core;
    }
    public void setCore(int core) {
        this.core = core;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Model = " + model + " \n Core = " + core + " \n Frequency = " + frequency;
    }
}

class Person {
    private String FIO;
    private String login;
    private int age;
    private String password;
    private boolean account;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 1) {
        this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным или равным нулю");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccount() {
        return account;
    }

    public void setAccount(boolean account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "FIO = " + FIO + " \n Login = " + login + " \n Age = " + age + " \n Password = " + password + " \n Account = " + account;
    }
}

