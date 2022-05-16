package month2.HomeWork2_5_6;

public class Brand {
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    private String name;
    private int age;
    private String creator;
    private String firstCar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFirstCar() {
        return firstCar;
    }

    public void setFirstCar(String firstCar) {
        this.firstCar = firstCar;
    }

    @Override
    public String toString() {
        return "Название компании: " + name +
                " \nГод образования: " + age +
                " \nСоздатель компании: " + creator +
                " \nПервый автомобиль компании: " + firstCar;
    }
}
