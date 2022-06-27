package month3.lesson30;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alfavit2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("Aa\n" + "Bb\n" +
                "Cc\n" + "Dd\n" +
                "Ee\n" + "Ff\n" +
                "Gg\n" + "Hh\n" +
                "Ii\n" + "Jj\n" +
                "Kk\n" + "Ll\n" +
                "Mm\n" + "Nn\n" +
                "Oo\n" + "Pp\n" +
                "Qq\n" + "Rr\n" +
                "Ss\n" + "Tt\n" +
                "Vv\n" + "Ww\n" +
                "Xx\n" + "Yy\n" +
                "Zz\n");
        fileWriter.write("1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n" + "7\n" + "8\n" + "9");
        fileWriter.close();
        int i = 1;
        FileWriter fileWriter2 = new FileWriter("file2.txt");
        FileReader fileReader = new FileReader("file1.txt");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()) {
            if (i % 3 != 0) {
                fileWriter2.write(sc.next());
            }
            System.out.println(i + ": " + sc.nextLine());
            i++;
        }
        fileWriter2.close();
        fileReader.close();


    }
}
