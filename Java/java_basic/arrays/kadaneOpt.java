package java_basic.arrays;

public class kadaneOpt {

    // this one is optimised furher for all negative num, with just one iteartion
    public static void Kadane(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
    
        int cs = 0; // current sum
        int ms = Integer.MIN_VALUE; // max sum
        int maxElement = Integer.MIN_VALUE; // to handle all negative values
    
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
            maxElement = Math.max(maxElement, arr[i]);
        }
    
        // If ms is still negative or zero, use the maximum element
        if (ms <= 0) {
            ms = maxElement;
        }
    
        System.out.println("max sum is: " + ms);
    }
    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2,  1, 5, -3};
        int arr[] = {-2, -3, -3, -4, -1};
        Kadane(arr);
    }
    
}
