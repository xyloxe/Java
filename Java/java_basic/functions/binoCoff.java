package java_basic.functions;
public class binoCoff {

    // binomial coefficient basic code
    public static int factorial(int n){
        int fact = 1;
        for (var i = 1; i<= n; i++){
            fact*= i;
        }
        return fact;
    }

    public static int bino(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr_fact = factorial(n-r);
        int ncr = fact_n / (fact_r * nmr_fact);
        return ncr;
    }

    public static void main(String[] args) {
        System.out.println(bino(5, 2));
    }
}
