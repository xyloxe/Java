package java_basic.functions;

public class decToBinary {
    public static void decToBin(int bin){
        int myNum = bin;    
        int binNum = 0;    
        int pow = 0;
        while (bin > 0){
            int rem = bin % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            bin/=2;
        }
        System.out.println("your binary number of " + myNum + " is:" + binNum);
    }
    public static void main(String[] args) {
        decToBin(5);
    }
}
