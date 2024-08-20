package java_basic.patterns;

public class invertedHalf {
    public static void inv_half(int totRows){
        for(int i=1; i<totRows; i++){
            //space
            for (int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_half(4);
    }
}
