package Tasks.DSA.Problems;

public class main {

//    static int problem_1_missingnumber(int[]  arr){
//       int sum=0;
//       int fullsum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
////        System.out.println(sum);
//        for(int i=1;i<=arr.length+1;i++)
//        {
//            fullsum+=i;
//        }
////        System.out.println(fullsum);
//        int missing_number=fullsum-sum;
//        return missing_number;
//    }

    static int problem_1_missingnumber(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int totalSum= ((arr.length)* (arr.length+1))/2;
        return totalSum-sum;
    }


    public static void main(String[] args){
        int[] arr={0,1,3};
        System.out.println(problem_1_missingnumber(arr));
    }
}
