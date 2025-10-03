package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Java_arrays {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int[] array1={1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        Scanner sc=new Scanner(System.in);
        boolean flag=sc.nextBoolean();
        String name=sc.nextLine();
    }
}
