package Tasks.DevDetailsManagementSystem;

import java.io.*;
import java.util.Scanner;

public class Main {
    static int devCount() throws Exception{
            BufferedReader br=new BufferedReader(new FileReader("Developers_list.txt"));
            String line= br.readLine();
            String[] words=line.split("-");
            String countString=words[1];
            int count=Integer.parseInt(countString);
            return count;
    }

    static void incrementCount() throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("Developers_list.txt"));
    }

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("DEVELOPERS MANAGEMENT SYSTEM");
            int d_count=devCount();
            System.out.println("Current Developers Count :"+d_count);
            System.out.println("Enter number of Developers: ");
            int input=sc.nextInt();
            for (int i = 1; i <= input; i++) {
                System.out.println("Enter id (must be a number):");
                if(i==1) {
                    sc.nextLine();
                }
                String idNum = sc.nextLine();
                System.out.println("Enter your name :");
                String name = sc.nextLine();
                String id = "DEV_" + idNum;
                System.out.println("Enter your City :");
                String city = sc.nextLine();
                String developer_details = "\n id: " + id + "," + " Name : " + name + " , City : " + city;
                System.out.println(developer_details);
//              BufferedReader br=new BufferedReader(new FileReader("Developers_list.txt"));
//              int count=1;
                BufferedWriter bw = new BufferedWriter(new FileWriter("Developers_list.txt", true));

                bw.append(developer_details);
//                incrementCount(d_count);
                bw.close();
                System.out.println("Developer "+ i + " added!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
