package Arrays;

import java.util.Arrays;

public class RowColZero {
    public static int[][] rowcolzero(int [][]arr){
        int[][] posarr=arr;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==0){
                    posarr[i][j]=0;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(posarr[i][j]==0) {
                    arr[i][0] = 0;
                    arr[i][1] = 0;
                    arr[i][2] = 0;
                    arr[0][j] = 0;
                    arr[1][j] = 0;
                    arr[2][j] = 0;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,1,1},
                {1,1,1},
                {0,1,1}};
//        System.out.println(arr[1][1]);
        int[][] arr2=rowcolzero(arr);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
