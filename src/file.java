import java.io.File;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try {
            File f = new File("src/package2/Scanner.txt");
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine())
            {
                System.out.print(reader.nextLine());
            }
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
    }
}
