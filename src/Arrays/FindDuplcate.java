package Arrays;

public class FindDuplcate {
    public static void main(String[] args) {
        int count=0;

        int arr[]={1,2,3,1,2,3,1,2,3,4,5,5,6,9,9,4,4};
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=false;
            for (int k = 0; k < i; k++) {
                if(arr[i]==arr[k]){
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                continue;
            }
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
