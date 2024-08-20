package java_basic.patterns;

public class diamond {
    public static void diamondP(int totRows){
        /* this works, but a lil' different 
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i%2 != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }

        for(int i=totRows; i>=1; i--){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i%2 != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        } */

        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totRows; i>=1; i--){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    public static void main(String[] args) {
        diamondP(5);
    }
}
