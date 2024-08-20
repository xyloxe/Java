package java_basic.functions;
// binary to decimal

public class binaryToDec {
    // 0 1 2 3 4 5 6 7 8 9 = math decimal number system (dec = 10)
    //logic
    // dec = dec + [ld * 2^pow]
    public static void binToDec(int binNum){
        int myNum = binNum; //var to store binary number original value
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){
            int lastDigit = binNum % 10;  //to find last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10; //decreasing binary number
        }
        System.out.println("decimal of " + myNum + " is: " + decNum); //printing decimal number
    }
    public static void main(String[] args) {
        binToDec(1010);
    }
}
