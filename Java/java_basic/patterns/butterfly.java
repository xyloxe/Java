package java_basic.patterns;

public class butterfly {
    public static void butfly(int totRows){
        for(int i=1; i<=totRows; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=(2*(totRows-i)); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totRows; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=(2*(totRows-i)); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        butfly(8);
    }
}
