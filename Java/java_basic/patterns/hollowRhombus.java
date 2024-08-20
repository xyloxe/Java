package java_basic.patterns;

public class hollowRhombus {
    public static void hRhombus(int totRows){

        for(int i=1; i<=totRows; i++){
            //spaces
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=totRows; j++){
                if(i==1 || i==totRows || j==1 || j==totRows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hRhombus(5);
    }
}
