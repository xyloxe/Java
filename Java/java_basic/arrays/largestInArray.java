package java_basic.arrays;

// import java.util.*;

public class largestInArray {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest in array is: "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {5, 0, 21, 55, 5};
        int large = getLargest(numbers);
        System.out.println("largest in array is: " + large);
    }
}
