package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static boolean getFirstLine(){
        try {
            File f=new File("text.txt");
            char letter;
            FileReader fr = new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                String[] words=line.split(" ");
                System.out.println(words[0]+","+words[1]);
            }
        }catch(Exception e){
        }
        return true;
    }
    public static void getDevDetails(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(("text.txt")));
            String line;
            int linenumber=0;
            int targetLine=4;
            while((line=br.readLine())!=null){
                if(linenumber==targetLine) {
                    System.out.println(line);
                }
                linenumber++;
            }
            System.out.println(linenumber);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static  void getDevDetailsById(String idNumber){
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line;
            while((line=br.readLine())!=null){
                if(line.contains(idNumber)){
                    System.out.println(line);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {

//       System.out.println(getFirstLine());
//
//        getDevDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User id: ");
        String id=sc.next();
        getDevDetailsById(id);
    }
}
