package java_basic.arrays;

//time complexity here: O(n^3)
public class maxSubArray1 {
    public static void max_sum(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                sum = 0;
                for(int k=start; k<=end; k++){
                    sum += arr[i];
                }
                if (maxSum < sum){
                    maxSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("subarrays Maxsum is: " + maxSum);
    }


    public static void main(String[] args) {

        int arr[] = {24, 65, 65, 66, 765};
        max_sum(arr);
    }
}
