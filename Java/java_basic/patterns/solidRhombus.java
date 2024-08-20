package java_basic.patterns;

public class solidRhombus {
    public static void sRhombus(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=totRows; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        sRhombus(5);
    }
}
