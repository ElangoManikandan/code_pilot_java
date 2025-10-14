package Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] arr={23,45,67,89,100};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] revArr=new int[arr.length];
        int count=0;
        for(int i= arr.length-1;i>=0;i--){
            revArr[count]=arr[i];
            count++;
        }
        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i]+" ");
        }

    }
}
