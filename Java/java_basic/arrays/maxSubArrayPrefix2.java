package java_basic.arrays;

public class maxSubArrayPrefix2 {


    public static void prefixArr(int arr[]){
            //prefix
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=1; j<arr.length; j++){
                int end = j;
                sum = start == 0 ?  prefix[end] : prefix[end] - prefix[start-1];
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println("max sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        prefixArr(arr);
    }
}
