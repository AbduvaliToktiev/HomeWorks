package month3.praktik21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data[] data = new Data[5];

        try {
            saveData();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении data");
        }

        try {
            data = readData("data.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при чтение data");
        }

        start(data);

    }

    private static void start(Data[] data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name");
        String parent = scanner.nextLine();
        System.out.println("What's your child's name");
        String child = scanner.nextLine();
        try {
            validate(child, parent, data);
            System.out.println("Good bye");
        } catch (NotParentException | NotChildException | NotYourChildException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String child, String parent, Data[] data) throws NotParentException, NotChildException, NotYourChildException {
        boolean isParent = false;
        boolean isChild = false;
        boolean isHisChild = false;
        for (Data d : data) {
            if (d.getNameOfParent().equals(parent)) {
                isParent = true;
            }
            if (d.getNameOfChild().equals(child)) {
                isChild = true;
            }
            if (d.getNameOfChild().equals(child) && d.getNameOfParent().equals(parent)) {
                isHisChild = true;
            }
        }
        if (!isParent) {
            throw new NotParentException("You are not a parent");
        }

        if (!isChild) {
            throw new NotChildException("Your child is not here");
        }
        if (!isHisChild) {
            throw new NotYourChildException("Not your child");
        }
    }

    private static Data[] readData(String path) throws IOException {
        Data[] data = new Data[5];
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while (scanner.hasNextLine()) {
            data[i] = new Data(scanner.nextLine());
            i++;
        }
        fileReader.close();
        return data;
    }

    private static void saveData() throws IOException {
        FileWriter writer = new FileWriter("data.txt");
        writer.write("Tom/Harry\n");
        writer.write("Bill/Stive\n");
        writer.write("Askar/Malik\n");
        writer.write("Melis/Dastan\n");
        writer.write("Shumkar/Timur\n");
        writer.close();
    }
}




