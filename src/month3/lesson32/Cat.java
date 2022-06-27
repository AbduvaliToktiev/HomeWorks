package month3.lesson32;

public class Cat {
    private String name;
    private Integer age;

    public Cat() {

    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кот: " +
                "{имя = " + name +
                ", возраст = " + age + " лет/годов}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Cat) {
            return ((Cat) obj).name.equals(this.name) &&
                    ((Cat) obj).age == age;
        }
        return false;
    }

}
