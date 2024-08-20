package java_basic.arrays;

public class binarySearch {
    public static int binary_search(int numbers[], int key){
        int start = 0;
        int end = (numbers.length - 1);
        while(start <= end){
            int mid = (start + end) / 2;
            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key){ //right
                start = mid +1;
            }
            else{
                end = mid -1;// left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,20,10,20};
        int key = 20;
        int index = binary_search(numbers, key);
        System.out.println("key is at index: " + index);
    }

}
