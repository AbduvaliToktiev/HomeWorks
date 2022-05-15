package month2.Lesson17;

import java.util.Arrays;

public class Laptop2 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Hdd hddObject1 = new Hdd();
        Hdd hddObject2 = new Hdd();
        Hdd[] hdds = new Hdd[2];
        hddObject1.setSize(500);
        hddObject1.setSpeed(200);
        hdds[0] = hddObject1;
        hddObject2.setSize(1000);
        hddObject2.setSpeed(400);
        hdds[1] = hddObject2;
        laptop.setHdd(hdds);

        SSD ssd = new SSD();
        ssd.setSize(1000);
        ssd.setModel("HP");
        laptop.setSSD(ssd);

        Os os = new Os();
        os.setName("Windows");
        os.setVersion(11);
        laptop.setOs(os);
        Proc proc2 = new Proc();
        proc2.setModel("e");
        proc2.setCore(4);
        proc2.setFrequency(11);
        laptop.setProc(proc2);

        Person person = new Person();
        person.setFIO("Toktiev Abduvali Azizjanovich");
        person.setLogin("Tokiev7767");
        person.setAge(25);
        person.setPassword("Toktiev7767777");
        person.setAccount(true);
        laptop.setPerson(person);

        System.out.println(laptop.toString());
        System.out.println();

        String[] keyboard = new String[2];
        String keyboardRus = "ё\n" +
                " й ц у к е н г ш щ з х ъ\n" +
                " ф ы в а п р о л д ж э\n" +
                " я ч с м и т ь б ю \n" +
                "";
        String keyboardEng = "`\n" +
                " q w e r t y u i o p [ ]\n" +
                " a s d f g h j k l ; '\n" +
                " z x c v b n m , .";
        keyboard[0] = keyboardRus;
        keyboard[1] = keyboardEng;
        System.out.println(keyboard[0]);
        System.out.println(keyboard[1]);
    }
}


