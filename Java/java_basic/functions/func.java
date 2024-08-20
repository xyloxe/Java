package java_basic.functions;
import java.util.*;
// basic function creation in which user drop input
public class func {

    public static int  test(int num1, int num2){
        return num1+num2;
    }
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(test(a,b));
    }
}
    
}