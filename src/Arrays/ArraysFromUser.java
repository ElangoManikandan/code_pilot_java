package Arrays;

import java.util.*;

public class ArraysFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int[] arr=new int[input];
        for(int i=0;i<input;i++){
            int element=sc.nextInt();
            arr[i]=element;
        }
        System.out.println(Arrays.toString(arr));
    }

}
