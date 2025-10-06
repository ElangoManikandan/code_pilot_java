package package2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try {
            File f = new File("src/package2/Scanner.txt");
            FileWriter fw =new FileWriter(f);
            fw.write(123);
            fw.close();
        }catch (Exception E)
        {
            System.out.println(E.getMessage());
        }
    }
}
