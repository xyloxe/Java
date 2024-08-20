package java_basic.patterns;

public class floydTriangle {
    public static void floyd(int totRows){
        int counter=1;
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        floyd(5);
    }
}
