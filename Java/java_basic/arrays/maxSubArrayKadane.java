package java_basic.arrays;

/**
 * maxSubArrayKadane
 */
public class maxSubArrayKadane {

    public static void Kadane(int arr[]){
        int cs = 0; //current sum
        int ms = Integer.MIN_VALUE; //max sum

        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        if (ms <= 0) { 
            ms = arr[0]; // well it can be optimised further, so that no need to initialise this line heh...
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > ms) {
                    ms = arr[i];
                }
            }
        }


//more optimsed way for all neagtive nums: 
// int maxElement = Integer.MIN_VALUE; // to handle all negative values
// maxElement = Math.max(maxElement, arr[i]);
 // If ms is still negative or zero, use the maximum element
//  if (ms <= 0) {
//     ms = maxElement;
// }


        System.out.println("max sum is: " +ms );
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2,  1, 5, -3};
        // int arr[] = {-2, -3, -3, -4, -1};
        Kadane(arr);
    }
}