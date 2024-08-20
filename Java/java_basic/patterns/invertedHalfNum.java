package java_basic.patterns;

public class invertedHalfNum {
    public static void inv_half_num(int totRows){
        for (int i= 1; i <=totRows; i++){
            for(int j=1; j<=(totRows-i+1); j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_half_num(5);
    }
}
