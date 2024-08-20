package java_basic.arrays;

public class linearSearch {
    // linear search : find the INDEX of element in a given array
    public static int linear_search(String clothes[], String key){
        for(int i=0; i<clothes.length; i++){
            if(clothes[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String clothes[] = {"Chinos", "Shirt", "Jeans", "Pant"};
        String key = "Jeans";
        int index = linear_search(clothes, key);
        if (index == -1){
            System.out.println("does not exist");
        }
        else{
            System.out.println("key is at index: " + index);
        }
    }
}
