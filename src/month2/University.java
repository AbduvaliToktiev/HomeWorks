package month2;

public class University extends Group{
    public static void main(String[] args) {
        Well well = new Well("Foreign Language", "10.03.2022", 1, "Artem Ivanov Sergeevich");
        System.out.println("Наименование: " + well.getNameWell() + " (Иностранный язык)");
        System.out.println("Дата создания: " + well.getDate() + " года");
        System.out.println("Порядковый номер: " + well.getId());
        System.out.println("ФИО преподователя: " + well.getFullName());
        System.out.println();
        Student student = new Student("03.10.1998", "Ulanov", "Azamat", "male", 24);
        System.out.println("Дата рождения: " + student.getDateBirth() + " года");
        System.out.println("Фамилия: " + student.getSurname());
        System.out.println("Имя: " + student.getName());
        System.out.println("Пол: " + student.getPol() + " (Мужской)");
        System.out.println("Возраст: " + student.getAge() + "  года");
        System.out.println();
        Group group = new Group("10.03.2022", "January, February, March, April, May, June, July, August");
        System.out.println("Дата начала: " + group.startDate + " года");
        System.out.println("Длительность: " + group.duration);
    }
}
