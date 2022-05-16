package month2.Computer;

public class AllComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("TN 1920x1080", "Acer", "Black", 8, "NVIDIA MX330", "English");
        System.out.println("Дисплей: " + computer.getDisplay());
        System.out.println("Марка: " + computer.getBrand());
        System.out.println("Цвет: " + computer.getColor());
        System.out.println("Оперативная память: " + computer.getRAM() + " Gb");
        System.out.println("Видео карта: " + computer.getVideosCard());
        System.out.println("Клавиатура: " + computer.getKeyboard());
        System.out.println();
        Display display = new Display(15.6, "Taiwan", "MVA");
        System.out.println("Дисплей");
        System.out.println("Диагональ: " + display.getDiagonal());
        System.out.println("Производитель: " + display.getManufacturer() + " (Тайвань)");
        System.out.println("Тип матрицы: " + display.getMatrixType());
        System.out.println();
        HDD hdd = new HDD(1000,1);
        System.out.println("Жесткий диск");
        System.out.println("Объем памяти: " + hdd.getMemory() + " Gb");
        System.out.println("Имеет: " + hdd.getDisk()  + " диск");
        System.out.println();
        SSD ssd = new SSD(240, "Taiwan");
        System.out.println("SSD");
        System.out.println("Объем: " + ssd.getMemory() + "Gb");
        System.out.println("Производитель: " + ssd.getBrand1() + " (Тайвань)");
        System.out.println();
        USB usb = new USB(3.0, 3);
        System.out.println("USB");
        System.out.println("Тип порта: " + usb.getPortType());
        System.out.println("id порта: " + usb.getIdPort());
        System.out.println();
        Keyboard keyboard = new Keyboard(true, true);
        System.out.println("Клавиатура");
        System.out.println("Наличие подсветки: " + keyboard.isBacklight());
        System.out.println(" Наличие дополнительных цифр справа: " + keyboard.isAdditionalDigits());
    }
}
