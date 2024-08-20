package java_basic.functions;
public class prime {
    // in this there are basic and optimised code to find prime numbers , for prime in range too (basic)


    // public static boolean isPrime(int n){
    //     // int isPrime = true;
    //     for (var i = 2; i <= (n-1); i++){
    //         if (n % i == 0){
    //             return false;
    //         }
    //         else{
    //             return true;
    //         }
    //     }
    //     return true;
    // }

    //only for n<=2
    // public static boolean isPrime(int n){

    //     //corner case: we have to provide special conditions or cases, we dont check them like normal nums
    //     // for 2
    //     if (n ==2){
    //         return true;
    //     }
    //     // boolean isPrime = true;
    //     for (var i = 2; i <= n-1; i++){
    //         if (n % i == 0){
    //             // isPrime = false;
    //             // break; //or
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // optimised code for prime num:

    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (var i=2; i<=Math.sqrt(n); i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }

    //  prime in range
    public static void primeInRange(int n){
        for (var i = 2; i<=n; i++){
            if (isPrime(i)){ // if true
                System.out.print(i + " ");
            }
        }
        System.out.println(); //used to print nextline , you can see the different in compiler while executing it
    }
    public static void main(String[] args) {
        primeInRange(8); // 2 to n
    }
}
