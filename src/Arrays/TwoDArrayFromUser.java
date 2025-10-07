package Arrays;

import java.util.Scanner;

public class TwoDArrayFromUser {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[][] arr={
            {1,2,3,10},
            {4,5,6,20},
            {7,8,9}};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(j==arr[i].length-1) {
                System.out.print(arr[i][j]);
            }
            else {
                System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println();
    }
//    System.out.println("Reverse Array of Arrays");
//    for(int i=0;i<arr.length;i++){
//        for(int j=arr[i].length-1;j>=0;j--){
//            if(j==0) {
//                System.out.print(arr[i][j]);
//            }else {
//                System.out.print(arr[i][j] + ", ");
//            }
//        }
//        System.out.println();
//    }
//    System.out.println("Reverse Array of Arrays");
//    for(int i= arr.length-1;i>=0;i--)
//    {
//        for (int j = arr[i].length - 1; j >= 0; j--) {
//            if (j == 0) {
//                System.out.print(arr[i][j]);
//            } else {
//                System.out.print(arr[i][j] + ", ");
//            }
//        }
//        System.out.println();
//    }

    System.out.println("Reverse in line");
    for(int i= arr.length-1;i>=0;i--){
        for(int j=arr[i].length-1;j>=0;j--){
                System.out.println(arr[i][j]);
            }
        }
    System.out.println("Print Elements in leading Diagonal in 2D Array");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(i==j){
                System.out.print(arr[i][j]+" ");
            }
            else{
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    System.out.println("Print Elements in Outer layer of 2D array");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(i==0 ||j==0 ){
                System.out.print(arr[i][j]+" ");
            } else if (i== arr[i].length-1||j== arr[i].length-1) {
                System.out.print(arr[i][j]+" ");
            } else{
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    System.out.println("Print Elements in Inner layer of 2D array");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(i==0 ||j==0 ){
                System.out.print("_ ");
            } else if (i== arr[i].length-1||j== arr[i].length-1) {
                System.out.print("_ ");
            } else{
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }

}
}
